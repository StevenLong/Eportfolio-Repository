// J41StoreReadWrite
// Sequential file (store3.dat) with dummy 99/EOF which is not processed
// access details on bank file and o/p details on those exceed credit limit

import java.io.*;
import java.util.*;

public class J41StoreReadWrite
{
 	public static void main(String[] args) throws FileNotFoundException
	{
		// File objects
		// Input file with month 3 store data
		Scanner inStoreFile = new Scanner(new FileReader("store3.dat"));
		PrintWriter outStoreFile = new PrintWriter("store4.dat");


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
		char overdrawn = ' ';

		// Other Vars

		interest = newBalance = mpaLevel = totalInterest = 0.00;


		cardNo = inStoreFile.nextInt();

		System.out.println("Card Name             credit limit     Balance  interest   new bal       MPA EL");
		System.out.println("===============================================================================");

		while(cardNo != SENTINEL)
	   	{
			firstName = inStoreFile.next();
			surname = inStoreFile.next();
			address = inStoreFile.next();
			credLimit = inStoreFile.nextDouble();
			balance = inStoreFile.nextDouble();

			fullName = firstName + " " + surname;

			if(balance > 0){
				interest = 0;
				interest = balance * INTEREST_RATE;
				totalInterest += interest;
				newBalance = balance + interest;
				mpaLevel = newBalance * MPA;
				//


				if(balance > credLimit){
				overdrawn = '*';
				}
				else{
				overdrawn = ' ';
				}
			System.out.printf("%4d %-14s%15.2f%12.2f%10.2f%10.2f%10.2f%3c\n", cardNo, fullName, credLimit, balance, interest, newBalance, mpaLevel, overdrawn);
			}
			outStoreFile.printf("%4d %-14s%15s%12.2f%10.2f%n", cardNo, fullName, address, credLimit, newBalance);

			cardNo = inStoreFile.nextInt();

		} // while

		System.out.println("Total interest: " + totalInterest);

		outStoreFile.printf("%4d %-14s%15.2f%12.2f%10.2f%n", 999, "X", 99.99, 99.99, 99.99);

		inStoreFile.close();
		outStoreFile.close();

	} // main

} // class