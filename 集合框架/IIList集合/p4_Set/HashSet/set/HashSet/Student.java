package 集合框架.IIList集合.p4_Set.HashSet.set.HashSet;

import java.util.Objects;

/**
 * ClassName: Student
 * Package: com.tai.Set
 * Description:
 *
 * @Author Kontai
 * @Create 2024/7/24 上午9:01
 * @Version 1.0
 */
public class Student {
    private String name;
    private int age;

    public Student() {
        this.name=null;
        this.age=0;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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
}
