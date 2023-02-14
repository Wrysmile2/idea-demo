package com.hspedu.extend_.import_;

public class Sub extends Base {  //子类
    public Sub() {  //无参构造器
        //super(); //默认调用父类的无参构造器
        //super("smith");  //super必须放在构造器最前面
        System.out.println("子类sub()构造器被调用...");
    }

    public Sub(String name) {
        super("tom");
        System.out.println("子类sub(String name)构造器被调用...");
    }

    public Sub(String name, int age) {
        super("java",35);
        System.out.println("子类sub(String name,int age)构造器被调用...");
    }

    public void sayOk() { //子类方法
        //非私有的属性和方法可以在子类直接访问
        //但私有方法不能在子类访问
        System.out.println(n1 + " " + n2 + " " + n3);
        test100();
        test200();
        test300();
        //要通过父类提供的方法去访问
        System.out.println("n4=" + getN4());
        calltest400();
    }

}
