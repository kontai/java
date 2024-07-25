package 集合框架.IVMap集合.hashMap;

/**
 * ClassName: Student
 * Package: 集合框架.IVMap集合.hashMap
 * Description:
 *
 * @Author Kontai
 * @Create 2024/7/24 下午3:52
 * @Version 1.0
 */
public class Student {

    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
