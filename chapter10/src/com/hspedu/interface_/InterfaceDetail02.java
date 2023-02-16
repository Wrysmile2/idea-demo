package com.hspedu.interface_;

public class InterfaceDetail02 {
    public static void main(String[] args) {
        System.out.println(IB.n1);  //说明n1是static
        //IB.n1 = 20;  说明n1是final
    }
}

interface IB {
    int n1 = 10;  //等价于 public static final int n1 = 10;

    void hi();
}

interface IC {
    void say();
}

//接口不能继承其他的类，但能继承多个别的接口
interface ID extends IB, IC {

}

//一个类可以同时实现多个接口
class Pig implements IB, IC {

    @Override
    public void hi() {

    }

    @Override
    public void say() {

    }
}