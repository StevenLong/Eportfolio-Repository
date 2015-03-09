// J12ForSumPositive - Steven long

import java.util.*;

public class J12ForSumPositive
{
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		int maxNo, posNo = 0, runningVal, i;
		double average, sum=0;

		System.out.println();
		System.out.print("Enter number of numbers: ");
		maxNo = console.nextInt();
		System.out.println();

		for (i=1; i<=maxNo; i++)
		{
			System.out.print("Enter value " + i + ": ");
			runningVal = console.nextInt();
			if (runningVal > 0)
			{
				sum+=runningVal;
				posNo++;
			}
			/*else
			{

			}
*/
		}

		if (posNo<=0)
		{
			System.out.println();
			System.out.print("No positive numbers entered.\n\n");
			//System.out.println();
			//System.out.println();
		}

		else
		{
			average=sum/posNo;

			System.out.println();
			System.out.print("Sum is: " + sum);
			System.out.println();
			System.out.println();
			System.out.print("Average is: " + average);
			System.out.println();
			System.out.println();
		}

		}

	}