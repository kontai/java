
public class low
{
	public static void main(String[] args)
	{
		java.util.Date date = new java.util.Date();
		int sec=(int)((date.getTime()/1000)%60);
		System.out.println("The elapsed time since Jan 1， 1970 is " + date.getTime() + "milliseconds");
		System.out.println("Current Time is " + sec + "milliseconds");
		System.out.println(date.toString());
		for(int i=0;i<100;i++)
		{
			java.util.Random random = new java.util.Random((int) (new java.util.Date().getTime()));
			System.out.println(random.nextInt(10));
		}
		

	}
}
