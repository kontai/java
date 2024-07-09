package com.tai.Excise;

/**
 * ClassName: Circle
 * Package: com.tai.Excise
 * Description:
 *
 * @Author Kontai
 * @Create 2024/7/5 上午9:04
 * @Version 1.0
 */
public class Circle extends GeometricObject {
    private double radius;

    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double findArea() {
        return Math.PI * radius * radius;
    }
}
