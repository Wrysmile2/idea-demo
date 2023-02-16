package com.hspedu.final_;

public class FinalExercise01 {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("面积=" + circle.calArea());
    }
}

@SuppressWarnings({"all"})
class Circle {
    private double radius;
    //可以在 构造器 代码块 赋值
    private final double PI = 3.14;

    //构造器
    public Circle(double radius) {
        this.radius = radius;
        //PI = 3.14;
    }

    //代码块    {PI = 3.14;}
    public double calArea() {
        return PI * radius * radius;
    }
}
