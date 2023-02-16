package com.hspedu.innerclass;

/**
 * 演示匿名内部类
 */
public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.method();
    }
}

class Outer04 {
    private int n1 = 10;

    public void method() {
        //1.需求：想使用IA接口，并创建对象
        //2.传统方式，是写一个类，实现该接口，并创建对象
        //3.现在要求 Tiger 类只使用一次，后面在不使用
        //4.可以使用 匿名内部类 来简化开发
        //5.tiger的编译类型 ？ IA
        //6.tiger的运行类型 ？ 匿名内部类 xxx->Outer04$1
        /*
            我们看底层 会分配 类名 Outer04$1
            class Outer04$1 implements IA{
                @Override
                public void cry() {
                    System.out.println("老虎叫唤...");
                }
            }
         */
        //7.JDK底层在创建匿名内部类 Outer04$1，立即马上创建了 Outer04$1实例，并且把地址返回给tiger
        //8.匿名内部类使用一次，就不能再使用
        IA tiger = new IA(){
            @Override
            public void cry() {
                System.out.println("老虎叫唤...");
            }
        };
        System.out.println(tiger.getClass());
        tiger.cry();
//        IA tiger = new Tiger();
//        tiger.cry();
        //演示基于类的匿名内部类
        //1. father 编译类型 Father
        //2. father 运行类型 Outer04$2
        //3. 底层会创建匿名内部类
        /*
            class Outer04$2 implements Father{
                @Override
                public void test() {
                    System.out.println("匿名内部类重写了test方法");
                }
            }
         */
        //4. 同时也直接返回了 匿名内部类 Outer04$2
        Father father = new Father("jack") {
            @Override
            public void test() {
                System.out.println("匿名内部类重写了test方法");
            }
        };
        father.test();
        System.out.println("father对象的运行类型=" + father.getClass());

        Animal animal = new Animal() {
            @Override
            public void eat() {
                super.eat();
            }
        };
        animal.eat();

    }
}

interface IA {
    void cry();
}

//class Tiger implements IA {
//    @Override
//    public void cry() {
//        System.out.println("老虎叫唤...");
//    }
//}
//
//class Dog implements IA {
//    @Override
//    public void cry() {
//        System.out.println("小狗汪汪叫...");
//    }
//}

class Father {
    public Father(String name) {
        System.out.println("接收到的name=" + name);
    }

    public void test() {
    }
}

abstract class Animal {
    public void eat() {
        System.out.println("小狗吃骨头...");
    }
}