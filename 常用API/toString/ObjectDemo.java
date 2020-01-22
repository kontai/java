package 常用API.toString;

/*
 * String toString()  : 返回该对象的字符串表示
 * 		 return getClass().getName() + "@" + Integer.toHexString(hashCode());
 * 		 getClass():返回一个字节码对象
 * 		 Integer.toHexString():返回指定参数的十六进制字符串形式
 * 		 hashCode()：返回该对象的哈希码值（内部地址）
 *
 *
 *
 * boolean equals(Object obj)
 *
 */
public class ObjectDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "zhangsan";
        s.age = 18;
        System.out.println(s.toString());//com.itheima_01.Student@737951b0
        System.out.println(s);//说明我们输出一个对象就是默认输出这个对象的toString()方法
    }
}

class Student extends Object {
    String name;
    int age;
	/*
	public String toString() {
		return name + "@" + age;
	}
	*/

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }


}