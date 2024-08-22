package com.tai.multithreading.pAndC;

/**
 * ClassName: cumtomer
 * Package: com.tai.multithreading.pAndC
 * Description:
 *
 * @Author Kontai
 * @Create 8/22/24 11:13 AM
 * @Version 1.0
 */
public class cumtomer {
    public static void main(String[] args) {
        Cooker cooker = new Cooker();
        Foodie foodie = new Foodie();
        Foodie foodie2 = new Foodie();

        cooker.setName("廚師");
        foodie.setName("吃貨1");
        foodie2.setName("吃貨2");

        cooker.start();
        foodie.start();
        foodie2.start();
    }
}
