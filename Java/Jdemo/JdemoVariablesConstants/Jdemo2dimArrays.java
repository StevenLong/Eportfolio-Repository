// Jdemo2dimArrays - Gerry Agnew
// Demo Java 2 dimensional Arrays

import java.util.Scanner;

public class Jdemo2dimArrays
{
	public static void main( String[] args )
	{
		// Constants and Variables
		final int ROWS = 8, COLUMNS = 7;
		Scanner console = new Scanner(System.in);
		int row, col;

		// Declare/Instantiate 2-Dimensional Array (Reference type)

		int [][] multiply = new int[ROWS][COLUMNS]; // multiplication table

		// Alternative Declare/Instantiate/Initialise 2 dim array
		double [][] multiply2 = {
									{10.10, 10.20, 10.30, 10.40},
									{20.10, 20.20, 20.30, 20.40},
									{30.10, 30.20, 30.30, 30.40},
									{40.10, 40.20, 40.30, 40.40},
									{50.10, 50.20, 50.30, 50.40},
						  		}; // no New


		// Access/Initialise/Assign Array (0 based)
		multiply2 [1][1] = 123.45;

		// Array size/length
		System.out.println("There are " + multiply.length + " rows.");
		System.out.println("There are " + multiply[0].length + " columns in row 0.");

		// Iterating/Processing/Printing Arrays (0 based)
		for (row = 0; row < multiply.length; ++row)
		{
			for (col = 0; col < multiply[0].length; ++col)
			{
				multiply[row][col] = (row + 1) * (col + 1);
			}
		}
		// Column Header
		System.out.print("\n    ");
		for (col = 1; col < multiply[0].length +1; ++col)
		{
			System.out.printf("%4d", col);
		}
		System.out.println("\n================================");

		// Output Rows
		for (row = 0; row < multiply.length; ++row)
		{
			System.out.printf("%2d |", row+1);
			for (col = 0; col < multiply[0].length; ++col)
			{
				System.out.printf("%4d", multiply[row][col]);
			}
			System.out.println();
		}

	}  // main

} // Jdemo2dimArrays