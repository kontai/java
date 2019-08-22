package p6;

public class C
{
	private int p;

	public C(int p)
	{
		this.p=p;
	}

	public C()
	{
		this(0);
		System.out.println("C's no-arg constructor invoked");
	}



	public void setP(int p)
	{
		p=p;
	}
}
