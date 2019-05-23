package 練習.練習四;

class Super
{
    int i=0;
    public Super(String a)
    {
        System.out.println("A");
        i=1;
    }

    public Super()
    {
        System.out.println("B");
        i+=2;
    }
}

public class Demo4 extends Super
{
    public Demo4(String a)
    {
        //Super()  //隱式父類初始化
        System.out.println("c");
        i+=5;

    }
    public static void main(String[] args){
        int i=4;
        Super d=new Demo4("A");
        System.out.println(d.i);
    }

}
