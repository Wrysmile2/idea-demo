package com.hspedu.Homework_.homework03;

public class Professor extends Teather{
    public Professor(String name, int age, String post, double salary, double grade) {
        super(name, age, post, salary, grade);
    }

    public void introduce(){
        System.out.println("这是教授的信息");
        super.introduce();
    }

}
