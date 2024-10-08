package 匿名內部類.應用;

interface Inter
{
	void show1();
	void show2();
}

class Outer
{
	/*
	class Inner implements Inter
	{
		public void show1()
		{
		}
		public void show2()
		{
		
		}
	}
	*/

	public void method()
	{
//		Inner in = new Inner();
//		in.show1();
//		in.show2();
		

		Inter in = new Inter()
		{
			public void show1()
			{
				
			}
			public void show2()
			{
			
			}
			public void show3(){}
			
		};
		in.show1();
		in.show2();
//		in.show3(); Inner無此方法
	}
}


/*
通常的使用場景之一：
當函數參數是接口類型時，而且接口中的方法不超過三個(含）。
可以用匿名內部類作為實際參數進行傳遞
*/
class InnerClassDemo5 
{

	class Inner
	{
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		/*
		show(new Inter()
		{
			public void show1(){}
			public void show2(){}
		});
		*/

//		new Inner();
	}

	public void method()
	{
		new Inner();
	}

	public static void show(Inter in)
	{
		in.show1();
		in.show2();
	}
}

