package com.hspedu.interface_;

public class InterfaceDetail01 {
    public static void main(String[] args) {

    }
}

//1.接口不能被实例化
//2.接口中所有的方法是 public方法，接口中抽象方法，可以不用abstract修饰
//3.一个普通类实现接口，就必须将该接口的所有方法都实现，可以使用Alt+enter
interface IA {
    void hi();

    void say();
}

class Cat implements IA {

    @Override
    public void hi() {

    }

    @Override
    public void say() {

    }
}
//4.抽象类实现接口，可以不用实现接口方法
abstract class Tiger implements IA{

}


