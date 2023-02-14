package com.hspedu.super_;

public class B extends A {
    //访问父类属性或方法,但不能访问private属性或方法
    public void h1() {
        System.out.println(super.n1 + " " + super.n2 + " " + super.n3);
    }
    public void test(){
        System.out.println("super.n1="+super.n1);
        super.cal();
    }

    public void sum() {
        System.out.println("B类的sum方法...");
        //希望调用父类-A的 cal方法
        //这时，因为子类B没有cal方法，因此可以用下面三种方式
        //(1)先找本类，如果有，则调用
        //(2)如果没有，则找父类(如果有，并可以调用，则调用)
        //(3)如果父类没有，则继续找父类，知道Object类
        cal();
        //this.cal();  //等价于cal
        //super.cal();  //找cal方法的顺序是直接查找父类，其他规则一样
    }
    public void cal() {
        System.out.println("B类的cal方法...");
    }

    public void h2() {
        super.test100();
        super.test200();
        super.test300();
        //super.test400();
    }

}
