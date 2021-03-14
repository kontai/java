
/**
 * @author kontai
 */
@anno1Table("testTable")
public class Demo1 {
    @anno1Field(name="id",type="int",len=10)
    private int id;
    @anno1Field(name="sname",type="varchar",len=10)
    private String name;
    @anno1Field(name="age",type="int",len=3)
    private int length;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
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

    public int getLength()
    {
        return length;
    }

    public void setLength(int length)
    {
        this.length = length;
    }
}
