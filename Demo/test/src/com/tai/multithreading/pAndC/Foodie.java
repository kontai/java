package com.tai.multithreading.pAndC;

/**
 * ClassName: foodie
 * Package: com.tai.multithreading.pAndC
 * Description:
 *
 * @Author Kontai
 * @Create 8/22/24 10:18 AM
 * @Version 1.0
 */
public class Foodie extends Thread {


    @Override
    public void run() {
        while (true) {
            synchronized (Desk.lock) {
                //線程結束
                if (Desk.count == 0)
                    break;
                //桌子上沒有餐點
                if (Desk.status == 0) {
                    try {
                        //鎖-等待
                        Desk.lock.wait();
                        System.out.println(getName()+"等待中");
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                //桌子上有餐點
                } else {
                    //數量-1
                    Desk.count--;
                    //改變狀態
                    Desk.status=0;
                    System.out.println(getName()+"正在吃麵條,剩餘: " + Desk.count );

                    //鎖-喚醒
                    Desk.lock.notifyAll();
                }

            }
        }
    }
}
