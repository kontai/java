/**
 * 當建構式被喚起時,建構是的優先順序最低,而顯式初始化與建構代碼塊要看執行順序
 */

class CatI {
    int i = 100;   //顯式初始化

    {
        i = 200;
    }     //建構代碼塊

    public CatI()
    {
//    i=300;     //建構式
    }
}


class 建構賦值順序 {
    public static void main(String[] args)
    {
        CatI a = new CatI();
        System.out.println("i=" + a.i);
    }
}