package 集合框架.III泛型.V泛型限定;

import 集合框架.III泛型.III_自定義泛型.I泛型類.Student;
import 集合框架.III泛型.II_comparator.Person;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class GenericAdvanceDemo2 {

    /**
     * @param args
     */
    public static void main(String[] args) {

        ArrayList<Person> al = new ArrayList<Person>();

        al.add(new Person("abc", 30));
        al.add(new Person("abc4", 34));

        ArrayList<Student> al2 = new ArrayList<Student>();

        al2.add(new Student("stu1", 11));
        al2.add(new Student("stu2", 22));
        ArrayList<String> al3 = new ArrayList<String>();

        al3.add("stu3331");
        al3.add("stu33332");

        printCollection(al2);
        printCollection(al);
    }

    /**
     * 迭代並打印集合中元素。
     *
     * 可以對類型進行限定：
     * ? extends E:接收E類型或者E的子類型對象。上限！
     *
     * ? super E ：接收E類型或者E的父類型。下限！
     *
     * @param al
     */
	/*public static void printCollection(Collection<? extends com.sxt.server.basic.Person> al) //等同1Collection<com.sxt.server.basic.Person> al = new ArrayList<Dog>(),錯誤，左右類型限定不匹配!
	{
		Iterator<? extends com.sxt.server.basic.Person> it = al.iterator();

		while(it.hasNext()){
//			T str = it.next();
//			System.out.println(str);
//			System.out.println(it.next().toString());
			com.sxt.server.basic.Person p = it.next();

			System.out.println(p.getName()+":"+p.getAge());
		}

	}*/
    public static void printCollection(Collection<? super Student> al) {
        Iterator<? super Student> it = al.iterator();

        while (it.hasNext()) {

            System.out.println(it.next());
        }
    }

}
