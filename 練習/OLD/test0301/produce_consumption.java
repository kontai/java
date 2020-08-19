package test0301;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Resource {
    private String name;
    private int count = 1;
    private boolean flag = false;

    //Creat Lock
    Lock lock = new ReentrantLock();

    //Creat Watcher
//    Condition con=lock.newCondition();
    Condition product_con = lock.newCondition();
    Condition consumer_con = lock.newCondition();

    /**
     * function for Thread set
     *
     * @param name
     */

    public void set(String name)
    {
        lock.lock();
        try
        {
            while (flag)
            {
                try
                {
//                    lock.wait();
                    product_con.await();
                } catch (InterruptedException e)
                {
                }
            }
            this.name = name + count;
            count++;
            System.out.println(Thread.currentThread().getName() + "生產" + "...." + this.name);
            flag = true;
            product_con.signal();//造成死鎖
        } finally
        {
            lock.unlock();
        }
    }

    public  void out()
    {
        lock.lock();
        try
        {
            while (!flag)
            {
                try
                {
//                    lock.wait();
                    consumer_con.await();
                } catch (InterruptedException e)
                {
                }
            }
            System.out.println(Thread.currentThread().getName() + "消費" + "...." + this.name);
            flag = false;
            consumer_con.signalAll(); //造成死鎖
        } finally
        {
            lock.unlock();
        }

    }

}

class Produce implements Runnable {
    Resource r;

    public Produce(Resource r)
    {
        this.r = r;
    }

    public void run()
    {
        while (true)
            r.set("烤鴨");
    }
}


class Consumer implements Runnable {
    Resource r;

    public Consumer(Resource r)
    {
        this.r = r;
    }

    public void run()
    {
        while (true)
            r.out();
    }
}


public class produce_consumption {
    public static void main(String[] args)
    {
        Resource r = new Resource();
        Produce p1 = new Produce(r);
        Consumer c1 = new Consumer(r);

        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p1);
        Thread t3 = new Thread(c1);
        Thread t4 = new Thread(c1);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
