package com.hspedu.houserent.service;

import com.hspedu.houserent.domain.House;

/**
 * 定义House[]，保存House对象
 * 1.响应HouseView的调用
 * 2.完成对房屋的各种操作(增删改查)
 * */
public class HouseService {
    private House[] houses; //保存House对象
    private int houseNums = 1;  //记录当前有多少个房屋信息
    private int idCounter = 1;  //记录当前id增长到那个值
    //构造器
    public HouseService(int size){
        houses = new House[size];
        houses[0] = new House(1,"jack","112","海淀区",2000,"未出租");
    }
    //add方法，添加新对象，返回boolean
    public boolean add(House newHouse){
        //判断是否还可以继续添加(暂时不考虑数组扩容)
        if (houseNums == houses.length){
            System.out.println("数组已满，不能在添加");
            return false;
        }
        //把newhouse对象加入到后面
        houses[houseNums++] = newHouse;
        //我们程序需要设计一个id自增长的机制,然后更新newHouse的id
        newHouse.setId(++idCounter);
        return true;

    }
    //list方法
    public House[] list(){
        return houses;
    }


}
