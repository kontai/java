package com.tai;

import java.util.Random;

public class recordExample {
    record Point(int x, int y) {
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        Point[] points = new Point[10];
        Random random = new Random();
        for (int i = 0; i < points.length; i++) {
            points[i] = new Point(random.nextInt(100), random.nextInt(100));
        }
        for (var x : points) {
            System.out.printf("%3d %3d\n", x.x, x.y);
        }
    }
}
