package 內部類.匿名內部類;

interface In {
    void show1();
    void show2();
}


class Outter {
    class Inner implements In{
        public void show1(){}
        public void show2(){}
    }


    void method1(){

        Inner in=new Inner();
        in.show1();
        in.show2();
    }

    void method2(){
        new In(){
            public void show1(){System.out.println("test1");}
            public void show2(){System.out.println("test1");}
        }.show1();

    }


    void method3(){
          In inner= new In(){
            public void show1()
            {
                System.out.println("test1");
            }
            public void show2()
            {
                System.out.println("test2");
            }
        };
        inner.show1();
        inner.show2();
    }

    void God_method(){
        new Object()
        {
            public void show()
            {
                System.out.println("obj test");
            }
        }.show();
    }
/*
    void God_method2(){
        //子類已經向上轉型成為Object類型。
        //這樣就不能再使用子類特有的方法了。
        Object obj=new Object(){
            public void  show()
            {
                System.out.println("obj test");
            }
        }.show();
    }
 */

  void God_method2(){
        //子類已經向上轉型成為Object類型。
        //這樣就不能再使用子類特有的方法了。
        Object obj=new Object(){
            public Object  show()
            {
                System.out.println("obj test");
                return this;
            }
        }.show();
    }


}

public class 匿名內部類_應用 {
    public static void main(String[] args) {
        new Outter().method2();
        new Outter().God_method();
        new Outter().method3();
        new Outter().God_method2();


    }


}
