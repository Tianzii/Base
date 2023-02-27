package demo;

class Bowl
{
    // 构造方法
    Bowl(int marker)
    {
        System.out.println("Bowl(" + marker + ")");
    }
}

class Tableware
{
    // 静态变量
    static Bowl bowl7 = new Bowl(7);

    // 静态代码块
    static {
        System.out.println("Tableware静态代码块");
    }

    // 构造方法
    Tableware()
    {
        System.out.println("Tableware构造方法");
    }

    // 成员变量
    Bowl bowl6 = new Bowl(6);
}

// Tableware子变量
class Table extends Tableware
{
    // 构造代码块1
    {
        System.out.println("Table非静态代码块_1");
    }

    // 成员变量
    Bowl bowl5 = new Bowl(5); // 9

    // 构造代码块2
    {
        System.out.println("Table非静态代码块_2");
    }

    // 类变量
    static Bowl bowl1 = new Bowl(1);

    // 静态代码块
    static {
        System.out.println("Table静态代码块");
    }

    // 构造方法
    Table()
    {
        System.out.println("Table构造方法");
    }

    // 类变量
    static Bowl bowl2 = new Bowl(2);
}

class Cupboard extends Tableware
{
    // 成员变量
    Bowl bowl3 = new Bowl(3);
    // 类变量
    static Bowl bowl4 = new Bowl(4);

    // 构造方法
    Cupboard()
    {
        System.out.println("Cupboard构造方法");
    }

    // 成员方法
    void otherMethod(int marker)
    {
        System.out.println("otherMethod(" + marker + ")");
    }

    // 类变量
    static Bowl bowl5 = new Bowl(5);
}

public class StaticInitialization
{
    public static void main(String args[])
    {
        String s = new String("nihao");
        System.out.println(s);
        System.out.println("main()");
        cupboard.otherMethod(1);
    }

    // 类变量*2
    static Table table = new Table();
    static Cupboard cupboard = new Cupboard();
}