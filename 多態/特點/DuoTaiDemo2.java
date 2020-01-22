

/*
畢老師和畢姥爺的故事。
*/

class 畢姥爺
{
	void 講課()
	{
		System.out.println("管理");
	}
	void 釣魚()
	{
		System.out.println("釣魚");
	}
}

class 畢老師 extends 畢姥爺
{
	void 講課()
	{
		System.out.println("Java");
	}
	void 看電影()
	{
		System.out.println("看電影");
	}
}





class  DuoTaiDemo2
{
	public static void main(String[] args) 
	{
//		畢老師 x = new 畢老師();
//		x.講課();
//		x.看電影();

		畢姥爺 x = new 畢老師();
		x.講課();
		x.釣魚();

		畢老師 y = (畢老師)x;//ClassCastException
		y.看電影();




	}
}
