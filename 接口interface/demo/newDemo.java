package 接口interface.demo;

//當一個抽象類的方法都是抽象的時候,這時可以將該抽象類用
//另一種形式定義和表示,就是街口interface

//定義接口使用關鍵字是interface,而不是class

/*
＃對於接口當中常見的成員:  而且這些成員都有固定的修飾符。
    1.全局變量: public static final
    2.抽象方法: public abstract
 */

interface Demo{
    public static final int NUM=4;
    public abstract void show1();
    public abstract void show2();
}

//類與類之間是繼承關係,類與接口使實現關係
//繼承:子類可以拿父類成員使用
//實現:全部都得重寫

/*
＃接口不可實例化

只能由實現了接口的子類並覆蓋了接口中所有的抽象方法後，該子類才可實例化。
否則.這個子類就是一個抽象類。
 */
class DemoImp1 implements Demo
{
    public void show1(){}

    public void show2(){}
}




public class newDemo{
public static void main(String[] args){
    DemoImp1 d=new DemoImp1();
    System.out.println(d.NUM);
    System.out.println(DemoImp1.NUM);
    System.out.println(Demo.NUM);


}





}
