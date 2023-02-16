package com.hspedu.abstract_;

public class AbstractDetails01 {
    public static void main(String[] args) {
        //new A();  抽象类不能被实例化
    }
}
abstract class A{
    public void hi(){
        System.out.println("hi");
    }
}
//一旦类包含了abstract方法，则这个类必须声明为abstract
abstract class B{
    public abstract void hi();
}
//abstract 只能修饰类和方法，不能修饰属性和其它的
class C{
    //public abstract int n1 = 1;
}