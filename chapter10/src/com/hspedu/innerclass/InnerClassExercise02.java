package com.hspedu.innerclass;

public class InnerClassExercise02 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        //1.传递的是实现了 Bell接口的匿名内部类 InnerClassExercise02$1
        //2.重写了 ring
        //3.
        cellphone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床了");
            }
        });

        cellphone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("小伙伴去上课了");
            }
        });
    }
}

interface Bell{
    void ring();
}

class Cellphone{
    public void alarmclock(Bell bell){  //形参是Bell接口类型
        bell.ring();  //动态绑定
    }
}
