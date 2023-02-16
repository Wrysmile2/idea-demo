package com.hspedu.interface_;

//Phone 类 实现 USBInterface
//1.即Phone类需要实现 UsbInterface
public class Phone implements UsbInterface{
    @Override
    public void start() {
        System.out.println("手机开始工作..");
    }

    @Override
    public void stop() {
        System.out.println("手机停止工作..");
    }
}
