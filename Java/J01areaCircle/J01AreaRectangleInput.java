//Area of a Rectangle with Dimentions given by the user - Steven Long

import java.util.Scanner;

public class J01AreaRectangleInput
{
	public static void main (String[] args)
	{

		Scanner console = new Scanner(System.in);


		int Height = 0;
		int Width = 0;
		double Area;



		System.out.print("Enter Height: ");
		Height = console.nextInt();

		System.out.println();
		System.out.print("Enter Width: ");
		Width = console.nextInt();

		Area = Height*(Width*0.5);

		System.out.println();
		System.out.println("Area is " + Area);
		System.out.println();

	}

}