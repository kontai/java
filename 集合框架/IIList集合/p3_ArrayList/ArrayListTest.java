package 集合框架.IIList集合.p3_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person p1 = new Person("lisi1",21);
		
		ArrayList al = new ArrayList();
		al.add(p1);
		al.add(new Person("lisi2",22));
		al.add(new Person("lisi3",23));
		al.add(new Person("lisi4",24));
		
		Iterator it = al.iterator();
		while(it.hasNext()){
//			System.out.println(((com.sxt.server.basic.Person) it.next()).getName()+"::"+((com.sxt.server.basic.Person) it.next()).getAge());
			Person p = (Person) it.next();
			System.out.println(p.getName()+"--"+p.getAge());
		}
//		al.add(5);//al.add(new Integer(5));
	}
	

}
