package com.hspedu.single_;

public class SingleTon02 {
    public static void main(String[] args) {
        //System.out.println(Cat.n1);
        Cat instance = Cat.getInstance();
        System.out.println(instance);
        //再次调用
        Cat instance1 = Cat.getInstance();
        System.out.println(instance1);
        System.out.println(instance == instance1);
    }
}

class Cat {
    private String name;
    //1.仍然将构造器私有化
    //2.定义一个static静态属性
    //3.提供一个public的static方法，可以返回一个Cat对象
    private static int n1 = 999;
    private static Cat cat;

    private Cat(String name) {
        System.out.println("构造器被调用..");
        this.name = name;
    }

    public static Cat getInstance() {
        if (cat == null) {  //如果还没有创建
            cat = new Cat("小可爱");
        }
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
