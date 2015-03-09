// J40BankCard - Gerry Agnew

// bank.dat - seq text file
// Access bank file and output those exceeded credit limit

import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

public class J40BankCard
{
 	public static void main(String[] args)
 							throws FileNotFoundException
	{
		// Declare Bank file objects
		Scanner inBankFile = new Scanner(new FileReader("bank.dat"));

		// PrintWriter outBankRep = new PrintWriter("BankRep.dat");
		// PrintWriter outBankFile = new PrintWriter("OverLimit.dat");

		// Bank file record layout/vars
		int accNo;
		String firstName;
		String surname;
		char branch;
		double creditLimit;
		double balance;

		// Declare Other Variables
		int countCust, countOverdrawn;
		double totalBalances;
		String fullName, branchName;
		int nCount, sCount, eCount, wCount;

		String findAccName;
		double findBalance = 0;

		// Initialise
		countCust = countOverdrawn = 0;
		nCount = sCount = eCount = wCount = 0;
		totalBalances = findBalance = 0.0;
		branchName = " ";

		while(inBankFile.hasNext())
		{
			accNo = inBankFile.nextInt();
			firstName =  inBankFile.next();
			surname =  inBankFile.next();
			branch =  inBankFile.next().charAt(0);
			creditLimit =  inBankFile.nextDouble();
			balance =  inBankFile.nextDouble();

			++countCust;

			totalBalances += balance;
			fullName = firstName + " " + surname;

			switch(branch)
			{
				case 'n':
				case 'N':
				branchName = "North";
				break;

				case 's':
				case 'S':
				branchName = "South";
				break;

				case 'e':
				case 'E':
				branchName = "East";
				break;

				case 'w':
				case 'W':
				branchName = "West";
				break;
			}

			System.out.printf("%2d %-20s %6s %10.2f", accNo, fullName, branchName, balance, );
		}

	}  // main

} // class