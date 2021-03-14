/**
 * The type My test.
 *
 * @author kontai
 */

public class MyTest {
    private String id;

    public String getId()
    {
        return id;
    }

    @MyMethod(id="abc",cnt=1)
    public void setId(String id)
    {
        this.id = id;
    }

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

    public MyTest(String id, String name, int age)
    {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    private String name;
    private int age;

    public MyTest()
    {
    }
}
