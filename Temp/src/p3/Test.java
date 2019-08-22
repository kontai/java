package p3;
public class Test
{
	public static void main(String[] args){
	    Count myCount=new Count();
	    int time=0;

	    for(int i=0;i<100;i++)
		{
			increment(myCount,time);
		}
		System.out.println("count is "+myCount.count);
	    System.out.println("time is "+time);


	}
		public static void increment(Count c,int times)
		{
			c.count++;
			times++;
		}


}


