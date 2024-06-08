package com.tai;

public class ConstructorExample {
    public static void main(String[] args) {
        Point3 p3 = new Point3(3, 4);
        System.out.println("x:" + p3.from() + "\ny:" + p3.to());
    }
}

record Point(double x, double y) {
    public Point() {
        this(1, 2);
    }
}

record Point2(int from, int to) {
    public Point2(int from, int to) {
        if (from < to) {
            this.from = from;
            this.to = to;
        } else {
            this.from = to;
            this.to = from;
        }
    }
}

/**
 * 簡潔(compact)形式
 *
 * @param from
 * @param to
 */
record Point3(int from, int to) {
    public Point3 {
        if (from > to) {
            from ^= to;
            to ^= from;
        }
        Math.hypot(3, 2);
    }
}

