package com.hspedu.abstract_;

public class AbstractDetails02 {
    public static void main(String[] args) {
        F f = new F();
        f.hi();
    }
}
//抽象方法不能使用private、final 和 static 来修饰，因为这些关键字都是和重写相违背的
abstract class H{
    public abstract void hi();  //抽象方法
}

//如果一个类继承了抽象类，则它必须实现抽象类的所有方法，除非他也声明为abstract类
//抽象类的本质还是类，所有可以有类的各种成员
abstract class E {
    public abstract void hi();
}

class F extends E{
    @Override
    public void hi() {  //这里相当于G子类实现了父类的抽象方法，所为实现方法，就是有方法体
        System.out.println("实现了hi方法..");
    }
}

abstract class D {
    public int n1 = 10;
    public static String name = "hello";

    public void hi() {
        System.out.println("hi");
    }

    public abstract void hello();

    public static void ok() {
        System.out.println("ok");
    }

}
