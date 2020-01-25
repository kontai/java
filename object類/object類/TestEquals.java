package object類;

public class TestEquals {
    public static void main(String[] args) {
        Object circle1=new Circle();
        Object circle2=new Circle();
//        Circle circle1=new Circle();
//        Circle circle2=new Circle();
        System.out.println(((Circle)circle1).equals((Circle) circle2));
    }
}

class Circle
{
    double radius;
//    public boolean equals(Object circle)
//    {
//        System.out.println(this.radius+" "+((Circle) circle).radius);
//        return this.radius==((Circle) circle).radius;
//    }
    public boolean equals(Circle circle)
    {
        System.out.println(this.radius+" "+radius);
        return this.radius==circle.radius;
    }

}
