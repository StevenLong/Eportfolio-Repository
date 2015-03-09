// TestShip3_Menu driver using a menu & an array of Cargo Ship objects

import java.util.Scanner;

public class SurnameFirstNameTestShip3
{
	public static Scanner console = new Scanner(System.in);

    public static void main(String[] args)
    {
		final int MAX_SHIPS = 9;

		int i, choice, cnt, shipNo;
		boolean found;

		choice = showMenu(); // Initial read

		while (choice != 0) // Continue until 0/Exit sentinel encountered
		{
			switch (choice)
			{
				case 1: // All Ships
					System.out.printf("%4s %-12s %9s %-14s %-12s  \n",
									"Ship", "Name of Ship", "Weight", "Insurer", "Value");
					System.out.println("===========================================================================");



					break;

				default:
					System.out.println("Invalid choice (must be 1..9 or 0/End)\n" );
			} // switch

			System.out.println();

			choice = showMenu(); // subsequent read

		} // while

    }// main

 	public static int showMenu()
    {
		int choice;
		System.out.println();
        System.out.println("            Cargo Ship Menu Options - 0/Quit");
        System.out.println("==================================================");
        System.out.println("1: List Cargo Ships    2: List Container Ships");
        System.out.println("3: List RoRo Ships     4: List Tanker Ships");
        System.out.println("5: Reset non CS DWT=0  6: RoRo Passengers doubled");
       	System.out.println("7: Rename Ship         8: Rename Tanker Insurer");
        System.out.println();

        System.out.print("Enter option: ");
        choice = console.nextInt();

        return choice;
    }

} // TestShip3_Menu