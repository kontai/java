package test0228.Buyduck;

class Resource {
    private String name;
    private int count = 1;
    private boolean flag = false;


    /**
     * function for Thread set
     *
     * @param name
     */

    public synchronized void set(String name)
    {
        while (flag)
        {
            try
            {
                this.wait();
            } catch (InterruptedException e)
            {
            }
        }
        this.name = name + count;
        count++;
        System.out.println(Thread.currentThread().getName() + "生產" + "...." + this.name);
        flag = true;
        notifyAll();
    }

    public synchronized void out()
    {
        while (!flag)
        {
            try
            {
                this.wait();
            } catch (InterruptedException e)
            {
            }
        }
        System.out.println(Thread.currentThread().getName() + "消費" + "...." + this.name);
        flag = false;
        notifyAll();


    }

}

class Procduce implements Runnable {
    Resource r;

    public Procduce(Resource r)
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
        Procduce p1 = new Procduce(r);
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
