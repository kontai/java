package 繼承.ll;

public class Test implements Cloneable{
    public static void main(String[] args) {
        Person a=new Student();
//        Person b= Student.clone(a);
//        new Person().printPerson();
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
//    public Person()
//    {
//        System.out.println("Person's constructor is involed");
//    }
    int i=1;
    double d=2.3;
    public String getInfo()
    {
        return "Person";
    }

    public void printPerson()
    {
        System.out.println(getInfo());
    }
}

