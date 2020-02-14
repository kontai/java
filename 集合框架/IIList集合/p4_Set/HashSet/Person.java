package 集合框架.IIList集合.p4_Set.HashSet;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(this==obj)
            return true;
        if(!(obj instanceof Person))
            throw new ClassCastException();
        System.out.println(this+".....equals......"+obj);
        Person p=(Person)obj;
        return this.name.equals(p.name) && this.age==p.age;
    }

    @Override
    public int hashCode()
    {
//        System.out.println(this+"......hashCode");
        return name.hashCode()+age*27;  //age*27 避免hashCode重複機率...
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
}
