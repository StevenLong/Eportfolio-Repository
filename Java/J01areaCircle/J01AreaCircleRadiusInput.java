//Area of a Circle with Radius given by the user - Steven Long

import java.util.Scanner;

public class J01AreaCircleRadiusInput
{
	public static void main (String[] args)
	{

		Scanner console = new Scanner(System.in);

		final Double PI = 3.142;
		int Radius;
		Double Area;

		Radius = 0;

		System.out.print("Enter Radius: ");
		Radius = console.nextInt();

		Area = PI*Radius*Radius;

		System.out.println();
		System.out.println("Area is " + Area);
		System.out.println();

	}

}