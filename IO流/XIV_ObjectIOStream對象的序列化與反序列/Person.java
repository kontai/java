package IO流.XIV_ObjectIOStream對象的序列化與反序列;

public class Person {
    private String name;
    private int age;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    Person(String name, int age)
    {
        this.name=name;
        this.age=age;
    }
}
