package This;

public class DemoThis {
	private int id;
	public String name;
	protected long age;

	// 在构造方法中this代表正在初始化的对象
	public DemoThis() {
		this.id = 1;
		this.name = "zhangsan";
	}

	// this()代表当前类的构造函数
	public DemoThis(int id, String name) {
		this();
		System.out.println(id + name);
	}

	// 在实例方法中this代表当前类的对象
	public Object getobject() {
		return this;
	}

	// 在实例方法中this可以调用类字段和方法
	public void set(String name, long age) {
		this.name = name;
		this.age = age;
		System.out.println(this.name + this.age);
	}

	public static void main(String[] args) {
		DemoThis demo = new DemoThis();
		DemoThis demo1 = new DemoThis(1, "张三");
		DemoThis demo2 = (DemoThis) demo.getobject();
		System.out.println(demo.id + demo.name);
		System.out.println(demo1.id + demo1.name); // 因为含参DemoThis()构造函数条用this无参构造函数，所以类字段值为1zhangsan
		demo1.set("李四", 20);
	}
}
