package 匿名內部類.概述;
/*
匿名內部類。就是內部類的簡寫格式。
	
	必須有前提：
	內部類必須繼承或者實現一個外部類或者接口。

匿名內部類：其實就是一個匿名子類對象。 

格式：new 父類or接口(){子類內容}

*/

abstract class Demo {
    abstract void show();
}

class Outer {
    int num = 4;

    /*
    class Inner extends Demo
    {
        void show()
        {
            System.out.println("show ..."+num);
        }
    }
    */
    public void method()
    {
        //new Inner().show();
        new Demo()//匿名內部類。
        {
            void show()
            {
                System.out.println("show ........" + num);
            }

        }.show();


    }
}


class InnerClassDemo4 {
    public static void main(String[] args)
    {
        new Outer().method();
    }
}
