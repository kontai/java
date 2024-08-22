package com.tai.multithreading;

import org.junit.Test;

/**
 * ClassName: threadDemo2
 * Package: com.tai.multithreading
 * Description:
 *
 * @Author Kontai
 * @Create 8/21/24 9:27 AM
 * @Version 1.0
 */
public class threadDemo2 {
    public static void main(String[] args) {
        //創建MyRun對象
        //表示要執行的多線程任務
        MyRun r = new MyRun();

        //創見多線程對象
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);

        //設置線程名稱
        t1.setName("线程1");
        t2.setName("线程2");

        //啟動線程
        t1.start();
        t2.start();
    }
}

