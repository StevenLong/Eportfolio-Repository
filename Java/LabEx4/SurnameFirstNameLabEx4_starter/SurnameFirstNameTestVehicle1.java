// Gerry Agnew

import java.util.Scanner;

public class SurnameFirstNameTestVehicle1
{
	public static Scanner console = new Scanner(System.in);

    public static void main(String[] args)
    {

		// MotorByke("01mo111", "Byke 1", 99.99, 111, "A Aaaa");
		// Van("02so222", "Van 1", 99.99, 222, "B Bbbb", 5, 5);
		// Lorry("03g-333", "Lorry 1", 99.99, 333, "C Cccc", 10.5);
		//Vehicle veh2 = new Vehicle("04d-444", "Vehicle 2", 99.99, 444, "D Dddd");
		// MotorByke("05mo555", "Byke 2", 99.99, 555, "E Eeee");
		// Van("06so666", "Van 2", 99.99, 666, "F Ffff", 3, 1);
		// Lorry("07g-777", "Lorry 2", 99.99, 777, "G Gggg", 10.5);
		// Vehicle("08d-888", "Vehicle 3", 99.99, 888, "H Hhhh");

		System.out.printf("%-8s %-11s %5s %-15s %-12s  \n",
						"Reg", "Make Model", "Tax", "Driver", "We-Pa-Do");
		System.out.println("===================================================");

		Driver drv1 = new Driver();
		System.out.println("Drv1: " + drv1.toString());
		drv1.setDriver(345, "Mary Murphy");
		System.out.println("Drv1: " + drv1.toString());
		Driver drv2 = new Driver(123, "Gerry Agnew");
		System.out.println("Drv2: " + drv2.toString());
		System.out.println();

		Vehicle veh1 = new Vehicle();
		System.out.println("Veh1: 			" + veh1.toString());
		veh1.setVehicle("12g-123", "Vehicle 1", 99.99);
		veh1.setDriver(101, "Gerry Agnew");
		System.out.println("Veh1: " + veh1.toString());
		Vehicle veh2 = new Vehicle("04d-444", "Vehicle 2", 99.99, 444, "D Dddd");

		MotorByke byk1 = new MotorByke("01mo111", "Byke 1", 99.99, 111, "A Aaaa");



    } // main

} // TestVehicle1