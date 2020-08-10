package 繼承;

public class Test implements Cloneable{
    public static void main(String[] args) {
        Person a=new Student();
//        com.sxt.server.basic.Person b= Student.clone(a);
//        new com.sxt.server.basic.Person().printPerson();
//        new Student().printPerson();
        a.printPerson();
        System.out.println(a.i);
    }
}
class Student extends Person
{
    int i=10;
    double d=12.35;
//    @Override
public Student(){}
    public Student(int i)
    {
//        super();
        System.out.println("Student's constructor is invoked");
    }
    public String getInfo() {
        return "Student";
    }
}

class Person {
//    public com.sxt.server.basic.Person()
//    {
//        System.out.println("com.sxt.server.basic.Person's constructor is involed");
//    }
    int i=1;
    double d=2.3;
    public String getInfo()
    {
        return "com.sxt.server.basic.Person";
    }

    public void printPerson()
    {
        System.out.println(getInfo());
    }
}

