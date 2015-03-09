// J13If_100_Range - Steven Long

import java.util.*;

public class J13If_100_Range
{
	public static void main(String[] args)
	{
		double number = 0;

		Scanner console = new Scanner(System.in);

		System.out.println();
		System.out.print("Enter number: ");
		number=console.nextDouble();
		System.out.println();

		if (number>0)
		{
			if (number<=100)
			{
				System.out.println("Number is in the range 1-100.");
			}
			else
			{
				System.out.println("Number is above 100.");
			}
		}
		else
		{
			System.out.println("Number is 0 or below.");
		}
		System.out.println();
	}

}