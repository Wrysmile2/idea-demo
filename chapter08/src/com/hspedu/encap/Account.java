package com.hspedu.encap;

/*
    1.Account类要求具有属性：姓名(长度为2~4位)，余额必须大于20，密码必须是六位
    如果不满足，则给出提示信息，并给默认值
    2.通过set方法给Account的属性赋值
    3.在AccountTest中测试
*/
public class Account {
    //为了封装将三个属性设置为private
    private String name;
    private double balance;
    private String pwd;

    //提供两个构造器
//    public Account() {
//    }

    public Account(String name, double balance, String pwd) {
//        setName(name);
//        setBalance(balance);
//        setPwd(pwd);
        this.name = name;
        this.balance = balance;
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 4) {
            this.name = name;
        } else {
            System.out.println("名字要求在2~4位，默认：无名");
            this.name = "无名";
        }

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance > 20) {
            this.balance = balance;
        } else {
            System.out.println("余额必须大于20，默认为0");
        }
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        if (pwd.length() == 6) {
            this.pwd = pwd;
        } else {
            System.out.println("密码必须是六位，默认为000000");
            this.pwd = "000000";
        }
    }

    //显示账号信息
    public void showinfo() {
        System.out.println("账号信息：name=" + name + " 余额=" + balance + " 密码=" + pwd);
    }
}


