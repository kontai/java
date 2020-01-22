package 概述;

/*
內部類訪問特點：
1，內部類可以直接訪問外部類中的成員。
2，外部類要訪問內部類，必須建立內部類的對象。


一把用於類的設計。

分析事物時，發現該事物描述中還有事物，而且這個事物還在訪問被描述事物的內容。
這時就是還有的事物定義成內部類來描述。



*/
class Outer {
    private static int num = 31;

    //	class Inner// 內部類。
    static class Inner// 靜態內部類。
    {
        void show()
        {
            System.out.println("show run..." + num);
        }

        static void function()//如果內部類中定義了靜態成員，該內部類也必須是靜態的。
        {
            System.out.println("function run ...." + num);
        }

    }

    public void method()
    {
        Inner in = new Inner();
        in.show();
    }
}


class InnerClassDemo {
    public static void main(String[] args)
    {
//		Outer out = new Outer();
//		out.method();
        //直接訪問外部類中的內部類中的成員。
//		Outer.Inner in = new Outer().new Inner();
//		in.show();

        //如果內部類是靜態的。 相當於一個外部類
//		Outer.Inner in = new Outer.Inner();
//		in.show();

        //如果內部類是靜態的，成員是靜態的。
//		Outer.Inner.function();

        Outer.Inner.function();
//        Outer.Inner.show();


    }
}
