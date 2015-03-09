//J10EuroSterling - Steven Long

import java.util.*;

public class J10EuroSterling
{
	public static void main(String [] args)
	{

		double conversionRate, euro, sterling;
		int i;

		Scanner console = new Scanner(System.in);

		System.out.println();
		System.out.print("Enter conversion rate: ");
		conversionRate = console.nextDouble();
		System.out.println();

		System.out.println("Euro            Sterling");
		System.out.println("=========================");

		for(i=5; i<=50; i+=5)
		{
			euro = i;
			sterling = i*conversionRate;
			System.out.println();
			//System.out.print(euro + " " + sterling);
			System.out.printf("%5.2f %16.2f", euro, sterling);

		}

		System.out.println();

		}

	}