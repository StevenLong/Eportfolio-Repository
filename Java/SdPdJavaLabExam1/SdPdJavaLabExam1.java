//Steven Long - SdPdJavaLabExam1

import java.util.Scanner;

public class SdPdJavaLabExam1
{
	public static void main(String[] args)
	{
		final double CALLOUT_FEE = 15.00;
		final double MAN_HOUR = 5.00;
		final double MOW_RATE = 0.50;
		final double WEED_MED = 5.00;
		final double WEED_SMALL = WEED_MED*.80;
		final double WEED_BIG = WEED_MED*1.20;
		final double WASTE_DIS = 10.00;
		final double VAT_RATE = 20.00;

		int numLawns, i, labour, mowSize, flowerBeds, wasteDisposal;
		char flowerBedType;
		double manHours, labourCost, mowCost, flowerBedCost, disposalCost, grossCost, discountCost, netCost, vatCost, finalCost;
		double totalLabour, totalMow, totalBeds, totalGross, totalDisc, totalNet, totalVat, finalTotal;
		int discCount50, discCount100, discCount200, discCountOver200;
		double discUpTo50, discUpTo100, discUpTo200, discOver200 ,averageDisc = 0;

		discCount50 = discCount100 = discCount200 = discCountOver200 = 0;
		discUpTo50 = discUpTo100 = discUpTo200 = discOver200 = 0;
		totalLabour = totalMow = totalBeds = totalGross = totalDisc = totalNet = totalVat = finalTotal = 0.00;
		manHours = labourCost = mowCost = flowerBedCost = disposalCost = grossCost = discountCost = netCost = vatCost = finalCost = 0.00;

		Scanner console = new Scanner(System.in);

		System.out.println();
		System.out.print("Number of lawns mowed today? ");
		numLawns = console.nextInt();
		System.out.println();

		System.out.printf("%-15s %6s %6s %6s %6s %6s %6s %6s %6s %6s", "Steven Long Lex 1", "Lawn", "Labour", "Mow", "Beds", "Gross", "Disc", "Net", "Vat", "Final");
		System.out.println("================================================================================");

		for(i = 1; i <= numLawns; i++)
		{
			System.out.println("Hrs/Size/Beds/Type/Disp " + i + ":");
			manHours = console.nextDouble();
			mowSize = console.nextInt();
			flowerBeds = console.nextInt();
			flowerBedType = console.next().charAt(0);
			wasteDisposal = console.nextInt();

			labourCost = manHours*MAN_HOUR;
			mowCost = mowSize*MOW_RATE;

			if(flowerBeds > 0)
			{
				if(flowerBedType == 's' || flowerBedType == 'S')
				{
					flowerBedCost = flowerBeds*WEED_SMALL;
				}

				else if(flowerBedType == 'm' || flowerBedType == 'M')
				{
					flowerBedCost = flowerBeds * WEED_MED;
				}

				else if(flowerBedType == 'b' || flowerBedType == 'B')
				{
					flowerBedCost = flowerBeds*WEED_BIG;
				}
			}

			if(wasteDisposal == 0)
			{
				disposalCost = 0;
			}

			else
			{
				disposalCost =  WASTE_DIS;
			}

			grossCost = CALLOUT_FEE + labourCost + mowCost + flowerBedCost + disposalCost;

			if(grossCost >= 00.01 && grossCost <= 50.00)
			{
				discountCost = 0;
				discCount50++;
				discUpTo50 += discountCost;
			}

			else if(grossCost >= 50.01 && grossCost <= 100.00)
			{
				discountCost = grossCost * 3.0 / 100;
				discCount100++;
				discUpTo100 += discountCost;
			}

			else if(grossCost >= 100.01 && grossCost <= 200)
			{
				discountCost = grossCost * 6.0 / 100;
				discCount200++;
				discUpTo200 += discountCost;
			}

			else
			{
				discountCost = grossCost * 10.0 / 100;
				discCountOver200++;
				discOver200 += discountCost;
			}

			netCost = grossCost - discountCost;
			vatCost = netCost * VAT_RATE/100;
			finalCost = netCost + vatCost;

			//System.out.println(i + " " + labourCost + " " + mowCost + " " + flowerBedCost + " " + grossCost + " " + discountCost + " " + netCost + " " + vatCost + " " + finalCost + "\n");
			System.out.printf("%24d %6.2f %6.2f %6.2f %6.2f %6.2f %6.2f %6.2f %6.2f\n",i, labourCost, mowCost, flowerBedCost, grossCost, discountCost, netCost, vatCost, finalCost);

			totalLabour += labourCost;
			totalMow += mowCost;
			totalBeds += flowerBedCost;
			totalGross += grossCost;
			totalDisc += discountCost;
			totalNet += netCost;
			totalVat += vatCost;
			finalTotal += finalCost;
		}

		System.out.println("================================================================================");
		//System.out.println("Totals: " + totalLabour + " " + totalMow + " " + totalBeds + " " + totalGross + " " + totalDisc + " " + totalNet + " " + totalVat + " " + finalTotal);
		//System.out.printf("%15s %6.2f %6.2f %6.2f %6.2f %6.2f %6.2f %6.2f %6.2f", "Totals: ", totalLabour, totalMow, totalBeds, totalGross, totalDisc, totalNet, totalVat, finalTotal);
		System.out.printf("%24s %6.2f %6.2f %6.2f %6.2f %6.2f %6.2f %6.2f %6.2f\n", "Totals: ", totalLabour, totalMow, totalBeds, totalGross, totalDisc, totalNet, totalVat, finalTotal);
		System.out.println("================================================================================\n");

		System.out.printf("UpTo  50 Discount Count: %2d Value:  %3.2f\n", discCount50, discUpTo50);
		System.out.printf("UpTo 100 Discount Count: %2d Value:  %3.2f\n", discCount100, discUpTo100);
		System.out.printf("UpTo 200 Discount Count: %2d Value:  %3.2f\n", discCount200, discUpTo200);
		System.out.printf("Over 200 Discount Count: %2d Value:  %3.2f\n\n", discCountOver200, discOver200);

		averageDisc = discUpTo50 + discUpTo100 + discUpTo200 + discOver200;

		System.out.printf("    Average Discount (excluding 0): %2.2f\n", averageDisc);
	}
}