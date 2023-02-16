package com.hspedu.static_;

@SuppressWarnings({"all"})
public class ChildGame {
    public static void main(String[] args) {
        int count = 0;
        Child child1 = new Child("小米");
        child1.join();
        //count++;
        child1.count++;
        Child child2 = new Child("小强");
        child2.join();
        child2.count++;
        Child child3 = new Child("小明");
        child3.join();
        child3.count++;
        //类变量，可以通过类名来访问
        System.out.println("共有" + Child.count + "名小孩加入了游戏");
    }
}

class Child {
    private String name;
    //定义一个变量 count ，是一个类变量(静态变量) static 静态
    //改变量最大的特点就是会被Child 类的所有的对象实列共享
    public static int count = 0;

    public Child(String name) {
        this.name = name;
    }

    public void join() {
        System.out.println(name + " 加入了游戏");
    }
}
