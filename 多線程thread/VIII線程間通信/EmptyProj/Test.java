package VIII線程間通信.EmptyProj;

import static java.lang.Thread.sleep;

class Resource {
    private String product;
    private int count;
    private Boolean flag = false;

    public void setProd(String product, int count)
    {
        this.product = "Iphone";
        this.count = 1;
    }

    public void getProd()
    {
        System.out.println(product + "...." + count);
    }
}


class Run implements Runnable {
    //    Resource r;
    int i = 0;

    public void run()
    {
        while (i < 100)
        {
            try
            {
                sleep(10);
            } catch (InterruptedException e)
            {
            }

            synchronized(this) {
            System.out.println(Thread.currentThread().getName() + "..." + i++);
        }
        }
    }
}


public class Test {
    public static void main(String[] args)
    {
        Run r = new Run();
        Run r2 = new Run();

        Thread t = new Thread(r);
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(r);
        Thread t4 = new Thread(r);

        t.start();
        t2.start();
        t3.start();
        t4.start();


    }

}
