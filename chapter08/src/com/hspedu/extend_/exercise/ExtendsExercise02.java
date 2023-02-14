package com.hspedu.extend_.exercise;

public class ExtendsExercise02 {
    public static void main(String[] args) {
        CC cc = new CC();
    }
}

class AA {
    public AA() {
        System.out.println("我是A类");
    }
}

class BB extends AA {
    public BB() {
        System.out.println("我是B类的无参构造");
    }

    public BB(String name) {
        System.out.println("我是B类的有参构造");
    }
}

class CC extends BB {
    public CC() {
        this("hello");
        System.out.println("我是C类的无参构造");
    }

    public CC(String name) {
        super("java");
        System.out.println("我是C类的有参构造");
    }
}

