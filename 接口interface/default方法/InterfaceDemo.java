package 接口interface.default方法;

/*
從Java 8開始，接口允許定義默認方法。
格式：
public default 返回值類型 方法名稱(參數列表){
    方法體
}

備註：接口當中的默認方法，可以解決接口升級問題(臨時於接口新增方法,又不影響已經實踐的子類)
 */


public interface InterfaceDemo {
    public void show();
    public default void defaultMethod()
    {
        System.out.println("this is default method");
    }
}
