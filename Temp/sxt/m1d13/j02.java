package Temp.sxt.m1d13;

public class j02 {
    public static void main(String[] args)
    {

        A01 a=new A01(2,3);
        System.out.println(String.format("%d,%d",a.a,a.b));
//        A01 b=new A02(3,5);
//
//        A01 c=new A01(a);
//
//        System.out.println(a==b);
//        System.out.println(a.equals(b));
        int[] x={1,2,3};
        System.out.println(x);
        int[] y=new int[]{3,4,5};
        System.out.println(x[0]);
//
//
//        System.out.println(b==c);
//        System.out.println(b.equals(c));
    }
}

class A01{
    int a=0;
    int b=1;

    public A01(){
        System.out.println("A01 non-param constructor");
    }

    public A01(int a,int b)
    {
        this.a=a;
        this.b=b;
    }

    public A01(A01 a){
        a=new A01();
    }

}

class A02 extends A01{
//
//    public A02(int a,int b)
//    {
//    }

}
