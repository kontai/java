package com.tai.multithreading;

import java.awt.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * ClassName: threadDemo3
 * Package: com.tai.multithreading
 * Description:
 *
 * @Author Kontai
 * @Create 8/21/24 10:42 AM
 * @Version 1.0
 */
public class threadDemo3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //創建MyCallble對象
        //表示要執行的多線程任務
        MyCallable mc=new MyCallable();

        //創建FutureTask對象 (作用管理多線程的運行結果)
        FutureTask<Integer> task=new FutureTask<>(mc);

        //創建多線程對象
        Thread t1=new Thread(task);
        Thread t2=new Thread(task);

        //獲取多線程運行的結果
        t1.setName("线程1");
        t2.setName("线程2");

        t1.start();
        t2.start();

        Integer i = task.get();

        System.out.println("result: "+i);



    }
}
