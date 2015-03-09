//J16EurosDollarsDownTo - Steven Long

import java.util.*;

public class J16EurosDollarsDownTo
{
	public static void main(String[] args)
	{
			double conversionRate=1.395, euro, dollar;
				int i;

				Scanner console = new Scanner(System.in);

				//System.out.println();
				//System.out.print("Enter conversion rate: ");
				//conversionRate = console.nextDouble();
				System.out.println();

				System.out.println("  Euros    Dollars @1.395");
				System.out.println("==========================");

				for(i=100; i>=10; i-=10)
				{
					euro = i;
					dollar = i*conversionRate;
					//System.out.println();
					//System.out.print(euro + " " + dollar);
					System.out.printf("%7.2f  %9.2f \n", euro, dollar);

				}

		System.out.println();


	}

}