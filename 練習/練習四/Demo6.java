package 練習.練習四;

class Ts
{
    int show(int a,int b){return 0;}
}
public class Demo6 extends Ts
{
    //public int show(int a,int b){return 0;}  //可以的，覆蓋。
    //private int show (int a,int b){return 0;} //不可以，權限不夠。
    //private int show(int a,long b){return 0;} //可以，子類特有方法。
    //public short show(int a,int b){return 0;} //不可以，調用的不確定性。
    //static int show(int a,int b){return 0;}  //不可以，靜態只能覆蓋靜態。
}
