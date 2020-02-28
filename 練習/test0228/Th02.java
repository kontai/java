package test0228;

/**
 * Th02進化版
 * 將同步調用封裝於Resource類中,供同步函數調用
 */
class Resource {
    private String name;
    private int age;
    private boolean flag;

    public synchronized void set(String name, int age)
    {
        if (flag)
        {
            try
            {
                this.wait();
            } catch (InterruptedException e)
            {
            }
        }
        this.name = name;
        this.age = age;
        flag = false;
        notify();
    }

    public synchronized void out()
    {
        if (!flag)
        {
            try
            {
                this.wait();
            } catch (InterruptedException e)
            {
            }
        }
        System.out.println(name + "....." + age + "-" + Thread.currentThread().getName());
        flag = false;
        notify();
    }


}


class Call implements Runnable {
    Resource r;

    public Call(Resource r)
    {
        this.r = r;
    }

    public void run()
    {
        int i = 0;

        while (true)
        {

            if (i == 0)
            {
                r.set("強森", 33);
            }
            else
            {
                r.set("妮可", 30);
            }
            i = (i + 1) % 2;
        }
    }
}

class Take implements Runnable {

    Resource r;

    public Take(Resource r)
    {
        this.r = r;
    }

    public void run()
    {
        while (true)
        {
            r.out();
        }

    }
}

public class Th02 {

    public static void main(String[] args)
    {
        Resource r = new Resource();
        Call call = new Call(r);
        Take take = new Take(r);

        Thread t1 = new Thread(call);
        Thread t2 = new Thread(take);

        t1.start();
        t2.start();
    }


}

