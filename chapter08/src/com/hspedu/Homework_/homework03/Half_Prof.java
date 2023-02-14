package com.hspedu.Homework_.homework03;

public class Half_Prof extends Teather{
    public Half_Prof(String name, int age, String post, double salary, double grade) {
        super(name, age, post, salary, grade);
    }
    public void introduce(){
        System.out.println("这是副教授信息");
        super.introduce();
    }
}
