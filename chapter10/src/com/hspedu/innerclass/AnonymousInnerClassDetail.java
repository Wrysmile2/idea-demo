package com.hspedu.innerclass;

public class AnonymousInnerClassDetail {
    public static void main(String[] args) {
        Outer05 outer05 = new Outer05();
        outer05.f1();
        System.out.println("main outer05 hashcode=" + outer05);
    }
}

class Outer05 {
    private int n1 = 99;

    public void f1() {
        //创建一个内部类
        Person person = new Person() {
            private int n1 = 88;

            @Override
            public void hi() {
                System.out.println("匿名内部类重写了 hi方法的n1=" + n1 + " 外部类的n1=" + Outer05.this.n1);
                System.out.println("main outer05 hashcode=" + Outer05.this);
            }
        };
        person.hi();  //动态绑定，运行类型是 Outer05$1

        //也可以直接调用
        new Person() {
            @Override
            public void hi() {
                System.out.println("匿名内部类重写了 hi方法...");
            }

            @Override
            public void ok(String str) {
                super.ok(str);
            }
        }.ok("jack");


    }
}

class Person {
    public void hi() {
        System.out.println("Person hi()...");
    }

    public void ok(String str) {
        System.out.println("Person ok() " + str);
    }
}

