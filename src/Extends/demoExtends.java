package Extends;

abstract class demo {
	public demo() {
		// TODO Auto-generated constructor stub
		System.out.println("ceshi");
	}
}

class demo1 extends demo {

}

// 抽象类可以有多个继承
class demo2 extends demo {

}

public class demoExtends {
	public static void main(String[] args) {
		demo1 d = new demo1();
	}
}
