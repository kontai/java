package VIII線程間通信.EmptyProj;

import java.util.concurrent.locks.*;


class People {
    Lock lock=new ReentrantLock();

    private String name;
    private int number;
    private boolean flag = false;

    public synchronized void set()
    {
        while (flag)
        {
            try
            {
                wait();
            } catch (InterruptedException e)
            {
            }
        }
        this.name = "存入";
        this.number += 1;
        if (number % 10000 == 0)
        {
            show();
        }
        flag = true;
        notifyAll();
    }

    public synchronized void get()
    {

        while (!flag || number == 0)
        {
            try
            {
                wait();
            } catch (InterruptedException e)
            {
            }
        }
        this.name = "取出";
        if (number % 10000 == 0)
        {
            show();
        }
        flag = false;
        notifyAll();

    }

    public synchronized void show()
    {
        System.out.println(Thread.currentThread().getName() + "...." + this.name + "...." + this.number);
    }
}


class Set implements Runnable {

    People p;

    Set(People p)
    {
        this.p = p;
    }

    public void run()
    {
        while (true)
        {
            p.set();

        }
    }

}

class Get implements Runnable {

    People p;

    Get(People p)
    {
        this.p = p;
    }

    public void run()
    {
        while (true)
        {
            p.get();
        }
    }

}

public class Test {


    public static void main(String[] args)
    {

        People p1 = new People();
//        Set s = p1.set(1);
//        Get g = p1.get();
        Set s = new Set(p1);
        Get g = new Get(p1);
        Thread t = new Thread(s);
        Thread t2 = new Thread(s);
        Thread t3 = new Thread(g);
        Thread t4 = new Thread(g);
        t.start();
        t2.start();
        t3.start();
        t4.start();


    }
}
