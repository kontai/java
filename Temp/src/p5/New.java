package p5;


public class New
{
	public static void main(String[] args)
	{
		A a1 = new A();
		System.out.println(a1.getValues()[3]);
		a1.getValues()[0]=5;
		System.out.println(a1.getValues()[0]);

	}


}


class A
{
	private int[] values;
	A(){
		values=new int[10];
		for(int i=0;i<values.length;i++)
		values[i]=i;
	}

	public int[] getValues()
	{
		return values;
	}
}
