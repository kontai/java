package 接口interface.private私有方法;

/*
問題描述：
我們需要抽取一個共有方法，用來解決兩個默認方法之間重複代碼的問題。
但是這個共用方法不應該讓實現類使用，應該是私有化的。

解決方案：
從JAVA 9開始，接口當中允許定義私有方法。

1.普通私有方法，解決多個默認方法之間重複代碼問題。
格式：
private 返回值類型 方法名稱（參數列表）{
    方法體
}

2.靜態私有方法：解決多個靜態方法之間重複代碼問題。
格式：
private static 返回值類型 方法名稱（參數列表）{
    方法體
}
 */
public interface InterfacePrivateA {
    public default void methodDefault1()
    {
    System.out.println("默認方法1");
    methodDefaultCommon();
    }


    public default void methodDefault2()
    {
        System.out.println("默認方法2");
    }
     default void methodDefaultCommon()
    {
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }



}
