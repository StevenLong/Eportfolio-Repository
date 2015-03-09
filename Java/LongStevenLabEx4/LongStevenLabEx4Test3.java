// LabEx4Test3 driver using a menu & an array of objects
// Steven Long

import java.util.Scanner;

public class LongStevenLabEx4Test3
{
	public static Scanner console = new Scanner(System.in);

    public static void main(String[] args)
    {
		final int HELICOPTERS = 9;
		int i, choice, cnt, findHeliId;
		boolean found;
		Helicopter helicopters[] = new Helicopter[HELICOPTERS];

		helicopters[0] = new Helicopter();
		helicopters[0].setHelicopter(1111, "Red Heli", true, 10000);
		helicopters[0].setPilot(152, "P Murphy");

		helicopters[1] = new Helicopter(2222, "Green Heli", false, 20000, 153, "P Reilly");

		helicopters[2] = new Helicopter(3333, "Blue Heli", true, 17000);
		helicopters[2].setPilot(154, "P Wally");

		helicopters[3] = new AirAmbulance();
		helicopters[3].setHelicopter(4444, "Orange Heli", true, 18000);
		helicopters[3].setPilot(155, "P Smith");

		helicopters[4] = new AirAmbulance(5555, "Brown Heli", false, 16500, 156, "P Bart");

		helicopters[5] = new AirTaxi();
		helicopters[5].setHelicopter(6666, "Grey Heli", true, 13000);
		AirTaxi airTaxi = (AirTaxi) helicopters[5];
		airTaxi.setMaxPassangers(7);
		helicopters[5].setPilot(157, "P Homer");

		helicopters[6] = new AirTaxi(7777, "White Heli", true, 19000, 158, "P Marge", 8);

		helicopters[7] = new AirCargo();

		helicopters[7].setHelicopter(8888, "Purple Heli", false, 17777.99);
		AirCargo airCargo = (AirCargo) helicopters[7];
		airCargo.setAirCargo(50, 789);
		helicopters[7].setPilot(159, "P Lisa");

		helicopters[8] = new AirCargo(9999, "Black Heli", true, 15700, 160, "P Maggie", 34, 340);



		choice = showMenu(); // Initial read

		while (choice != 0) // Continue until 0/Exit sentinel encountered
		{
			switch (choice)
			{
				case 1: // All Helicopters
					outputHeader();
					for(i = 0; i < HELICOPTERS; ++i)
					{
						System.out.printf("%-9s", helicopters[i].getClass().getName());

						System.out.println(helicopters[i].toString());
					}

					break;

				case 2:
					outputHeader();
					for(i = 0; i < HELICOPTERS; ++i)
					{
						if(helicopters[i] instanceof AirAmbulance){
						System.out.printf("%-9s", helicopters[i].getClass().getName());
						System.out.println(helicopters[i].toString());
						}
					}

					break;
				case 3:
					outputHeader();
					for(i = 0; i < HELICOPTERS; ++i)
					{
						if(helicopters[i] instanceof AirTaxi){
						System.out.printf("%-9s", helicopters[i].getClass().getName());
						System.out.println(helicopters[i].toString());
						}
					}
					break;
				case 4:
					outputHeader();
					for(i = 0; i < HELICOPTERS; ++i)
					{
						if(helicopters[i] instanceof AirCargo){
						System.out.printf("%-9s", helicopters[i].getClass().getName());
						System.out.println(helicopters[i].toString());
						}
					}
					break;
				case 5:
					for(i = 0; i < HELICOPTERS; ++i)
					{
						if(!(helicopters[i].getClass().getName() == "Helicopter")) /*&& helicopters[i].getHeliAllWeather() == false*/{
							if(helicopters[i].getHeliAllWeather() == true){
								System.out.printf("%-9s", helicopters[i].getClass().getName());
								System.out.println(helicopters[i].toString());
							}
						}
					}
					break;
				case 6:
					for(i = 0; i < HELICOPTERS; ++i)
					{
						if(helicopters[i] instanceof AirCargo){
							AirCargo airCargo2 = (AirCargo)helicopters[i];
							System.out.printf("%-9s", helicopters[i].getClass().getName());
							System.out.println(helicopters[i].toString());
							airCargo2.setMaxCapasity((int)(airCargo2.getMaxCapasity() *1.5)) ;
							System.out.printf("%-9s", helicopters[i].getClass().getName());
							System.out.println(helicopters[i].toString());
						}
					}
					break;
				case 7:
					break;
				case 8:


				default:
					System.out.println("Invalid choice (must be 1..8 or 0/End)\n" );
			} // switch

			System.out.println();
			choice = showMenu(); // subsequent read

		} // while

    }// main

 	public static int showMenu()
    {
		int choice;
		System.out.println();
        System.out.println("          Corrib Helicopter Menu Options - 0/Quit");
        System.out.println("===========================================================");
        System.out.println("1: List Helicopters      2: List Air Ambulances");
        System.out.println("3: List Air Taxis        4: List Air Cargo");
        System.out.println("5: Non Heli All Weather  6: Air Cargo Capacity 50% increase");
       	System.out.println("7: Set Helicopter Range  8: Rename Pilot");
        System.out.println();

        System.out.print("Enter option: ");
        choice = console.nextInt();

        return choice;
    }

 	public static void outputHeader()
    {
		System.out.println();
		System.out.println("Class    Heli  Id  Make/Model All W     Range   Id Pilot ");
		System.out.println("==============================================================================");
	}

} // LongStevenLabEx4Test3