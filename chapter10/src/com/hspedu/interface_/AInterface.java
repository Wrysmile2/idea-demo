package com.hspedu.interface_;

public interface AInterface {
    //可以写 属性 方法
    public int n1 = 10;
    //再接口中抽象方法可以省略 abstract
    public void hi();
    //在JDK8以后可以默认实现方法，需要使用default关键字
    default public void ok(){
        System.out.println("ok()...");
    }
    //在JDK8以后可以使用静态方法
    public static void cry(){
        System.out.println("cry()方法...");
    }
}
