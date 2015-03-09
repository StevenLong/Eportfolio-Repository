// Gerry Agnew

import java.util.Scanner;

public class TestVehicle3
{
	public static Scanner console = new Scanner(System.in);

    public static void main(String[] args)
    {
		final int MAX_VEHICLES = 9;
		int i, choice;

		// Create array of Vehicle objects

		// Vehicle("12g-123", "Vehicle 1", 99.99, 101, "Gerry Agnew");
		// MotorByke("01mo111", "Byke 1", 99.99, 111, "A Aaaa");
		// Van("02so222", "Van 1", 99.99, 222, "B Bbbb", 5, 5);
		// Lorry("03g-333", "Lorry 1", 99.99, 333, "C Cccc", 10.5);
		// Vehicle("04d-444", "Vehicle 2", 99.99, 444, "D Dddd");
		// MotorByke("05mo555", "Byke 2", 99.99, 555, "E Eeee");
		// Van("06so666", "Van 2", 99.99, 666, "F Ffff", 3, 1);
		// Lorry("07g-777", "Lorry 2", 99.99, 777, "G Gggg", 10.5);
		// Vehicle("08d-888", "Vehicle 3", 99.99, 888, "H Hhhh");

		// Initial read
		choice = showMenu();

		// Continue until 0/Quit encountered

		while (choice != 0)
		{
			switch (choice)
			{
				case 1: // All Vehicles
					System.out.printf("%-8s %-11s %5s %-15s %-12s  \n",
									"Reg", "Make Model", "Tax", "Driver", "We-Pa-Do");
					System.out.println("===================================================");

					break;

				default:
					System.out.println("Invalid choice (1..7 or 0 ONLY)\n" );
			} // switch

			choice = showMenu();

		} // while

    }// main

 	public static int showMenu()
    {
		int choice;
		System.out.println();
        System.out.println("                 Vehicle Menu Options");
        System.out.println("==================================================");
        System.out.println("1: List Vehicles     2: List MotorBykes");
        System.out.println("3: List Vans         4: List Lorrys    ");
        System.out.println("5: Inc Van Tax: 10%  6: Reset Lorry Weight=22");
       	System.out.println("7: Van doors for Reg 0: Quit");
        System.out.println();
        System.out.print("Enter option: ");

        choice = console.nextInt();

        return choice;
    }

} // TestVehicle3