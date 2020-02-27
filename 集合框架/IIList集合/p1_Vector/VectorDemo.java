package 集合框架.IIList集合.p1_Vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Vector v = new Vector();

		v.addElement("abc1");
		v.addElement("abc2");
		v.addElement("abc3");
		v.addElement("abc4");

		Running run=new Running();
		Thread t1=new Thread(run);
		Thread t2=new Thread(run);
		Thread t3=new Thread(run);
		t1.start();
		t2.start();
//		t3.start();


/*

		Iterator it = v.iterator();

		while(it.hasNext()){
			System.out.println("next:"+it.next());
		}
*/

	}

}

class Running   implements Runnable {
	private int i=0;
	public void run ()
	{

		while(true)
		{
			System.out.println(Thread.currentThread().getName()+" "+i++);
			try{Thread.sleep(100);}catch( InterruptedException e){};

		}

//		Enumeration en = v.elements();
//		while(en.hasMoreElements()){
//			System.out.println("nextelment:"+en.nextElement());
	}
}
