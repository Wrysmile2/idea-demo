package com.hspedu.extend_;

public class Extends01 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name=  "小明";
        pupil.age=12;
        pupil.testing();
        pupil.setScore(60);
        pupil.showinfo();

        System.out.println("============");

        Graduate graduate = new Graduate();
        graduate.name = "大明";
        graduate.age = 20;
        graduate.testing();
        graduate.setScore(100);
        graduate.showinfo();
    }
}
