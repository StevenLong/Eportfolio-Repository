// Coin Practice Exam 2 template
// Program Id - Name - Description here

import java.util.*;
import java.io.*;

public class LongStevenPracticeLabExCoin
{
    public static void main(String[] args) throws FileNotFoundException
    {

		Scanner inCoinFile = new Scanner(new FileReader("Coin.dat"));

		String name, country, metalName = "";
		int year, oldestYear, avgValue, sale1, sale2, sale3, coinCount, copperCount, silverCount, goldCount, unknownCount;
		char metal;
		double faceValue;

		// File Objects/Variables
		// Other Variables

		coinCount = copperCount = silverCount = goldCount = unknownCount = avgValue = 0;
		// Initailise variables
		System.out.println("Steven Long - Practice");
		System.out.println("");
		System.out.println("Year Name      Metal     Country Face Val Sale 1 Sale 2 Sale 3   Aver");
		System.out.println("=====================================================================");
		// Record Layout

		while(inCoinFile.hasNext())
		{
			year = inCoinFile.nextInt();
			name = inCoinFile.next();
			faceValue = inCoinFile.nextDouble();
			metal = inCoinFile.next().charAt(0);
			country = inCoinFile.next();
			sale1 = inCoinFile.nextInt();
			sale2 = inCoinFile.nextInt();
			sale3 = inCoinFile.nextInt();

			avgValue = (sale1 + sale2 + sale3) / 3;

			coinCount++;

			switch(metal){

				case 'c':
				case 'C':
				copperCount++;
				metalName = "Copper";
				break;

				case 's':
				case 'S':
				silverCount++;
				metalName = "Silver";
				break;

				case 'g':
				case 'G':
				goldCount++;
				metalName = "Gold";
				break;

				case 'x':
				case 'X':
				unknownCount++;
				metalName = "unknown";
				break;
			}

			System.out.printf("%-5d%-10s%-10s%-8s%8.2f%7d%7d%7d%7d\n", year, name, metalName, country, faceValue, sale1, sale2, sale3, avgValue);



		// Screen and Report Header

		// Main file Input until EOF

		// Output Footer details to Screen and Report

		// Close file

    }  // main
System.out.printf("%20s%4d\n", "Coin count:", coinCount);
			System.out.printf("%20s%4d\n", "Copper count:", copperCount);
			System.out.printf("%20s%4d\n", "Silver count:", silverCount);
			System.out.printf("%20s%4d\n", "Gold count:", goldCount);
			System.out.printf("%20s%4d\n", "Unknown count", unknownCount);
}

}// LastNameFirstNameLabEx2