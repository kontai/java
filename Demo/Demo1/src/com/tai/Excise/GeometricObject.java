package com.tai.Excise;

/**
 * ClassName: GeometricObject
 * Package: com.tai.Excise
 * Description:
 *
 * @Author Kontai
 * @Create 2024/7/5 上午8:59
 * @Version 1.0
 */
public class GeometricObject {
    private String color;
    private double weight;

    public GeometricObject(String color,double weight){
        this.color=color;
        this.weight=weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double findArea() {
        return 0;
    }
}
