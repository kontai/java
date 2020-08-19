package test0227;

class Resource {
    private String name;
    private int age;
    private boolean flag;

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setFlag(boolean flag)
    {
        this.flag = flag;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public boolean isFlag()
    {
        return flag;
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
            synchronized (r)
            {
                if (r.isFlag())
                {
                    try
                    {
                        r.wait();
                    } catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
                if (i == 0)
                {
                    r.setName("強森");
                    r.setAge(33);

                }
                else
                {
                    r.setName("妮可");
                    r.setAge(30);
                }
                r.setFlag(true);
                r.notify();
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
            synchronized (r)
            {
                if (!r.isFlag())
                {
                    try
                    {
                        r.wait();
                    } catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
                System.out.println(r.getName() + "....." + r.getAge() + "-" + Thread.currentThread().getName());
                r.setFlag(false);
                r.notify();

            }
        }
    }
}

public class Th01 {

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
