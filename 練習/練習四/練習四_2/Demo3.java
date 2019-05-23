//package 練習.練習四.練習四_2;
////計算面積
//
//import com.sun.org.apache.bcel.internal.generic.ARRAYLENGTH;
//
//import java.io.FileInputStream;
//
//
//interface Cal
//{
//    double getArea();
//}
//
//class UnavaliableNumberException extends RuntimeException
//{
//    UnavaliableNumberException()
//    {
//        super();
//    }
//
//    UnavaliableNumberException(String message)
//    {
//        super(message);
//    }
//}
//
//class Rectangle implements Cal
//{
//    private double length;
//    private double width;
//
//    Rectangle(double len,double wid) //RuntimeException出現在無法處理的狀況，不需要try,catch處理
//    {
//            if(len<=0||wid<=0)
//                throw new UnavaliableNumberException("數值非法!!");
////        if(len <=0 || wid <=0)
////        {
////            System.out.println("unavaliable number");
////            //return   ;
////        }
//        this.length=len;
//        this.width=wid;
//    }
//    public double getArea()
//    {
//        return length*width;
//    }
//}
//
//class Circle implements Cal
//{
//    public static final double PI=3.14;
//    private double radius;
//    Circle(double radius)
//    {
//        if(radius<=0)
//            throw new UnavaliableNumberException("數值非法！");
//        this.radius=radius;
//    }
//
//    public double getArea()
//    {
//        return radius*radius*PI;
//    }
//
//    public static double compare(Circle[] cir)
//    {
//        int arr_len=cir.length;
//
//        double biggest=cir[0].radius;
//        for(int i=1;i<arr_len;i++)
//        {
//            if(cir[i].radius>biggest)
//                biggest=cir[i].radius;
//        }
//    return biggest;
//    }
//}
//
//
//public class Demo3
//{
//    public static void main(String[] args){
//        Rectangle rec=new Rectangle(3.3,4.5);
//        System.out.println(rec.getArea());
//
//        Circle rad=new Circle(6);
//        System.out.println(rad.getArea());
//
//        Circle c[]=new Circle[3];
//        c[0]=new Circle(2.3);
//        c[1]=new Circle(34);
//        c[2]=new Circle(2.23);
//        System.out.println("最大半徑 "+Circle.compare(c));
//
//
//    }
//
//}
