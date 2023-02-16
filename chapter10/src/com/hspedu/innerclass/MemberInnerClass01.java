package com.hspedu.innerclass;

public class MemberInnerClass01 {
    public static void main(String[] args) {
        Outer08 outer08 = new Outer08();
        outer08.ti();
        //外部其他类，使用成员内部类的三种方法
        Outer08.Inner08 inner08 = outer08.new Inner08();
        inner08.say();
        //第二种方法 在外部类中，编写一个方法，可以返回 Inner08
        Outer08.Inner08 inner08Instance = outer08.getInner08Instance();
        inner08Instance.say();
        //第三种方法


    }
}

class Outer08 {
    private int n1 = 10;
    public String name = "张三";

    private void hi() {
        System.out.println("hi()方法...");
    }

    public class Inner08 {
        private double sal = 99.9;
        public void say() {
            System.out.println("n1=" + n1 + " name=" + name);
            hi();
        }
    }
    public Inner08 getInner08Instance(){
        return new Inner08();
    }

    public void ti(){
        Inner08 inner08 = new Inner08();
        inner08.say();
        System.out.println(inner08.sal);
    }

}
