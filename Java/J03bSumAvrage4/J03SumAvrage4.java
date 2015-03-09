

//J03SumAvrage4 - Steven Long

import java.util.Scanner;

public class J03SumAvrage4
{
	public static void main(String[] args )
	{

		Scanner console = new Scanner(System.in);

		int num1, num2, num3, num4;
		int ans = 0;
		double avrageOfAns = 0;
		System.out.println();
		System.out.print("Enter first number: ");
		num1 = console.nextInt();
		System.out.println();

		System.out.print("Enter second number: ");
		num2 = console.nextInt();
		System.out.println();

		System.out.print("Enter third number: ");
		num3 = console.nextInt();
		System.out.println();

		System.out.print("Enter forth number: ");
		num4 = console.nextInt();
		System.out.println();

		ans = num1+num2+num3+num4;
		avrageOfAns = ans/4.00;

		System.out.println();
		System.out.println("The sum of the numbers you entered is: " + ans);

		System.out.println();
		System.out.println("The avrage of the numbers you entered is: " + avrageOfAns);

	}

}

