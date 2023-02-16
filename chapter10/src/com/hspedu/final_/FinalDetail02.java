package com.hspedu.final_;

public class FinalDetail02 {
    public static void main(String[] args) {
        System.out.println(BBB.num);
        BBB bbb = new BBB();
        //包装类String是final类不能被继承
    }
}
//final 和 static 往往搭配使用，效率更高，不会导致类加载，底层编译器做了优化处理
class BBB{
    public final static int num = 100;
    static {
        System.out.println("BBB 静态代码块..");
    }
}
