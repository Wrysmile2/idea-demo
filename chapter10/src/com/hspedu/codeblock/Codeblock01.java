package com.hspedu.codeblock;

public class Codeblock01 {
    public static void main(String[] args) {
        Movie movie = new Movie("你好，李焕英");
        System.out.println("=======================");
        new Movie("唐探3",100,"张三");
    }
}
class Movie{
    private String name;
    private double price;
    private String director;
    //3个构造器->重载
    //下面的构造器都有相同的语句这样代码看起来比较冗余，这时我们可以把相同的语句放在一个代码块里，即可
    //这样我们不管调用哪个构造器，创建对象，都会先调用代码块的内容
    //代码块调用的顺序优先于构造器
    static {
        System.out.println("电影屏幕打开...");
        System.out.println("广告开始...");
        System.out.println("电影正式开始...");
    }
    public Movie(String name) {
        System.out.println("Movie(String name) 被调用..");
        this.name = name;
    }

    public Movie(double price, String director) {
        this.price = price;
        this.director = director;
    }

    public Movie(String name, double price, String director) {
        System.out.println("Movie(String name, double price, String director) 被调用..");
        this.name = name;
        this.price = price;
        this.director = director;
    }
}
