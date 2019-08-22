package p6;
public class F
{
	public static void main(String[] args){
	    A a1=new A();
		A a2=new A();

		a1.setI(10);
		a2.setI(45);
		A.setK(22);

		C c1=new C();
		c1.setP(100);
	}



}

 class A
{
	private int i=5;
	private static double k=0;

	public void setI(int i)
	{
		this.i=i;
	}

	public static void setK(double k)
	{
		A.k=k;
	}


}
