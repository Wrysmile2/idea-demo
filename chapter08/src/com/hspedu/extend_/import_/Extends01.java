package com.hspedu.extend_.import_;

import com.hspedu.extend_.Graduate;
import com.hspedu.extend_.Pupil;

public class Extends01 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name=  "小强";
        pupil.age=11;
        pupil.testing();
        pupil.setScore(60);
        pupil.showinfo();

        System.out.println("============");

        Graduate graduate = new Graduate();
        graduate.name = "大强";
        graduate.age = 21;
        graduate.testing();
        graduate.setScore(100);
        graduate.showinfo();
    }
}
