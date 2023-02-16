package com.hspedu.abstract_;

public class Abstract01 {
}
abstract class Animal{
    private String name;

    public Animal(String name) {
        this.name = name;
    }
    //这里的eat 这里你实现了，其实没什么意义
    //即：父类方法不确定性的问题
    //考虑将该方法设计为抽象(abstract)方法
    //s所谓抽象方法就是没有实现的方法
    //当一个类中存在抽象方法时，需要将该类声明为abstract类
    //一般来说，抽象类会被继承，有其子类实现抽象方法
//    public void eat(){
//        System.out.println("这是一个动物，但是不知道吃什么..");
//    }
      public abstract void eat();  //不用写方法
}
