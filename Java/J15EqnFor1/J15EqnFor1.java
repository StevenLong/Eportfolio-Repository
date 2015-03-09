//J15EqnFor1 - Steven Long

import java.util.*;
import static java.lang.Math.pow;

public class J15EqnFor1
{
	public static void main(String[] args)
	{
		double x, y;
		int i;

		Scanner console = new Scanner(System.in);

		System.out.println();
		System.out.println("y = 3*xSquared+2*x-4		x	y");
		System.out.print("===============================================");
		System.out.println();

		for (i=1; i<=4; i++)
		{
			System.out.print("Enter value " + i + ": ");
			x = console.nextInt();

			y = 3*pow(x,2)+2*x-4;

			System.out.printf("%33.2f %7.2f \n", x, y);
			System.out.println();
		}
	}

}