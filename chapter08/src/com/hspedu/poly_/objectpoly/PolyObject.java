package com.hspedu.poly_.objectpoly;

public class PolyObject {
    public static void main(String[] args) {
        //对象多态
        //animal 编译类型就是 Animal，运行类型 Dog
        Animal animal = new Dog();
        animal.cry();
        //animal 编译类型就是 Animal，运行类型 Cat
        animal = new Cat();
        animal.cry();
    }
}
