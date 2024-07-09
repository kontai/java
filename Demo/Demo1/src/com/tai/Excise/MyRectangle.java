package com.tai.Excise;

/**
 * ClassName: MyRectangle
 * Package: com.tai.Excise
 * Description:
 *
 * @Author Kontai
 * @Create 2024/7/5 上午9:05
 * @Version 1.0
 *
 */
public class MyRectangle extends GeometricObject {
    private double width;
    private double height;

    public MyRectangle(String color, double weight, double width, double height) {
        super(color, weight);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    //计算矩形的面积
    public double findArea() {
        return width * height;
    }
}
