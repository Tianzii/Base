package Reflect;

import java.lang.reflect.Field;

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

public class Reflect
{
	public static void main(String[] args)
	{
		Field[] field = People.class.getDeclaredFields();
		for (Field field2 : field)
		{
			System.out.println(field2);
		}
	}
}