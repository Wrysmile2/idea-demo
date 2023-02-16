package com.hspedu.main_;

public class Main01 {
    private static String name = "hello world";
    public static void h1(){
        System.out.println("h1 中的 hello world");
    }
    public static void main(String[] args) {
        //静态方法main可以访问本类的静态成员
        System.out.println(name);
        h1();
        //不能直接访问非静态方法，需要先创建对象，在调用
        Main01 main01 = new Main01();
        System.out.println(main01.n);
        main01.h2();
    }
    private int n = 100;
    private void h2(){
        System.out.println("h2 中的 hello world");
    }
}
