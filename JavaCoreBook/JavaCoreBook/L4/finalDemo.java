package JavaCoreBook.L4;

class finalTest
{
	private final StringBuilder sb=new StringBuilder("initialize");
	private final int num=23;
	private final String str1="dark phoenix";


	void inFinal()
	{
//		final修飾的對象引用無法改變,但可以修改內容
//		StringBuilder sb2=new StringBuilder();
//		sb=sb2;
		sb.append(" +(append text)");
		sb.append("a"+str1.subSequence(2,str1.length()));

		StringBuilder aa=new StringBuilder();
		System.out.println(sb);

	}

}
public class finalDemo
{
	public static void main(String[] args){
		new finalTest().inFinal();

	}


}
