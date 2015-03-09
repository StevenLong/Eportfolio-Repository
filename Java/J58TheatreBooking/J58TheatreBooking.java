// Theatre Bookings and Cancellations
// Using seq text file storage and 2 dim char array processing

// Find (F5) 5 occurences of "fix" and correct accordingly

import java.util.Scanner;
import java.io.*;
// J58TheatreBooking - Steven Long

public class J58TheatreBooking
{
	public static void main(String[] args)throws FileNotFoundException
	{
		// Constants
		final int ROWS = 15, SEATS = 12;
		final double SEAT_PRICE = 25.00;

		// Input file
		Scanner TheatreInFile = new Scanner(new FileReader ("TheatreIn.dat"));

		// Output file with updated data
		PrintWriter TheatreOutFile = new PrintWriter("TheatreOut.dat");

		// Declarations - Variables & Arrays



		// char seatPlan[][] = fix
		char [][]seatPlan = new char[ROWS][SEATS];

		// Other Variables
		Scanner console = new Scanner (System.in);
		int row, seat, rowNo, seatNo, bookingTot, cancelTot;
		char option;

		//Initialise Totals
		bookingTot = cancelTot = 0;

		// Populate theatre 2 dim array from text file
		// fors nested row / seat fix
		for(row = 0; row <= ROWS - 1; row++)
		{
			for(seat = 0; seat <= SEATS - 1; seat++)
			{
				seatPlan[row][seat] = TheatreInFile.next().charAt(0);
			}
		}

		System.out.println("        1  2  3  4  5  6  7  8  9 10 11 12");
		System.out.println("============================================");

		for(row = 0; row <= ROWS - 1; row++)
		{
			System.out.printf("  %3d| ", row);
			for(seat = 0; seat <= SEATS - 1; seat++)
			{
				if(seatPlan[row][seat] == 'X')
				System.out.print(" X ");
				else
				System.out.print("   ");
			}
		System.out.println();
		}

		// Initial read
		System.out.print("\nEnter B(ooking), C(ancel) or eXit: ");
		option = console.next().charAt(0);

		// Make/Cancel Booking loop until x/X encountered
		while(option != 'x' && option != 'X')
		{
			switch (option)
			{
				case 'b':
				case 'B':
						System.out.print("\nEnter row(1 - 15):");
						rowNo = console.nextInt();
						System.out.print("\nEnter seat(1 - 12):");
						seatNo = console.nextInt();

						if(seatPlan[rowNo - 1][seatNo - 1] == 'X')
						{
							System.out.println("Sorry, row " + rowNo + " seat " + seatNo + "already booked");
						}
						else
						{
							seatPlan[rowNo - 1][seatNo - 1] = 'X';
							System.out.println("row " + rowNo + " seat " + seatNo + " booked");
						}
				break;
				case 'c':
				case 'C':
						System.out.print("\nEnter row(1 - 15):");
						rowNo = console.nextInt();
						System.out.print("\nEnter seat(1 - 12):");
						seatNo = console.nextInt();
						if(seatPlan[rowNo][seatNo] == 'X')
						{
							seatPlan[rowNo][seatNo] = 'O';
							System.out.println("row " + rowNo + " seat " + seatNo + " cancled");
						}
						else
						{
							System.out.println("Sorry, row " + rowNo + " seat " + seatNo + "not booked");
						}
				break;
				/*case 'x':
				case 'X':
				break;*/
				default :
						System.out.println("Invalid entry - Only B, C or X allowed - Try again");
				break;

			}//switch

		System.out.print("\nEnter B(ooking), C(ancel) or eXit: ");
		option = console.next().charAt(0);
		}//while

		for(row = 0; row <= ROWS - 1; row++)
		{
			for(seat = 0; seat <= SEATS - 1; seat++)
			{
				TheatreOutFile.print(seatPlan[row][seat]);
			}

		TheatreOutFile.println();
		}


		System.out.println("        1  2  3  4  5  6  7  8  9 10 11 12");
		System.out.println("============================================");

		for(row = 0; row <= ROWS - 1; row++)
		{
			System.out.printf("  %3d| ", row);
			for(seat = 0; seat <= SEATS - 1; seat++)
			{
				if(seatPlan[row][seat] == 'X')
				System.out.print(" X ");
				else
				System.out.print("   ");
			}
		System.out.println();
		}

		TheatreInFile.close();
		TheatreOutFile.close();
		// Close files


	}// main

}// class