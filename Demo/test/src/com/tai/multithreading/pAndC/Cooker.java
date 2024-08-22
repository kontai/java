package com.tai.multithreading.pAndC;

/**
 * ClassName: cooker
 * Package: com.tai.multithreading.pAndC
 * Description:
 *
 * @Author Kontai
 * @Create 8/22/24 11:03 AM
 * @Version 1.0
 */
public class Cooker extends Thread {
    @Override
    public void run() {
        while (true) {
            synchronized (Desk.lock) {
                if (Desk.count == 0)
                    break;
                if (Desk.status == 1) {
                    try {
                        Desk.lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    Desk.status = 1;
                    System.out.println("廚師正在烹飪");
                    Desk.lock.notifyAll();
                }
            }
        }

    }
}
