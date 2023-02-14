package com.hspedu.smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {
    //1.先完成显示菜单
    public static void main(String[] args) {
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
        do {
            System.out.println("\n===============零钱通菜单===============");
            System.out.println("\t\t1 零钱通明细");
            System.out.println("\t\t2 收益入账");
            System.out.println("\t\t3 消费");
            System.out.println("\t\t4 退出");

            System.out.print("请选择(1~4)：");
            key = scanner.next();
            switch (key) {
                case "1":
                    System.out.println(details);
                    break;
                case "2":
                    System.out.println("收益入账金额");
                    money = scanner.nextDouble();
                    //money 的范围应该校验
                    //找出不正确的条件，然后给出提示，直接break
                    if (money <= 0) {
                        System.out.println("收益入账金额需要大于0");
                        break;
                    }
                    balance += money;
                    //拼接收益入账信息到 details
                    date = new Date();//获取当前日期
                    details += "\n收益入账\t" + money + "\t" + sdf.format(date) + "\t余额" + balance;

                    break;
                case "3":
                    System.out.println("消费金额");
                    money = scanner.nextDouble();
                    //money 的范围应该校验
                    if (money <= 0 || money > balance) {
                        System.out.println("消费金额应该在0~"+balance);
                        break;
                    }
                    System.out.println("消费说明：");
                    note = scanner.next();
                    balance -= money;

                    //拼接消费信息到 details
                    date = new Date();//获取当前日期
                    details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t余额" + balance;

                    break;
                case "4":
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

                    break;
                default:
                    System.out.println("菜单选择有误，请重新选择");
            }


        } while (loop);

        System.out.println("----------退出了零钱通项目----------");
    }
}
