package com.tai.multithreading.pAndC;

/**
 * ClassName: desk
 * Package: com.tai.multithreading.pAndC
 * Description:
 *
 * @Author Kontai
 * @Create 8/22/24 10:11 AM
 * @Version 1.0
 */
public class Desk {
    //狀態 (0:沒有餐點 1:有餐點)
    public static int status = 0;

    //鎖
    public static Object lock = new Object();
    //總數量
    public static int count = 10;


}
