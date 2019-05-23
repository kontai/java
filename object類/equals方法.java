package object類;

class Person{
    int age=20;
    Person(int age){
        this.age=age;
    }

    public boolean equals(Object obj)
    {

        //return this.age==obj.age;  //obj已經向上轉型,無法調用子類特有成員
        Person p= (Person) obj;
        return this.age==p.age;
    }

}

class Demo{

}

public class equals方法 {
    public static void main(String[] args){
        Person p1=new Person(20);
        Person p2=new Person(20);
        System.out.println(p1==p2);
        System.out.println(p1.equals(p2));

        Demo d=new Demo();
        System.out.println(p1.equals(d));



    }
}
