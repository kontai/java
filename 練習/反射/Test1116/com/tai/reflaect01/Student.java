package Test1116.com.tai.reflaect01;

import java.sql.Struct;

public class Student extends Person {
    public String sname="kontai";
    private int sage;
    String saddress;
    public static int sid = 5566;

    public Student() {
        super();
    }

    public Student(String pname, int page, String paddress, String sname, int sage, String saddress) {
        super(pname, page, paddress);
        this.sname = sname;
        this.sage = sage;
        this.saddress = saddress;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getSage() {
        return sage;
    }

    public void setSage(int sage) {
        this.sage = sage;
    }

    public String getSaddress() {
        return saddress;
    }

    public void setSaddress(String saddress) {
        this.saddress = saddress;
    }

    public static int getSid() {
        return sid;
    }

    public static void setSid(int sid) {
        Student.sid = sid;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sname='" + sname + '\'' +
                ", sage=" + sage +
                ", saddress='" + saddress + '\'' +
                '}';
    }
}
