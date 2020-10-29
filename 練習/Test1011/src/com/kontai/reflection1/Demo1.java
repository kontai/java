package com.kontai.reflection1;

public class Demo1 {
    public static void main(String[] args) throws Exception
    {

        Class p1 = new Person().getClass();
        System.out.println(p1);
        //        show(p1);

        Class p2 = Person.class;
        //        show(p2);

        Class p3 = Class.forName("com.kontai.reflection1.Person");
        //        show(p3);

        Person p4 = (Person) p3.getConstructor().newInstance();
        show(p4);

    }

    private static void show(Person p1)
    {
        System.out.println(p1.getName());
        System.out.println(p1.getAge());
        //        System.out.println(p1);
    }

    //反射複習
}
