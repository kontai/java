package JavaCoreBook.L4;

import java.util.*;

/**
 * This program demonstrates object construction.
 * @version 1.01 2004-02-19
 * @author Cay Horstmann
 */
public class ConstructorTest
{
	public static void main(String[] args)
	{
		// fill the staff array with three EmployeeB objects
		EmployeeB[] staff = new EmployeeB[3];

		staff[0] = new EmployeeB("Harry", 40000);
		staff[1] = new EmployeeB(60000);
		staff[2] = new EmployeeB();

		// print out information about all EmployeeB objects
		for (EmployeeB e : staff)
			System.out.println("name=" + e.getName() + ",id=" + e.getId() + ",salary="
					+ e.getSalary());
	}
}

class EmployeeB
{
	private static int nextId;

	private int id;
	private String name = ""; // instance field initialization
	private double salary;

	// static initialization block
	static
	{
		Random generator = new Random();
		// set nextId to a random number between 0 and 9999
		nextId = generator.nextInt(10000);
	}

	// object initialization block
	{
		id = nextId;
		nextId++;
	}

	// three overloaded constructors
	public EmployeeB(String n, double s)
	{
		name = n;
		salary = s;
	}

	public EmployeeB(double s)
	{
		// calls the EmployeeB(String, double) constructor
		this("EmployeeB #" + nextId, s);
	}

	// the default constructor
	public EmployeeB()
	{
		// name initialized to ""--see above
		// salary not explicitly set--initialized to 0
		// id initialized in initialization block
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
}
