package Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 创建person接口
 */
interface Person
{
	// 交作业
	void giveTask();
}

/**
 * 学生类
 * @author Tian
 * @since  2023-03-01 13:54:54
 */
class Student implements Person
{
	private String name;

	public Student(String name)
	{
		this.name = name;
	}

	public void giveTask()
	{
		System.out.println(name + "交语文作业");
	}
}

/**
 * 
 * @author Tian
 * @since  2023-03-01 13:55:55
 */
class StuInvocationHandler<T> implements InvocationHandler
{
	// invocationHandler持有的被代理对象
	T target;

	public StuInvocationHandler(T target)
	{
		this.target = target;
	}

	/**
	 * proxy:代表动态代理对象
	 * method：代表正在执行的方法
	 * args：代表调用目标方法时传入的实参
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
	{
		System.out.println("代理执行" + method.getName() + "方法");
		Object result = method.invoke(target, args);
		return result;
	}
}

/**
 * 代理类
 * @author Tian
 * @since  2023-03-01 13:56:43
 */
public class ProxyTest
{
	public static void main(String[] args)
	{

		// 创建一个实例对象，这个对象是被代理的对象
		Person linqian = new Student("林浅");

		// 创建一个与代理对象相关联的InvocationHandler
		InvocationHandler stuHandler = new StuInvocationHandler<Person>(linqian);

		// 创建一个代理对象stuProxy来代理linqian，代理对象的每个执行方法都会替换执行Invocation中的invoke方法
		Person stuProxy = (Person) Proxy.newProxyInstance(Person.class.getClassLoader(),
				new Class<?>[] { Person.class }, stuHandler);

		// 代理执行交作业的方法
		stuProxy.giveTask();
	}
}