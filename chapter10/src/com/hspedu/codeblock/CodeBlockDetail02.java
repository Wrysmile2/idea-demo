package com.hspedu.codeblock;

public class CodeBlockDetail02 {
    public static void main(String[] args) {
        A a = new A();
    }
}

class A {
    public int n2 = getN2();

    {
        System.out.println("A 普通代码块02..");
    }

    private static int n1 = getN1();

    static {
        System.out.println("A 静态代码块01..");
    }

    public static int getN1() {
        System.out.println("getN1静态方法被调用..");
        return 100;
    }

    public int getN2() {
        System.out.println("getN2方法被调用..");
        return 200;
    }

    //无参构造器 最后被调用
    public A() {
        System.out.println("A 构造器被调用..");
    }
}
