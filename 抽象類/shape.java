import java.util.Scanner;

//圖形類
abstract class MyShape {
    public abstract void getArea();
}

// 圓形
class Circle extends MyShape {
    double radius;

    public static final double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void getArea() {
        System.out.println("圓形面積= "+radius*radius* PI ) ; 
        System.out.println("圓形周長= "+2*radius* PI ) ; 
    }
}

//矩形
class Rectangle extends MyShape{
    double height,width;

    public Rectangle(double height,double width){
        this.height=height;
        this.width=width;
    }

    public void getArea(){
        System.out.println("矩形面積= "+height*width);
        System.out.println("矩形周長= "+2*(height+width));
    }
}

class shape {
    public static void main(String[] args) {
        double w, h, r;

        System.out.print("圖形選擇:!)圓形 2)矩形 =>");
        Scanner in = new Scanner(System.in);

        int i = 0;
        i = in.nextInt();

        switch (i) {
        case 1:
            System.out.print("請輸入半徑R=>");
            r = in.nextDouble();
            new Circle(r).getArea();
            break;
        case 2:
            System.out.print("請輸入長度=");
            h = in.nextDouble();
            System.out.print("請輸入寬度=");
            w = in.nextDouble();
            new Rectangle(h, w).getArea();
            break;
        }
        in.close();

    }
}