package com.hspedu.codeblock;

public class CodeBlockDetail04 {
    public static void main(String[] args) {
        B02 b02 = new B02();
    }
}

class A02 {
    private static int n1 = getVal01();

    static {
        System.out.println("A02的一个静态代码块..");
    }

    {
        System.out.println("A02的第一个普通代码块..");

    }

    private int n3 = getVal02();

    public static int getVal01() {
        System.out.println("getVal01静态方法");
        return 10;
    }

    private int getVal02() {
        System.out.println("getVal02方法");
        return 10;
    }

    public A02() {
        System.out.println("A02的构造器");
    }
}

class B02 extends A02 {
    private static int n3 = getVal03();

    static {
        System.out.println("B02的一个静态代码块..");
    }

    public int n5 = getVal04();

    {
        System.out.println("B02的第一个普通代码块..");
    }

    public static int getVal03() {
        System.out.println("getVal03静态方法");
        return 10;
    }

    public int getVal04() {
        System.out.println("getVal04方法");
        return 10;
    }

    public B02() {
        //隐藏了 super() 和 普通代码块
        System.out.println("B02的构造器");
        // TODO Auto-generated constructor stub
    }
}

