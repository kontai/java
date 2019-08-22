package p5;


import java.util.Date;

public class Test
{
	public static void main(String[] args)
	{
		java.util.Date[] dates = new java.util.Date[10];
		init(dates);
		System.out.println(dates[0]);
		System.out.println(dates[0].toString());
	}

	static java.util.Date[] init(java.util.Date[] date)
	{
		for (int i = 0; i < date.length; i++)
		{
			date[i] = new Date();

		}
		return date;
	}

}

