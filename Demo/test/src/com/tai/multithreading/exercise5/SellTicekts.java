package com.tai.multithreading.exercise5;

import java.util.ArrayList;
import java.util.Collections;

/**
 * ClassName: SellTicekts
 * Package: com.tai.multithreading.exercise5
 * Description:
 *
 * @Author Kontai
 * @Create 8/23/24 9:28 AM
 * @Version 1.0
 */
public class SellTicekts extends Thread {
    private static ArrayList<Integer> list;

    SellTicekts(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (SellTicekts.class) {
                if (list.size() == 0)
                    break;
                Collections.shuffle(list);
                Integer number = list.remove(0);
                System.out.println(getName()+ "抽出了 "+number+"元大奖");
            }
            try {
                //每次抽奖间隔10毫秒(在同步鎖外)
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
