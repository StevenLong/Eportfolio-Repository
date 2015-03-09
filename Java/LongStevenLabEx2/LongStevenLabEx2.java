// LongStevenLabEx2 - Your Name here
// Lab Exam 2 description

import java.util.*;
import java.io.*;

public class LongStevenLabEx2
{
    public static void main(String[] args)throws FileNotFoundException
    {

		Scanner inGymCompeteFile = new Scanner(new FileReader("GymCompete.dat"));

		final int EOF = 9999;

		int compID, marks, m1, m2, m3, m4, m5, runningMarks, markLow, markHigh, compCount, nonCompCount, i;
		double compAvg, markAvg, markToAvg;
		String firstName, lastName, countyName, fullName;
		char county;
		// Constants - File objects - Record Layout - Other Variables

		compID = runningMarks =  compCount = nonCompCount = m1 = m2 = m3 = m4 = m5 = 0;
		markAvg = 0.00;
		markLow = 11;
		markHigh = 0;
		fullName = countyName = "";
		// Initialise variables

		System.out.println("Lab Ex 2 - Steven Long");
		System.out.println();
		System.out.println("Id   Name               Average County   M1 M2 M3 M4 M5   Avg");
		System.out.println("=============================================================");
		// Screen / Report Headers

		compID = inGymCompeteFile.nextInt();

		while(compID != EOF)
		{

			firstName = inGymCompeteFile.next();
			lastName = inGymCompeteFile.next();

			fullName = lastName + " " + firstName;

			county = inGymCompeteFile.next().charAt(0);

			compAvg = inGymCompeteFile.nextDouble();

			for(i = 1; i <= 5; i++){
				marks = inGymCompeteFile.nextInt();

				if(i == 1){
				m1 = marks;}

				if(i == 2){
				m2 = marks;}

				if(i == 3){
				m3 = marks;}

				if(i == 4){
				m4 = marks;}

				if(i == 5){
				m5 = marks;}

				if(marks > markHigh){
					markHigh = marks;
				}

				if(marks < markLow){
					markLow = marks;
				}

				/*if(markHigh > marks){

					if(markLow < marks){

					}//inner
					else{
						markLow = marks;
					}
				}//outer
				else{
					markHigh = marks;
				}*/

				runningMarks += marks;
				markToAvg = runningMarks - (markHigh + markLow);
				markAvg = markToAvg / 3;
			}//for

			switch(county){
				case 'g':
				case 'G':
				countyName = "Galway";
				break;

				case 's':
				case 'S':
				countyName = "Sligo";
				break;

				case 'm':
				case 'M':
				countyName = "Mayo";
				break;

				case 'a':
				case 'A':
				countyName = "Other";
				break;

				}//switch

				if(county == 'x'||county == 'X'){
					nonCompCount++;
				}
				else{
				System.out.printf("%-5d%-19s%7.1f %-6s%5d%3d%3d%3d%3d%6.1f\n", compID, fullName, compAvg, countyName, m1, m2, m3, m4, m5, markAvg);
				compCount++;
				}

			inGymCompeteFile.nextLine();
			runningMarks = markHigh = markLow = marks = 0;
			markAvg = markToAvg = 0;

			compID = inGymCompeteFile.nextInt();

		}// while file Input until EOF

		System.out.printf("\n%22s%4d\n", "Competitor count:", compCount);
		System.out.printf("%22s%4d\n", "Non Competitor count", nonCompCount);

			// Line Output

		// Output Screen / Report Footers

		// Close Files

    }  // main

} // LastNameFirstNameLabEx2