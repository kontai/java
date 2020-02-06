package StringBuilder字符串容器for單線程;

public class StringBuilderDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		/*
		 * jdk1.5以後出現了功能和StringBuffer一模一樣的對象。就是StringBuilder
		 * 
		 * 不同的是：
		 * StringBuffer是線程同步的。通常用於多線程。
		 * StringBuilder是線程不同步的。通常用於單線程。 它的出現提高效率。
		 * 
		 * jdk升級：
		 * 1，簡化書寫。
		 * 2，提高效率。
		 * 3，增加安全性。
		 */
		
		
	}

}
/*

class StringBuffer jdk1.0
{
	object lock;
	public   StirngBuffer append(int x)
	{
		synchronized(lock)
		{
		}
	}
	
	
	public synchronized StringBuffer delete(int start,int end)
	{
		synchronized(lock)
		{
		}
	}
}









*/

