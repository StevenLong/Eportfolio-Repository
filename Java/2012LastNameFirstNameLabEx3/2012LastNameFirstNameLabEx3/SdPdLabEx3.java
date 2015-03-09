// Sd/PdLabEx3 - Steven Long
// Maintain account data

import java.util.Scanner;
import java.io.*;

public class SdPdLabEx3
{
    public static void main(String[] args) throws FileNotFoundException
    {
		// Constants
		final int EOF = 9999;
		final int MAX_RECORDS = 50;
		final String STOP = "STOP";


		// File objects
		Scanner inBankTxFile = new Scanner(new FileReader("BankTx.dat"));
		Scanner inBankAccountFile = new Scanner(new FileReader("BankAccount.dat"));
		PrintWriter outRejectedTxFile = new PrintWriter("RejectedTx.dat");
		PrintWriter outNewBankAccountFile = new PrintWriter("NewBankAccout.dat");

		// File Variables
		int txNo;
		double txAmount;
		char txType;
		String firstName, lastName, accName;

		// Arrays
		int accNoArray[] = new int[MAX_RECORDS];
		double accOverdrawnArray[] = new double[MAX_RECORDS];
		double accBalanceArray[] = new double[MAX_RECORDS];
		char accTypeArray[] = new char[MAX_RECORDS];
		String accNameArray[] = new String[MAX_RECORDS];

		int txNoArray[] = new int[MAX_RECORDS];
		double txAmountArray[] = new double[MAX_RECORDS];
		char txTypeArray[] = new char[MAX_RECORDS];

		// Other Variables
		String searchName, searchFirst, searchLast;
		boolean foundName;
		int arrayCNT, searchCNT, numRecords, currentCNT;
		char accCommand;

		// Initialise
		foundName = false;
		arrayCNT = 0;

		// Headers
		System.out.println("Steven Long - Bank Account & Tx Processing\n");
		System.out.println("Acc No    Limit  Balance Type Account Name  ");
		System.out.println("============================================");

		// File Input
		//accNo = inBankAccountFile.nextInt();
		accNoArray[arrayCNT] = inBankAccountFile.nextInt();

		while(accNoArray[arrayCNT] != EOF)
		{

			accOverdrawnArray[arrayCNT] =  inBankAccountFile.nextDouble();
			accBalanceArray[arrayCNT] = inBankAccountFile.nextDouble();
			accTypeArray[arrayCNT] = inBankAccountFile.next().charAt(0);
			firstName = inBankAccountFile.next();
			lastName = inBankAccountFile.next();
			accName = firstName + " " + lastName;
			accNameArray[arrayCNT] = accName;
			System.out.printf("%6d%9.2f%9.2f%5c %-14s\n", accNoArray[arrayCNT], accOverdrawnArray[arrayCNT], accBalanceArray[arrayCNT], accTypeArray[arrayCNT], accNameArray[arrayCNT]);
			++arrayCNT;
			accNoArray[arrayCNT] = inBankAccountFile.nextInt();
		}

		inBankAccountFile.close();

		numRecords = arrayCNT;
		arrayCNT = currentCNT = 0;

		System.out.println("\nTx Num   Amount Type Account Name    After Bal");
		System.out.println("==============================================");
		outRejectedTxFile.println("Mismatched Rejected Tx Report");
		outRejectedTxFile.println("=============================");
		outRejectedTxFile.println("Tx Num   Amount Type");
		outRejectedTxFile.println("====================");

		txNoArray[arrayCNT] = inBankTxFile.nextInt();

		while(txNoArray[arrayCNT] != EOF)
		{
			txAmountArray[arrayCNT] = inBankTxFile.nextDouble();
			txTypeArray[arrayCNT] = inBankTxFile.next().charAt(0);

			for(searchCNT = 0; searchCNT <= numRecords; ++searchCNT)
			{
				if(txNoArray[arrayCNT] == accNoArray[searchCNT])
				{

					foundName = true;
					currentCNT = searchCNT;

					switch (txTypeArray[arrayCNT])
					{
						case 'l':
						case 'L':
								accBalanceArray[currentCNT] += txAmountArray[arrayCNT];
						break;

						case 'w':
						case 'W':
								accBalanceArray[currentCNT] -= txAmountArray[arrayCNT];
						break;
					}

					System.out.printf("%6d%9.2f%5c %-12s%13.2f\n", txNoArray[arrayCNT], txAmountArray[arrayCNT], txTypeArray[arrayCNT], accNameArray[currentCNT], accBalanceArray[currentCNT]);

				}


			}

			if(foundName == false)
			{
				outRejectedTxFile.printf("%6d%9.2f%5c\n", txNoArray[arrayCNT], txAmountArray[arrayCNT], txTypeArray[arrayCNT]);
			}

			++arrayCNT;
			foundName = false;
			txNoArray[arrayCNT] = inBankTxFile.nextInt();
		}

		Scanner console = new Scanner(System.in);
		System.out.print("Enter account Name (Stop to end): ");
		searchFirst = console.next();
		searchLast = console.next();
		searchName = searchFirst + " " + searchLast;

		while(searchName.equalsIgnoreCase(STOP) == false)
		{
			for(searchCNT = 0; searchCNT <= numRecords; searchCNT++)
			{
				if(searchName.equalsIgnoreCase(accNameArray[searchCNT]))
				{
					System.out.print("N/ame, L/odge, W/ithdraw, A/ll Acc, O/verdrawn, I/gnore: ");
					accCommand = console.next().charAt(0);

					switch(accCommand)
					{
						case 'N':
						case 'n':

						break;

						case 'L':
						case 'l':

						break;

						case 'W':
						case 'w':

						break;
						case 'A':
						case 'a':

						break;

						case 'O':
						case 'o':

						break;

						case 'I':
						case 'i':

						break;

						default:
								System.out.println("Invalid entry");


					}
				}
				else
				{
					System.out.println("Sorry Account not found, Try Again.");
					System.out.print("Enter account Name (Stop to end): ");
					searchFirst = console.next();
					searchLast = console.next();
					searchName = searchFirst + " " + searchLast;
				}
			}
		}

		// File Output

		// Close Files
		inBankTxFile.close();
		outRejectedTxFile.close();
		outNewBankAccountFile.close();

    }  // main

} // LastNameFirstNameLabEx3

