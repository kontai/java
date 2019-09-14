package 接口interface.static靜態方法;

public class InterfaceStaticMain {
    public static void main(String[] args) {
//        Demo demo=new Demo();   //多餘的創建
//        demo.show();    //錯誤,靜態方法不能使用對象調用

        InterfaceStaticMehod.show();  //使用
    }
}

class Demo implements InterfaceStaticMehod
{

}

