// LongStevenPracticeLabEx3 - your name here
// your description here

import java.util.Scanner;
import java.io.*;
//import

public class LongStevenPracticeLabEx3
{
    public static void main(String[] args) throws FileNotFoundException
    {
		final int EOF = 9999;
		final int MAX_ARRAY = 50;
		// Constants

		Scanner inBankAccountFile = new Scanner (new FileReader("BankAccount.dat"));// File objects
		Scanner inBankTxFile = new Scanner (new FileReader("BankTx.dat"));// File objects
		PrintWriter outMismatchTxRep = new PrintWriter("MismatchTxRep.dat");
		// File Variables

		int accNoArray[] = new int [50];
		double overdrawnArray[] = new double [50], balanceArray[] = new double [50];
		char accTypeAray[] = new char [50];
		String accNameArray[] = new String [50];
		// Arrays

		int accNo, txNo, arrayCNT = 0;
		double accOverdrawn, accBalance,txAmount;
		char accType, txType;
		String firstName, lastName, accName;
		// Other Variables


		// Initialise

		System.out.println("Steven Long - Bank Account & Tx Processing\n");
		System.out.println("Acc No    Limit  Balance Type Account Name  ");
		System.out.println("============================================");
		// Headers

		accNo = inBankAccountFile.nextInt();
		//accNoArray[] = accNo;

		while(accNo != EOF)
		{

			accNoArray[arrayCNT] = accNo;
			System.out.printf("%6d", accNo);
			accOverdrawn = inBankAccountFile.nextDouble();
			overdrawnArray[arrayCNT] = accOverdrawn;
			accBalance = inBankAccountFile.nextDouble();
			balanceArray[arrayCNT] = accBalance;
			accType = inBankAccountFile.next().charAt(0);
			accTypeAray[arrayCNT] = accType;
			firstName = inBankAccountFile.next();
			lastName = inBankAccountFile.next();
			accName = firstName + " " + lastName;
			accNameArray[arrayCNT] = accName;
			System.out.printf("%9.2f%9.2f%5c %-15s\n",accOverdrawn, accBalance, accType, accName);
			accNo = inBankAccountFile.nextInt();

			arrayCNT++;
		}

		// File Input

		// Search

		// File Output

		inBankTxFile.close();
		inBankAccountFile.close();
		outMismatchTxRep.close();
		// Close Files

    }  // main

} // LastNameFirstNameLabEx3

