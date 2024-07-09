package com.tai.Excise;

/**
 * ClassName: GeometricTest
 * Package: com.tai.Excise
 * Description:
 *
 * @Author Kontai
 * @Create 2024/7/5 上午9:11
 * @Version 1.0
 */
public class GeometricTest {
    public static void main(String[] args) {
        GeometricTest test = new GeometricTest();
        Circle c1 = new Circle("red", 1.0, 2.2);
        Circle c2 = new Circle("red", 1.0, 3.2);

        MyRectangle rec1 = new MyRectangle("red", 1.0, 2.0, 3.0);
        MyRectangle rec2 = new MyRectangle("red", 1.0, 2.0, 4.0);

        System.out.println(test.equalsArea(c1, c2));
        System.out.println("c1 Area is %s".formatted(test.displayGeometricObject(c1)));
        System.out.println("c2 Area is %s".formatted(test.displayGeometricObject(c2)));
        System.out.println("rec1 Area is %s".formatted(test.displayGeometricObject(rec1)));
        System.out.println("rec2 Area is %s".formatted(test.displayGeometricObject(rec2)));


    }

    public boolean equalsArea(GeometricObject g1, GeometricObject g2) {
        return g1.findArea() == g2.findArea();
    }

    public double displayGeometricObject(GeometricObject g1) {
        return g1.findArea();
    }
}
