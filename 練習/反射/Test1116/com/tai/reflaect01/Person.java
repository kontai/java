package Test1116.com.tai.reflaect01;

public class Person {
    public String pname;
    private int page;
    String paddress;
    public static int pid = 2266;

    public Person() {
        super();
    }

    public Person(String pname, int page, String paddress) {
        this.pname = pname;
        this.page = page;
        this.paddress = paddress;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getPaddress() {
        return paddress;
    }

    public void setPaddress(String paddress) {
        this.paddress = paddress;
    }

    public static int getPid() {
        return pid;
    }

    public static void setPid(int pid) {
        Person.pid = pid;
    }

    @Override
    public String toString() {
        return "Person{" +
                "pname='" + pname + '\'' +
                ", page=" + page +
                ", address='" + paddress + '\'' +
                '}';
    }
}
