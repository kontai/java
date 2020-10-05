package com.tai.test;

public class Demo1 implements Process{
    public static void main(String[] args)
    {
        /* method I */
        Demo1 newDemo = new Demo1();
        newDemo.Exec();

        /* method III */
        Process x = new Demo1();
        x.Exec();

        /* method II */
        new Process() {
            public void Exec() {System.out.println("In main region");}
        }.Exec();

        System.out.println(newDemo instanceof Process);

        System.out.println(PI);
        newDemo.multiString("abc","ahh","kkk");
    }


    @Override
    public void Exec()
    {
        System.out.println("In Global region");
    }

    public void multiString(String... str){
        for(String s:str)
        {
            System.out.println(s);
            System.out.println("str size="+str.length);
        }
    }
}
