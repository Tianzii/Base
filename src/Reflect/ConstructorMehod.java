package Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

class hello {
	public hello() {
		System.out.println("animal");
	}

	public void get() {
		System.out.println("get it");
	}
}

class world extends hello {
	public world() {
		System.out.println("dog");
	}

	public void set() {
		System.out.println("set");
	}
}

public class ConstructorMehod {
	public static void main(String[] args) throws Exception {
		Constructor<?> constructor[] = hello.class.getDeclaredConstructors();
		System.out.println(constructor[0].getName());

		Class<?> clazz = Class.forName("Reflect.hello"); // Class.forName要全限定名(包.类)
		hello h = (hello) clazz.newInstance(); // 创建实例对象，会执行构造方法
		Method method = hello.class.getMethod("get"); // 获取方法
		method.invoke(h); // 调用对象方法
	}
}
