package test0226;


class Bank
{
    private int sum;

    public synchronized void add(int num)
    {
//        synchronized(this)
//        {
            sum+=num;
            try{Thread.sleep(100);}catch(InterruptedException e){}
            System.out.println(Thread.currentThread().getName()+"-"+"sum="+sum);

//        }
    }
}


class Deposit implements Runnable{
    private Bank bank=new Bank();
    public void run()
    {

        for(int i=0;i<30;i++)
        {
            bank.add(100);
        }
    }
}


public class MyAct {
    public static void main(String[] args)
    {
        Deposit d1=new Deposit();
        Thread t1=new Thread(d1);
        Thread t2=new Thread(d1);

        t1.start();
        t2.start();


    }
}
