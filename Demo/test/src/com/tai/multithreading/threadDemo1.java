package com.tai.multithreading;

import org.junit.Test;

/**
 * ClassName: demo1_thread
 * Package: com.tai.multithreading
 * Description:
 *
 * @Author Kontai
 * @Create 8/20/24 9:52 AM
 * @Version 1.0
 */
public class threadDemo1 {

    @Test
    public void test() {
        ThreadRun tr1=new ThreadRun();
        ThreadRun tr2=new ThreadRun();
        tr1.setName("線程1");
        tr2.setName("線程2");
        tr1.start();
        tr2.start();
    }
}

class ThreadRun extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(this.getName());
        }
    }

}

