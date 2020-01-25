package 練習四;

interface Inter
{
    void show(int a,int b);
    void func();
}

public class Demo5
{
    public static void main(String[] args){
        //補足代碼，調用兩個函數，要求用匿名內部類。
        Inter a=new Inter()
        {
            public void show(int a,int b){ System.out.println(a+b);}
            public void func(){System.out.println("In func");}
        };

        a.show(2,3);
        a.func();

        new Inter()
        {
            public void show(int x,int y)
            {
                System.out.println(x-y);
            }

            public void func(){}
        }.show(2,3);
    };




}

