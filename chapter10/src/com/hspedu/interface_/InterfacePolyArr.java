package com.hspedu.interface_;

public class InterfacePolyArr {
    public static void main(String[] args) {
        //接口的多态体现
        //接口类型的变量 if01 可以指向 实现了IF接口的对象实例
        IF if01 = new Monster();
        if01 = new Car();

        //继承体现的多态
        //父类类型的变量 aaa 可以指向 继承了AAA的子类的对象实例
        AAA aaa = new BBB();
        aaa = new CCC();

        //多态数组->接口类型数组
        Usb[] usbs = new Usb[2];
        usbs[0] = new Phone_();
        usbs[1] = new Camera_();
        for (int i = 0; i < usbs.length; i++) {
            usbs[i].work();  //动态绑定
            //向下转型
            if (usbs[i] instanceof Phone_){
                ((Phone_) usbs[i]).call();
            }
        }

    }
}
interface IF{}
class Monster implements IF{}
class Car implements IF{}

class AAA{}
class BBB extends AAA{}
class CCC extends AAA{}

interface Usb{
    void work();
}
class Phone_ implements Usb{
    public void call(){
        System.out.println("手机可以打电话..");
    }

    @Override
    public void work() {
        System.out.println("手机工作中..");
    }
}
class Camera_ implements Usb{
    @Override
    public void work() {
        System.out.println("相机工作中..");
    }
}
