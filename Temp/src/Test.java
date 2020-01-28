package src;

public class Test
{
	public static void main(String[] args)
	{
		Circle circlel = new Circle(1);
		Circle circle2 = new Circle(2);
		swap1(circlel, circle2);
		System.out.println("After swap1: circlel = " + circlel.radius + " circle2 = " + circle2.radius);
		swap2(circlel, circle2);
		System.out.println("After swap2: circlel = " + circlel.radius + " circ1e2 = " + circle2.radius);
	}

	public static void swap1(Circle x, Circle y)
	{
		Circle temp = x;
		x = y;
		y = temp;
		System.out.println("in swap1: circlel = " + x.radius + " circle2 = " + y.radius);
	}

	public static void swap2(Circle x, Circle y)
	{
		double temp = x.radius;
		x.radius = y.radius;
		y.radius = temp;
	}
}

class Circle
{
	double radius;

	Circle(double newRadius)
	{
		radius = newRadius;
	}
}
