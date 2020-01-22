package 繼承.I.test;

/**
 * @author kontai
 * @version 1.0
 *
 * 測試代碼塊優先順序
 */

public class Empty {
    public static void main(String[] args)
    {
        {
            B a = new B();
            System.out.println(a.num);
        }

    }


}


class A {
    int num=3;
    {
        System.out.println("A: defult block");
    }
    static{
        System.out.println("A: static block");
    }
    public A()
    {
        System.out.println("A: construct block"+num);
    }
}

class B extends A {
    int num=5;
    {
        System.out.println("B: defult block");
    }
    static{
        System.out.println("B: static block");
    }
    public B()
    {

        System.out.println("B: construct block"+num);
    }
}
