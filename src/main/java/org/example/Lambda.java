package org.example;

/**
 * Hello world!
 *
 */

interface demo{
    public void a1();
}

class demo1{

    public void a2(){
        System.out.println("nihao2");
    }

    public void a3(){
        System.out.println("nihao3");
    }
}

public class Lambda
{
    public static void main( String[] args )
    {
        demo1 demo1 = new demo1();
        demo demo = demo1::a3; // 相当于为a1方法定义了方法体
        demo.a1();
    }
}
