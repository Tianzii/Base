package Reflect;

import java.lang.reflect.Field;

interface I1
{
}

interface I2
{
}

class Cell
{
	public int mCellPublic;
}

class Animal extends Cell
{
	private int mAnimalPrivate;
	protected int mAnimalProtected;
	int mAnimalDefault;
	public int mAnimalPublic;
	private static int sAnimalPrivate;
	protected static int sAnimalProtected;
	static int sAnimalDefault;
	public static int sAnimalPublic;
}

class Dog extends Animal implements I1, I2
{
	private int mDogPrivate;
	public int mDogPublic;
	protected int mDogProtected;
	private int mDogDefault;
	private static int sDogPrivate;
	protected static int sDogProtected;
	static int sDogDefault;
	public static int sDogPublic;
}

class People
{
	private String name;
	private int age;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}
}

public class ClassField
{
	public static void main(String[] args) throws IllegalAccessException, InstantiationException
	{
		Class<Dog> dog = Dog.class;
		// 类名打印
		System.out.println(dog.getName()); // Reflect.Dog
		System.out.println(dog.getSimpleName()); // Dog
		System.out.println(dog.getCanonicalName());// Reflect.Dog
		// 判断是否为接口
		System.out.println(dog.isInterface()); // false
		for (Class<?> iI : dog.getInterfaces())
		{
			/*
			 * interface Reflect.I1 interface Reflect.I2
			 */
			System.out.println(iI);
		}

		// 打印父类名
		System.out.println(dog.getSuperclass());// class Reflect.Animal
		// 创建实例对象
		Dog d = dog.newInstance();
		/*
		 * mDogPublic sDogPublic mAnimalPublic sAnimalPublic mCellPublic
		 * 获取字段，父类的公共字段也会打印出来了
		 */
		for (Field f : dog.getFields())
		{
			System.out.println(f.getName());
		}

		System.out.println("---------");
		/*
		 * 只有自己类声明的字段 mDogPrivate mDogPublic mDogProtected mDogDefault sDogPrivate
		 * sDogProtected sDogDefault sDogPublic
		 */
		for (Field f : dog.getDeclaredFields())
		{
			System.out.println(f.getName());
		}

		System.out.println("---------");

		// 打印字段
		Field[] field = People.class.getDeclaredFields();
		for (Field field2 : field)
		{
			System.out.println(field2.getName());
		}
	}
}