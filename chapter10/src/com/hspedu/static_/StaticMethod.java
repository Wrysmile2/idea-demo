package com.hspedu.static_;

public class StaticMethod {
    public static void main(String[] args) {
        Stu tom = new Stu("tom");
        Stu.payFee(100);
        //Stu jack = new Stu("jack");
        Stu.payFee(200);
        Stu.shoFee();
        System.out.println("9开平方的结果是=" + Math.sqrt(9));
        System.out.println(MyTools.calSum(10,20));
        //静态方法只能访问静态成员
        //非静态方法能访问静态成员和非静态成员
    }
}

class MyTools {
    public static double calSum(double n1, double n2) {
        return n1 + n2;
    }
}

class Stu {
    private String name;
    private static double fee = 0;

    public Stu(String name) {
        this.name = name;
    }

    public static void payFee(double fee) {
        Stu.fee += fee;
    }

    public static void shoFee() {
        System.out.println("总学费=" + Stu.fee);
    }
}
