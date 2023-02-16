package com.hspedu.codeblock;

/*小结：1.static代码块是类的加载时，执行，只会被执行一次
     2.普通代码块是在创建对象是调用，创建一次，调用一次
     3.类加载的3种情况，需要记住
        (1)创建对象实例时(new)
        (2)创建子类对象实例，父类也会被调用
        (3)使用类的静态成员时(静态属性，静态方法)
*/
public class CodeBlockDetail01 {
    public static void main(String[] args) {
        AA aa = new AA();
        AA aa2 = new AA();
        System.out.println(Cat.n1);
        //静态代码块只能被调用一次，普通代码块被创建一次就调用一次。
        DD dd = new DD();
        DD dd1 = new DD();
        System.out.println(DD.n2);  //静态代码块一定会被调用
    }
}

class DD {
    public static int n2 = 888;

    static {
        System.out.println("DD静态代码被执行..");
    }

    {
        System.out.println("DD的普通代码被执行..");
    }
}

class Animal {
    static {
        System.out.println("Animal静态代码被执行..");
    }
}

class Cat extends Animal {
    public static int n1 = 999;

    static {
        System.out.println("Cat静态代码被执行..");
    }
}

class BB {
    static {
        System.out.println("BB静态代码被执行..");
    }
}

class AA extends BB {
    static {
        System.out.println("AA静态代码被执行..");
    }
}
