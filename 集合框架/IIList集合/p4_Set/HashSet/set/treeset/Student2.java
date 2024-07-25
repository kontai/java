package 集合框架.IIList集合.p4_Set.HashSet.set.treeset;

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
public class Student2 implements Comparable {
    private String name;
    private int age;

    @Override
    public int compareTo(Object o) {
        int length1 = this.getName().length();
        int length2 = ((Student2)o).getName().length();
        return length1 - length2;
    }

    public Student2() {
        this.name = null;
        this.age = 0;
    }

    public Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student2 student = (Student2) o;
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
