package com.hspedu.object_;

public class Equals01 {
    public static void main(String[] args) {
        A a = new A();
        A b = a;
        A c = b;
        System.out.println(b == c);
        System.out.println(a == c);
        B obj = a;
        System.out.println(obj == c);
        int num1 = 10;
        double num2 = 10;
        System.out.println(num1 == num2);

        "hello".equals("abc");
        Integer integer = new Integer("hello");
    }
}

class A extends B {}

class B {}