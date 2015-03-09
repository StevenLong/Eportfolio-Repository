// PracticeJ58Theatre - Steven Long
// Theatre Bookings and Cancellations
// Using seq text file storage and 2 dim char array processing

// Find (F5) 5 occurences of "fix" and correct accordingly

import java.util.Scanner;
import java.io.*;

public class PracticeJ58Theatre
{
	public static void main(String[] args)throws FileNotFoundException
	{
		// Constants
		final int ROWS = 15, SEATS = 12;
		final double SEAT_COST = 25.00;

		// Input file
		Scanner inTheatreFile = new Scanner(new FileReader("TheatreIn.dat"));


		// Output file with updated data
		//PrintWriter outTheatreFile = new PrintWriter("");

		// Declarations - Variables & Arrays

		char seatPlan[][] = new char[ROWS][SEATS];

		// Other Variables
		Scanner console = new Scanner (System.in);
		int row, seat, rowNo, seatNo, bookingTot, cancelTot, i, j;
		char option;

		//Initialise Totals

		// Populate theatre 2 dim array from text file
		System.out.println("       1  2  3  4  5  6  7  8  9 10 11 12");
		System.out.println("=========================================");

		for(i=0; i <= ROWS-1; i++)
		{
			System.out.printf("%3d |", 1+i);

			for(j=0; j <= SEATS-1; j++)
			{
				seatPlan[i][j] = inTheatreFile.next().charAt(0);
				if(seatPlan[i][j] == 'X')
				{
					System.out.printf("%3c", seatPlan[i][j]);
				}
				else
				{
					System.out.print("   ");
				}
			}
			System.out.println();
		}

		// Initial read
		System.out.print("\nEnter B(ooking), C(ancel) or eXit: ");

		// Make/Cancel Booking loop until x/X encountered

		// Main while
		//
		// switch (option)
		//	b/B Booking - get rowNo and seatNo
		// 		Make booking Or Already booked

		// 	same c/C Cancel booking or Not booked

		// 	x/X eXit

		// 	default - Invalid option

		// Subsequent read
		// System.out.print("\nEnter B(ooking), C(ancel) or eXit: ");

		// Output Theatre Seat Plan

		// Output Theatre Seat Plan to text file
		// fors nested seat and seat

		// Close files

	}// main

}// class