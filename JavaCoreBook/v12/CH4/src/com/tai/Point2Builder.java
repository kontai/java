package com.tai;

public class Point2Builder {
    private int from;
    private int anInt;

    public Point2Builder setFrom(int from) {
        this.from = from;
        return this;
    }

    public Point2Builder setTo(int anInt) {
        this.anInt = anInt;
        return this;
    }

    public Point2 createPoint2() {
        return new Point2(from, anInt);
    }
}