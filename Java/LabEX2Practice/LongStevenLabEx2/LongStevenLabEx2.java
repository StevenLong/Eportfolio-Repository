//LongStevenLabEx2 - Steven Long
//Customer Electric Supply maintenance

import java.util.*;
import java.io.*;

public class LongStevenLabEx2
{
	public static void main(String []args) throws FileNotFoundException
	{
		Scanner inElectricFile = new Scanner(new FileReader("Electric.dat"));

		final double UNIT_COST = 0.10;


		String customerID, custFirstName, custLastName, custFullName, custTypeFull;
		char custType;
		double custStandCharge, runningCost;
		int u1, u2, u3, u4, u5, u6, uTotal, avg;

		int custCount, inactiveCount, businessCount, concessionCount, domesticCount, pendingCount;
		int leastUntis, leastUnitsPeriod, numBusRecords;
		String leastUnitsName;

		System.out.println("Steven Long - Lab Exam 2");
		System.out.println("Id  Name                Type  Stand   u1   u2   u3   u4   u5   u6  Avg   Cost ");
		System.out.println("==============================================================================");

		while (inElectricFile.hasNext())
		{
			customerID = inElectricFile.next();
			custFirstName = inElectricFile.next();
			custLastName = inElectricFile.next();
			custType = inElectricFile.next().charAt(0);
			custStandCharge = inElectricFile.nextDouble();
			u1 = inElectricFile.nextInt();
			u2 = inElectricFile.nextInt();
			u3 = inElectricFile.nextInt();
			u4 = inElectricFile.nextInt();
			u5 = inElectricFile.nextInt();
			u6 = inElectricFile.nextInt();

			uTotal = u1 + u2+ u3 + u4 + u5 + u6;

			custFullName = custLastName + " " + custFirstName;

			switch(custType)
			{
				case 'b':
				case 'B':
				custTypeFull = "Business"
				break;

				case 'c':
				case 'C':
				custTypeFull = "Consess"
				break;

				case 'd':
				case 'D':
				custTypeFull = "Domestic"
				break;
			}


			}

			System.out.printf("%4s%14s%9s%7.2f%5d%5d%5d%5d%5d%5d%5d%8.2f", customerID, custFullName, custStandCharge);


		}//while end

	}//main end

}// end