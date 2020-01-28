package JavaCoreBook.L4;

/**
 * This program demonstrates static methods.
 * @version 1.01 2004-02-19
 * @author Cay Horstmann
 */
public class StaticTest
{
	public static void main(String[] args)
	{
		// fill the staff array with three EmployeeP objects
		EmployeeP[] staff = new EmployeeP[3];

		staff[0] = new EmployeeP("Tom", 40000);
		staff[1] = new EmployeeP("Dick", 60000);
		staff[2] = new EmployeeP("Harry", 65000);

		// print out information about all EmployeeP objects
		for (EmployeeP e : staff)
		{
			e.setId();
			System.out.println("name=" + e.getName() + ",id=" + e.getId() + ",salary="
					+ e.getSalary());
		}

		int n = EmployeeP.getNextId(); // calls static method
		System.out.println("Next available id=" + n);
	}
}

class EmployeeP
{
	private static int nextId = 1;

	private String name;
	private double salary;
	private int id;

	public EmployeeP(String n, double s)
	{
		name = n;
		salary = s;
		id = 0;
	}

	public String getName()
	{
		return name;
	}

	public double getSalary()
	{
		return salary;
	}

	public int getId()
	{
		return id;
	}

	public void setId()
	{
		id = nextId; // set id to next available id
		nextId++;
	}

	public static int getNextId()
	{
		return nextId; // returns static field
	}

	public static void main(String[] args) // unit test
	{
		EmployeeP e = new EmployeeP("Harry", 50000);
		System.out.println(e.getName() + " " + e.getSalary());
	}
}
