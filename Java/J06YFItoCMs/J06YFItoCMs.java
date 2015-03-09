// J06YFItoCMs - Steven Long


import java.util.*;

public class J06YFItoCMs
{
	public static void main(String[] args)
	{
	Scanner console = new Scanner(System.in);

	double yards = 0;
	double feet = 0;
	double inches = 0;
	double cm = 0;

	System.out.println();
	System.out.print("Insert yards: ");
	yards = console.nextDouble();
	System.out.println();

	System.out.println();
	System.out.print("Insert feet: ");
	feet = console.nextDouble();
	System.out.println();

	System.out.println();
	System.out.print("Insert inches: ");
	inches = console.nextDouble();
	System.out.println();

	yards = 36*yards;
	feet = 12*feet;
	inches = yards+feet+inches;
	cm = inches*2.54;

	}
}