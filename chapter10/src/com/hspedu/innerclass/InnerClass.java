package com.hspedu.innerclass;

public class InnerClass {
    public static void main(String[] args) {

    }
}

@SuppressWarnings({"all"})
class Outer {
    private int n1 = 100;  //属性

    public Outer(int n1) {  //构造器
        this.n1 = n1;
    }

    public void m1() {  //方法
        System.out.println("m1()方法..");
    }

    {//代码块
        System.out.println("代码块...");
    }
    class inner{  //内部类

    }
}
