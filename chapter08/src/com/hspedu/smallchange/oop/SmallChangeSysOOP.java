package com.hspedu.smallchange.oop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
* 该类是完成零钱通的各个功能的类
* 使用OOP(面向对象编程)
* 将各个功能对应一个方法
* */
public class SmallChangeSysOOP {
    //属性

    //定义相关变量
    boolean loop = true;
    Scanner scanner = new Scanner(System.in);
    String key = "";

    //2.完成零钱通明细
    //(1)可以吧收益入账和消费保存到数组 (2)可以使用对象 (3)简单的话可以使用String拼接
    String details = "---------------零钱通明细----------------";

    //3.完成收益入账 完成功能驱动程序员增加新的变化和代码
    double money = 0;
    double balance = 0;
    Date date = null;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");//可以用于日期格式化

    //4.消费
    //定义新变量，保存消费原因

    String note = "";

    //先完成显示菜单，并可以选择
    public void mainMenu(){
        do {
            System.out.println("\n===============零钱通菜单(OOP)===============");
            System.out.println("\t\t1 零钱通明细");
            System.out.println("\t\t2 收益入账");
            System.out.println("\t\t3 消费");
            System.out.println("\t\t4 退出");

            System.out.print("请选择(1~4)：");
            key = scanner.next();
            switch (key) {
                case "1":
                    this.detail();
                    break;
                case "2":
                   this.income();
                    break;
                case "3":
                    this.pay();
                    break;
                case "4":
                    this.exit();
                    break;
                default:
                    System.out.println("菜单选择有误，请重新选择");
            }


        } while (loop);
    }

    //完成零钱通明细
    public void detail(){
        System.out.println(details);
    }
    //完成收益入账
    public void income(){
        System.out.println("收益入账金额");
        money = scanner.nextDouble();
        //money 的范围应该校验
        //找出不正确的条件，然后给出提示，直接return
        if (money <= 0) {
            System.out.println("收益入账金额需要大于0");
            return; //退出方法，不再执行
        }
        balance += money;
        //拼接收益入账信息到 details
        date = new Date();//获取当前日期
        details += "\n收益入账\t" + money + "\t" + sdf.format(date) + "\t余额" + balance;
    }
    //消费
    public void pay(){
        System.out.println("消费金额");
        money = scanner.nextDouble();
        //money 的范围应该校验
        if (money <= 0 || money > balance) {
            System.out.println("消费金额应该在0~"+balance);
            return;
        }
        System.out.println("消费说明：");
        note = scanner.next();
        balance -= money;

        //拼接消费信息到 details
        date = new Date();//获取当前日期
        details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t余额" + balance;
    }
    //退出
    public void exit(){
        //用户输入4退出时，给出提示"你确定要退出吗？y/n"，必须输入正确的y和n，否则循环输入指令，直到输入y或n
        //(1)定义一个变量 choice,接受用户选择
        String choice = "";
        while (true) {
            System.out.println("你确定要退出吗？");
            choice = scanner.next();
            if ("y".equals(choice) || "n".equals(choice)) {
                break;
            }
        }
        //当用户退出while后,进行判断
        if (choice.equals("y")) {
            loop = false;
        }
    }

}
