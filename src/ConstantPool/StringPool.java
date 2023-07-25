package ConstantPool;

public class StringPool {
	static String s1 = "1";
	static String s2 = "1";

	static String s3 = new String("1");
	static String s4 = new String("1");

	static boolean diff(String... strs) {
		if (strs[0] == strs[1]) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println(diff(s1, s2)); // true，因为"1"在s1时已经添加到字符串常量池中了，所以s2会先引用"1"这个String对象
		System.out.println(diff(s3, s4)); // false，因为s3和s4是引用创建的两个"1"String对象
		// 此时字符串常量池中有“1”，堆中有两个“1”String对象
	}
}
