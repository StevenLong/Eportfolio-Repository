// J41StoreRead
// Sequential file (store3.dat) with dummy 99/EOF which is not processed
// access details on bank file and o/p details on those exceed credit limit

import java.io.*;
import java.util.*;

public class J41StoreRead
{
 	public static void main(String[] args) throws FileNotFoundException
	{
		// File objects
		// Input file with month 3 store data
		Scanner inStoreFile = new Scanner(new FileReader("store3.dat"));


		final int SENTINEL = 999;
		final double INTEREST_RATE = .02;
		final double MPA = .05;
		// Store Card record layout
		int cardNo;
		String firstName;
		String surname;
		String address;
		double credLimit;
		double balance;

		String fullName;
		double interest;
		double totalInterest;
		double newBalance;
		double mpaLevel;

		// Other Vars

		interest = newBalance = mpaLevel = totalInterest = 0.00;

		cardNo = inStoreFile.nextInt();

		System.out.println("Card Name          Address  credit limit   Balance");
		System.out.println("==================================================");

		while(cardNo != SENTINEL)
	   	{
			firstName = inStoreFile.next();
			surname = inStoreFile.next();
			address = inStoreFile.next();
			credLimit = inStoreFile.nextDouble();
			balance = inStoreFile.nextDouble();

			fullName = firstName + " " + surname;
			//interest = 0;
			//interest = balance * INTEREST_RATE;
			//totalInterest

			System.out.printf("%4d %-14s%-9s%12.2f%10.2f\n", cardNo, fullName, address, credLimit, balance);

			cardNo = inStoreFile.nextInt();

		} // while

		// Close Input file

	} // main

} // class