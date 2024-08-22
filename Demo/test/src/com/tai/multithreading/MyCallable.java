package com.tai.multithreading;

import java.util.concurrent.Callable;

/**
 * ClassName: MyCallable
 * Package: com.tai.multithreading
 * Description:
 *
 * @Author Kontai
 * @Create 8/21/24 10:43 AM
 * @Version 1.0
 */
public class MyCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
            System.out.println(Thread.currentThread().getName()+" 執行");
        }
        return sum;
    }
}
