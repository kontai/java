package 二throw拋出異常;

/*

*/
class Demo
{
	public int method(int[] arr,int index)
	{		

		if(arr==null)
			throw new NullPointerException("數組的引用不能為空！");

		if(index>=arr.length)
		{
			throw new ArrayIndexOutOfBoundsException("數組的角標越界啦，哥們，你是不是瘋了？："+index);
		}
		if(index<0)
		{
			throw new ArrayIndexOutOfBoundsException("數組的角標不能為負數，哥們，你是真瘋了！："+index);
		}
		return arr[index];
	}
}

class  ExceptionDemo2
{
	public static void main(String[] args) 
	{
		int[] arr = new int[3];
		
		Demo d = new Demo();
		int num = d.method(null,-30);
		System.out.println("num="+num);
		System.out.println("over");
	}
	
}
