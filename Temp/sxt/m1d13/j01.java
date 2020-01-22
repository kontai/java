package Temp.sxt.m1d13;

import java.util.Objects;

public class j01 {
    public static void main(String[] args)
    {
        Object obj;
        String str;

        User u1=new User(1000,"kontai","123");
        User u2=new User(1200,"JJ","456");

        System.out.println(u1==u2);
        System.out.println(u1.equals(u2));
        System.out.println(u1.toString()+"...."+u2.toString());

    }

}


class User{
    int id;
    String name;
    String owd;

    public User(int id, String name, String owd)
    {
        this.id = id;
        this.name = name;
        this.owd = owd;
    }

    @Override
    public int hashCode()
    {
        return super.hashCode();
    }

    public  boolean equals(Object o)
    {
        if(this==o)
        {
            System.out.println("1");
            return true;
        }
        if(getClass()!=o.getClass())
        {
            System.out.println("2");
            return false;
        }

        final User user=(User)o;
        if((this.id==user.id)&&(this.name==user.name)&&(this.owd==user.owd))
        {
            System.out.println("3");
            return true;
        }

        return false;
    }

}
