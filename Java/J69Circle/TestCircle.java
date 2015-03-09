import java.util.*;

public class TestCircle
{
	public static Scanner console = new Scanner(System.in);

	public static void main(String[] args)
	{

		double radius;
		Circle firstCircle = new Circle();
		System.out.println("awoduhoduW " + firstCircle.toString());

		Circle secondCircle = new Circle(5.00);
		System.out.println("sadfetg " + secondCircle.toString());

		System.out.print("Enter a radius: ");
		radius = console.nextDouble();

		secondCircle.setCircle(radius);
		System.out.println("asdasdasd " + secondCircle.toString());

		//secondCircle.area();
		System.out.println("area " + secondCircle.area());

		System.out.println("Circumference " + secondCircle.perimeter());

	}
}