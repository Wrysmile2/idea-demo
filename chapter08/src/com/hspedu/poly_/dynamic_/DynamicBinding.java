package com.hspedu.poly_.dynamic_;
//java的动态绑定机制
//(1)当调用对象方法的时候，该方法会和该对象的内存地址/运行类型绑定
//(2)当调用对象属性时，没有动态绑定机制，哪里声明，哪里使用
public class DynamicBinding {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.sum());
        System.out.println(a.sum1());
    }
}
class A {
    public int i = 10;
    public int sum() {
        return get1() + 10;
    }
    public int sum1() {
        return i + 10;
    }
    public int get1() {
        return i;
    }
}

class B extends A {
    public int i = 20;
    //如果注释掉sum 结果会怎样？
//    public int sum() {
//        return i + 20;
//    }
    public int get1() {
        return i;
    }
    //如果注释掉sum1 结果会怎样？
//    public int sum1() {
//        return i + 10;
//    }
}

