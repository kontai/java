package test0226;

class Person {
    private String name;
    private int age;

    Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String show()
    {
        return this.name + "," + this.age;
    }
}

class ticket implements Runnable {
    Person person;
//    Object obj=new Object();

    public ticket(Person person)
    {
        this.person = person;
    }

    public void run()
    {
        int i = 0;

        {
            while (true)
            {
                synchronized (this)
                {
                    try
                    {
                        Thread.sleep(10);
                    } catch (InterruptedException e)
                    {
                    }
                    System.out.println(Thread.currentThread().getName() + person.show() + "...." + i);
                    i++;
                }
            }

        }
    }

}

public class trd01 {

    public static void main(String[] args)
    {
        Person p1 = new Person("kontai", 33);
        ticket ticket = new ticket(p1);

        Thread t1 = new Thread(ticket);
        Thread t2 = new Thread(ticket);
        t1.start();
        t2.start();

    }

}
