package IO流.III_裝飾器;

public class PersonDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Person p = new Person();
//		p.chifan();
		
		NewPerson p1 = new NewPerson(p);
		p1.chifan();
		
		NewPerson2 p2 = new NewPerson2();
		p2.chifan();
	}

}

class Person{
	void chifan(){
		System.out.println("吃飯");
	}
}
//這個類的出現是為了增強Person而出現的。
class NewPerson{
	private Person p ;
	NewPerson(Person p){
		this.p = p;
	}
	
	public void chifan(){
		System.out.println("開胃酒");
		p.chifan();
		System.out.println("甜點");
		
	}

}

class NewPerson2 extends Person{
	public void chifan(){
		System.out.println("開胃酒");
		super.chifan();
		System.out.println("甜點");
	}
}













