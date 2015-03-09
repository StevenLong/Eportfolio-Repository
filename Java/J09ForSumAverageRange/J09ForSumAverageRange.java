//J09ForSumAverageRange - Steven Long
//Sum and Average of numbers within a range using a for loop

import java.util.*;

public class J09ForSumAverageRange
{
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);

		int i, numStart, numEnd, counter = 0, sum = 0, average = 0;

		System.out.println();
		System.out.print("Enter starting number: ");
		numStart = console.nextInt();
		System.out.print("Enter end number: ");
		numEnd = console.nextInt();

		for (i = numStart; i <= numEnd; i++)
		{
			counter+=1;
			sum+=i;
		}

		average=sum/counter;

		System.out.println();
		System.out.printf("Sum is:     %6d", sum);
		System.out.println();
		System.out.printf("Average is: %6d", average);
		System.out.println();

	}

}








