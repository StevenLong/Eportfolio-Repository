// LongStevenLabEx3 - Steven Long
// Galway Technical University marks processing

import java.util.Scanner;
import java.io.*;

public class LongStevenLabEx3
{
    public static void main(String[] args)throws FileNotFoundException
    {
		// 1) Constants; File objects; File Variables; 1/2 dim Arrays; Other Variables
		final int MAX_RECORDS = 70;
		final int MAX_SUBJECTS = 5;
		final int EOF = 9999;
		final String QUIT = "Quit";

		Scanner inStudentMarksFile = new Scanner(new FileReader("StudentMarks.dat"));
		Scanner inUpdateMarksFile = new Scanner(new FileReader("UpdateMarks.dat"));
		PrintWriter outStudentMarksFile = new PrintWriter("NewStudentMarks.dat");
		PrintWriter outMismatchRep = new PrintWriter("MismatchReport.dat");
		Scanner console = new Scanner(System.in);

		int studentIDMark[][] = new int[MAX_RECORDS][MAX_SUBJECTS + 1];
		char studentStatus[] = new char[MAX_RECORDS];
		String studentName[] = new String[MAX_RECORDS];

		int txStudentID;
		char txType;
		int txSubject, txMark;

		int i, j, arrayCNT, studentID;
		String firstName, lastName, searchName;
		boolean nameFound;
		char command;

		//    Initialised; Output Headers
		i = j = arrayCNT = 0;

		System.out.println("Steven Long - Student Marks Lab Ex 3\n");
		System.out.println("   Id   M1   M2   M3   M4   M5 Status         Name");
		System.out.println("==================================================");

		// 2) while/Master File Input/Populate Arrays/Arrays Output
		studentID = inStudentMarksFile.nextInt();
		//System.out.printf("%5d", studentIDMark[i][j]);

		while(studentID != EOF)
		{
			studentIDMark[i][j] = studentID;
			System.out.printf("%5d", studentIDMark[i][j]);

			for(j = 1; j <= MAX_SUBJECTS; j++)
			{
				studentIDMark[i][j] = inStudentMarksFile.nextInt();
				System.out.printf("%5d", studentIDMark[i][j]);
			}

			studentStatus[i] = inStudentMarksFile.next().charAt(0);
			firstName = inStudentMarksFile.next();
			lastName = inStudentMarksFile.next();
			studentName[i] = firstName + " " + lastName;
			System.out.printf("%4c%16s",studentStatus[i], studentName[i]);

			System.out.println();

			++i;
			arrayCNT++;
			j = 0;
			studentID = inStudentMarksFile.nextInt();
		}

		// 3) while/Tx File Input/no Arrays/Tx File Variables Output
		txStudentID = inUpdateMarksFile.nextInt();

		i = j = 0;

		/*System.out.println("Student Type Module Before Tx  ");
		System.out.println("===============================");

		while(txStudentID != EOF)
		{

			txType = inUpdateMarksFile.next().charAt(0);
			txSubject = inUpdateMarksFile.nextInt();
			txMark = inUpdateMarksFile.nextInt();
			System.out.printf("%5d%6c%6d%6d\n", txStudentID, txType, txSubject, txMark);

			txStudentID = inUpdateMarksFile.nextInt();
		}*/

		// 4) outer while/Tx File Input/Re-processed
		System.out.println("Student Type Module Before Tx  ");
		System.out.println("===============================");

		while(txStudentID != EOF)
		{
			if(txStudentID == studentIDMark[i][j])
			{
				txType = inUpdateMarksFile.next().charAt(0);
				txSubject = inUpdateMarksFile.nextInt();
				txMark = inUpdateMarksFile.nextInt();

				switch(txType)
				{
					case 'O':
							studentIDMark[txSubject][j] = txMark;
						break;

					case 'A':
							studentIDMark[txSubject][j] += txMark;
						break;

					case 'S':
							studentIDMark[txSubject][j] -= txMark;
						break;
				}
				System.out.printf("%5d%6c%6d%6d\n", txStudentID, txType, txSubject, txMark);
			}
			else
			{
				txType = inUpdateMarksFile.next().charAt(0);
				txSubject = inUpdateMarksFile.nextInt();
				txMark = inUpdateMarksFile.nextInt();
				outMismatchRep.printf("%5d%6c%6d%6d%n", txStudentID, txType, txSubject, txMark);
			}

			txStudentID = inUpdateMarksFile.nextInt();

		}
		//    inner while search unsuccessful: Output Mismatched/Rejected Report
		//    otherwise, search successful: update 2 dim Array with Tx values

		// 5) for(s)/Output Arrays to verify updated contents
		for(i = 0; i <= arrayCNT; i++)
		{
			for(j = 0; j <= MAX_SUBJECTS; j++)
			{
				System.out.printf("%5d", studentIDMark[i][j]);
			}
			System.out.printf("%4c%16s\n", studentStatus[i], studentName[i]);
		}

		// 6/ outer while/Enter string/until sentinel encountered
		System.out.print("Enter student Name (Quit to end):");
		firstName = console.next();
		lastName = console.next();
		searchName = firstName + " " + lastName;


		//    inner while search unsuccessful: Not Found Error Message
		//    Otherwise, search successful: prompt/apply changes with do..while validation

		// 7) for(s)/Save Updated Arrays to a new Output file
		//    Remember the sentinel & close files
		inStudentMarksFile.close();
		inUpdateMarksFile.close();
		outStudentMarksFile.close();
		outMismatchRep.close();

    }  // main

} // LastNameFirstNameLabEx3