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
		int bankAccNo;
		String bankFirstName;
		String bankSurname;
		char bankBranch;
		double bankCreditLimit;
		double bankBalance;

		// Declare Other Variables
		int countCustomers, countOverdrawn;
		double totalBalances;
		String fullName, bankBranchName;
		int nCount, sCount, eCount, wCount;

		String findAccName;
		double findBalance = 0;

		// Initialise
		countCustomers = countOverdrawn = 0;
		nCount = sCount = eCount = wCount = 0;
		totalBalances = findBalance = 0.0;
		bankBranchName = " ";

		// while loop until EOF encountered

	}  // main

} // class