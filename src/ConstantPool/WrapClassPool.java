package ConstantPool;

public class WrapClassPool {

	static Integer int1 = new Integer(127);
	static Integer int2 = new Integer(127);

	static Integer int3 = 127;
	static Integer int4 = 127;

	static Integer int5 = 128;
	static Integer int6 = 128;

	static boolean diff(Integer... ints) {
		if (ints[0] == ints[1]) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println(diff(int1, int2)); // false，int1和int2是两个对象，相当于两个人拿着一样的东西
		System.out.println(diff(int3, int4)); // true，int3和int4会从常量池中引用127这个Integer对象
		System.out.println(diff(int5, int6)); // false，Integer常量池默认范围 [-128,127]
	}

}
