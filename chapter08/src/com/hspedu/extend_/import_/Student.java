package com.hspedu.extend_.import_;
//父类，是Pupil和Graduate的父类
public class Student {
    //公有属性
    public String name;
    public int age;
    private double score;
    //公有方法
    public void setScore(double score) {
        this.score = score;
    }
    public void showinfo() {
        System.out.println("学生名：" + name + " 年龄：" + age + " 成绩" + score);
    }
}
