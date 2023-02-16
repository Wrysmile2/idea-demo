package com.hspedu.single_;

public class SingleTon01 {
    public static void main(String[] args) {
//        GirlFriend xh = new GirlFriend("小红");
//        GirlFriend xb = new GirlFriend("小白");
        //通过方法可以获取对象
        GirlFriend instance = GirlFriend.getInstance();
        System.out.println(instance);
        System.out.println(instance);


    }
}

class GirlFriend {

    private String name;
    //为了能够在静态方法中，返回gf对象，需要将其修饰为static
    private static GirlFriend gf = new GirlFriend("小红花");
    //如何保证我们只能创建一个GirlFriend对象
    //1.将构造器私有化
    //2.在类的内部直接创建
    //3.提同一个公共的static方法，返回gf对象
    private GirlFriend(String name) {
        this.name = name;
    }
    public static GirlFriend getInstance(){
        return gf;
    }
}
