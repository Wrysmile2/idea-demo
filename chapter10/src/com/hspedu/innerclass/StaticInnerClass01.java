package com.hspedu.innerclass;

public class StaticInnerClass01 {
    public static void main(String[] args) {
        Outer10 outer10 = new Outer10();
        outer10.m1();
        //访问其他类 使用静态内部类
        //方式1
        Outer10.Inner10 inner10 = new Outer10.Inner10();
        inner10.say();
        //方式2
        //编写一个方法，可以返回对象内的静态实例
        Outer10.Inner10 inner101 = outer10.getInner10();
        inner101.say();

    }
}

@SuppressWarnings({"all"})
class Outer10 {
    private int n1 = 10;
    private static String name = "张三";

    static class Inner10 {
        public void say() {
            System.out.println(name);
        }
    }

    public void m1() {
        Inner10 inner10 = new Inner10();
        inner10.say();
    }

    public Inner10 getInner10() {
        return new Inner10();
    }
}
