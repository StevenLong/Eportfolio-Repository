//J11IfPosOrNeg - Steven Long

import java.util.*;

public class J11IfPosOrNeg
{
	public static void main(String[] args)
	{

		int number = 0;

		Scanner console = new Scanner(System.in);

		System.out.println();
		System.out.print("Enter a positive or Negative number: ");
		number = console.nextInt();
		System.out.println();

		if (number >= 0)
		{
			System.out.print("Number is positive");
			System.out.println();

		}

		if (number < 0)
		{
		System.out.print("Number is negative!!!1!");
		System.out.println();


		}

		}


	}