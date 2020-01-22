package Temp.sxt;


public class User2 {
    int id;
    String name;
    String pwd;


    static String company = "sxt";

    public User2(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public User2()
    {

    }

    public void login()
    {
        System.out.println("登錄:" + name);

    }

    public void setId(int id)
    {
        this.id=id;
        System.out.println("In user2......");
    }

    public static void printCompany()
    {
        System.out.println(company);
    }

    public static void main(String[] args)
    {
//        User2 u2=new User2(2,"abc");
//        System.out.println(new BigDecimal(PI));
//        BigDecimal bd=new BigDecimal(PI);
//        u2.login();
        User2 u3=new UI(23,"jj");
        System.out.println(u3.id);
        u3.setId(66);
        System.out.println(u3.id+",u3="+u3);
        System.out.println(u3.getClass());
    }

}

class UI extends User2{

    int id;
    String name;

    public UI(int id, String name)
    {
        super();
        this.id=id;
        this.name=name;
    }

    @Override
    public void setId(int id)
    {
        super.id=id;
        this.id=id;
        System.out.println("In UI...");
    }

    @Override
    public String toString()
    {
        return "UI{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}