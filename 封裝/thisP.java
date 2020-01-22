package 封裝;

class Person {
    int id;
    String name;
    int age;

    public Person(int id, String name, int age) {
        // java中,同名局部變量,不會自動幫忙加上this
        //id=id;
        //name=name;
        //age=age;
        this(name);    ///可以利用this調用另一個建構式
        this.id = id;
        //this.name=name;
        this.age = age;
        //this();    //利用this.調用其他建構式,必須擺在最前面
        System.out.println("三個形參的建構式被調用");

    }

    public Person(String name) {
        this.name = name;
        System.out.println("一個形參的建構式被調用");
    }

    public Person() {
        System.out.println("無形參的建構式被調用");
    }

    public boolean comPare(Person xx) {

        return this.age > xx.age;
    }
}

class thisP {
    public static void main(String[] args) {

        Person p1 = new Person(1, "nick", 30);
        System.out.println("Name=" + p1.name + "\nid=" + p1.id + "\nage=" + p1.age);
        Person p2 = new Person(2, "tai", 40);
        System.out.println(p1.comPare(p2));

    }
}