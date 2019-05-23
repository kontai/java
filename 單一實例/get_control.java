package 單一實例;

/*
設計模式：對問題行之有效的解決方式。其實他是一種思想。

單例設計模式。
    解決問題：就是可以保證一個類在內存中中的對象唯一性。
    當必須對於多個程序使用同一個配置信息對象時，就需要保證對象的唯一性。

 如何保證對象唯一性呢？
    一）不允許其他程序用new創建對象。
    二）在該類創建一個本類實例。
    三）對外提供一個方法，讓其他程序可以獲取該對象。

  步驟：
    1.私有化該類構造函數。
    2.通過new在本類中創建一個本類對象。
    3.定義一個公有的方法，將創建的對象返回。
 */
class Single{
    private static Single s=new Single();
    private Single(){}
    public static Single getInstance(){
        return s;
    }

}

class Single2
{
    private static Single2 s=null;
    private Single2(){};
        //利用方法達到對象可控(有條件創建)
    public static Single2 getInstance()
    {
        if(s==null)
        {
            s=new Single2();
        }
        return s;
    }
}

class Another{}

class get_control{
    public static void main(String[] args) {
        Single ss=Single.getInstance();
        //Single s22=Single.s;
        Single ww=Single.getInstance();
        Single2 zz=Single2.getInstance();
        Another aa=new Another();
        Another bb=new Another();




    }
}