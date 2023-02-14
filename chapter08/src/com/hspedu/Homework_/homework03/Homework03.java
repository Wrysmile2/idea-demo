package com.hspedu.Homework_.homework03;

public class Homework03 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Jack", 30, "教授", 20000, 1.3);
        professor1.introduce();
        Half_Prof professor2 = new Half_Prof("Smith", 25, "副教授", 15000, 1.2);
        professor2.introduce();
        lecturer professor3 = new lecturer("Milan", 23, "讲师", 12000, 1.1);
        professor3.introduce();
    }
}

