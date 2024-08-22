package com.tai.multithreading;

/**
 * ClassName: MyRun
 * Package: com.tai.multithreading
 * Description:
 *
 * @Author Kontai
 * @Create 8/21/24 10:13 AM
 * @Version 1.0
 */
public class MyRun implements Runnable{

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
//            Thread t = Thread.currentThread();
//            System.out.println(t.getName() + " hell world");
                System.out.println(Thread.currentThread().getName() + " hello world");
            }
        }
}
