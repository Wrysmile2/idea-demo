package com.hspedu.interface_;

public class Gamera implements UsbInterface{
    @Override
    public void start() {
        System.out.println("相机开始了工作..");
    }

    @Override
    public void stop() {
        System.out.println("相机停止了工作..");
    }
}
