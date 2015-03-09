//LongStevenJass1 - Steven Long
//House Sales Revinue

import java.util.Scanner;

public class LongStevenJass1
{

	public static void main(String []args)
	{
		final double FIXED_CHARGE = 1000.00;
		final double COMMISSION = 1.00;
		final double SALES_EXCEEDED = 250000.00;

		Scanner console = new Scanner(System.in);

		int i, maxHouses, largeNo = 0;
		double salePrice, comm, averageComm, averageSales, totalComm, largeSales = 0, largeAverage = 0;
		double totalSales = totalComm = 0;

		System.out.println();
		System.out.print("Number of houses sold? ");
		maxHouses = console.nextInt();

		System.out.println();
		System.out.printf("Your Name Here %15s %12s %12s\n", "No", "Sale Price", "Comm");
		System.out.println("========================================================");

		for(i = 1; i <= maxHouses; i++)
		{
			System.out.println();
			System.out.print("House price " + i + ": ");
			salePrice = console.nextDouble();

			comm = salePrice/COMMISSION/100 + FIXED_CHARGE;
			totalSales += salePrice;
			totalComm += comm;

			if(salePrice > 250000)
			{
				largeNo++;
				largeSales += salePrice;
			}

			//System.out.println(i + " " + salePrice + " " + comm);
			System.out.printf("%30d %12.2f %12.2f \n", i, salePrice, comm);
		}

		System.out.println("========================================================");

		averageSales = totalSales/maxHouses;
		averageComm = totalComm/maxHouses;
		largeAverage = largeSales/largeNo;

		//System.out.println("Totals: " + totalSales + " " + totalComm);
		//System.out.println("Averages: " + averageSales + " " + averageComm);
		System.out.printf("%30s %12.2f %12.2f\n", "Totals: ", totalSales, totalComm);
		System.out.printf("%30s %12.2f %12.2f\n", "Averages: ", averageSales, averageComm);

		if(largeNo > 0)
		{
			System.out.println();
			/*System.out.println("Number sold > 250k: " + largeNo);
			System.out.println("Total Sales > 250k: " + largeSales);
			System.out.println("Average Sales > 250k: " + largeAverage);*/
			System.out.printf("%-23s %14d\n", "Number Sold > 250k: ", largeNo);
			System.out.printf("%-23s %14.2f\n", "Total Sales > 250k: ", largeSales);
			System.out.printf("%-23s %14.2f\n", "Average Sales > 250k: ", largeAverage);
		}
		else
		{
			System.out.println();
			System.out.println("No sales above 250k :(");
		}
	}

} // SurnameFirstNameJass1