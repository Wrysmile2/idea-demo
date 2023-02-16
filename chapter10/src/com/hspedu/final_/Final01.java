package com.hspedu.final_;

public class Final01 {
    public static void main(String[] args) {
        E e = new E();
        //e.TAX_RATE = 0.09;
        F f = new F();
        f.cry();
    }
}
//如果要求A类不能被其他类继承，可以使用final关键字
final class A {
}

//class B extends A {}
class C{
    //如果我们要求hi不能被子类重写，可以使用final修饰hi方法
    public final void hi(){}
}
class D extends C{
//    @Override
//    public void hi() {
//        System.out.println("重写了C类的hi方法..");
//    }
}
//当不希望类的某个属性的值被修改，可以用final修饰
class E{
    public final double TAX_RATE = 0.08;
}
//当不希望类的某个局部变量被修改，可以用final修饰
class F{
    public void cry(){
        //这时，num也被称为 局部常量
        final double num = 10;
//        num = 20;
        System.out.println(num);
    }
}

