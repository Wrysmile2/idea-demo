package com.hspedu.poly_.detail_;

import com.hspedu.modifier.A;

public class PolyDetail {
    public static void main(String[] args) {
        //向上转型：父类的引用指向了子类的对象
        //语法：父类类型引用名 = new 子类类型()
        Animal animal = new Cat();
        Object obj = new Cat();
        //可以调用父类的所有成员(要遵循访问原则)
        //但是不能调用子类特有的成员,因为在编译阶段，能调用哪些成员，是由编译类型决定的
        //animal.catchMouse  :错误
        //最终运行效果看子类(运行类型)的具体实现，及调用方法时，按照从子类(运行类型)
        //！！注意：调用方法的最终的效果看 运行类型 ，调用属性的最终的效果看编译类型 ！！
        //开始查找方法，然后调用
        animal.eat();
        animal.run();
        animal.sleep();

        //多态的向下转型
        Cat cat = (Cat) animal;
        cat.catchMouse();
        Animal animal02 = new Dog();
        Dog dog = (Dog) animal02;
        animal02.eat();
        dog.huskies();

    }
}
