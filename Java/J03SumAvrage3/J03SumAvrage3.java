

//J03SumAvrage3 - Steven Long

import java.util.Scanner;

public class J03SumAvrage3
{
	public static void main(String[] args )
	{

		Scanner console = new Scanner(System.in);

		int num1, num2, num3;
		int ans = 0;
		int avrage = 0;

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

		ans = num1+num2+num3;
		avrage = ans/3;

		System.out.println();
		System.out.println("The sum of the numbers you entered is: " + ans);

		System.out.println();
		System.out.println("The avrage of the numbers you entered is: " + avrage);

	}

}

