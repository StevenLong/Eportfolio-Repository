

//J03SumAvrage4 - Steven Long

import java.util.Scanner;

public class J03cSumAvrage4
{
	public static void main(String[] args )
	{

		Scanner console = new Scanner(System.in);

		int num1 = 0;
		int ans = 0;
		double avrageOfAns = 0;
		System.out.println();
		System.out.print("Enter first number: ");
		num1 = console.nextInt() + num1;
		System.out.println();

		System.out.print("Enter second number: ");
		num1 = console.nextInt() + num1;
		System.out.println();

		System.out.print("Enter third number: ");
		num1 = console.nextInt() + num1;
		System.out.println();

		System.out.print("Enter forth number: ");
		num1 = console.nextInt() + num1;
		System.out.println();

		ans = num1;
		avrageOfAns = ans/4.00;

		System.out.println();
		System.out.println("The sum of the numbers you entered is: " + ans);

		System.out.println();
		System.out.println("The avrage of the numbers you entered is: " + avrageOfAns);

	}

}

