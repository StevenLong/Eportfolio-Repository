//J07ForSumAverage - Steven Long


import java.util.*;

public class J07ForSumAverage
{
	public static void main(String[] args)
	{

		Scanner console = new Scanner(System.in);

		int input = 0;
		int runningVal = 0;
		int average;
		int foo;

		System.out.println();
		System.out.print("How many numbers: ");
		foo = console.nextInt();

		for (int i = 1; i<=foo; i++)
		{
			System.out.println();
			System.out.print("Enter value " + i + " : ");
			input = console.nextInt();
			System.out.println();
			System.out.println();

			runningVal = runningVal + input;
		}

		System.out.println();
		System.out.print("Sum is : " + runningVal);
		System.out.println();

		average = runningVal/foo;

		System.out.println();
		System.out.print("Average is : " + average);
		System.out.println();
		System.out.println();




		}








	}