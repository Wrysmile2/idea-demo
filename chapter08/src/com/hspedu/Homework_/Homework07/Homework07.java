package com.hspedu.Homework_.Homework07;

public class Homework07 {
    public static void main(String[] args) {
        new Demo().test();
        new Demo("john").test();
    }
}
class Test{
    String name = "Rose";
    Test(){
        System.out.println("Test");
    }
    Test(String name){
        this.name = name; //这里吧Rose改成了john
    }
}
class Demo extends Test{
    String name = "jack";
    Demo(){
        super();
        System.out.println("Demo");
    }
    Demo(String s){
        super(s);
    }
    public void test(){
        System.out.println(super.name);
        System.out.println(this.name);
    }
}
