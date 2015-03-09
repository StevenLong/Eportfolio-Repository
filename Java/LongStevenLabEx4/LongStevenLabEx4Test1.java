// LabEx4Test1 simple object instances
// Steven Long

public class LongStevenLabEx4Test1
{
    public static void main (String[] args)
    {
		System.out.println("Heli  Id  Make/Model All W     Range   Id Pilot ");
		System.out.println("==========================================================================");

		Pilot p1 = new Pilot();
		System.out.println("p1:    		     		" + p1.toString());
		p1.setPilot(150, "Top Gun");
		System.out.println("p1: 	  		     	" + p1.toString());

		Pilot p2 = new Pilot(151, "P Agnew");
		System.out.println("p2: 				" + p2.toString());
		System.out.println();

		Helicopter h1 = new Helicopter();
		System.out.println("h1: " + h1.toString());
		h1.setHelicopter(1111, "Red Heli", true, 10000);
		h1.setPilot(152, "P Murphy");
		System.out.println("h1: " + h1.toString());
		System.out.println();

		Helicopter h2 = new Helicopter(2222, "Green Heli", false, 20000, 153, "P Reilly");
		System.out.println("h2: " + h2.toString());
		System.out.println();

		Helicopter h3 = new Helicopter(3333, "Blue Heli", true, 17000);
		System.out.println("h3: " + h3.toString());
		h3.setPilot(154, "P Wally");
		System.out.println("h3: " + h3.toString());
		System.out.println();

		AirAmbulance a1 = new AirAmbulance();
		System.out.println("a1: " + a1.toString());
		a1.setHelicopter(4444, "Orange Heli", true, 18000);
		a1.setPilot(155, "P Smith");
		System.out.println("a1: " + a1.toString());
		System.out.println();

		AirAmbulance a2 = new AirAmbulance(5555, "Brown Heli", false, 16500, 156, "P Bart");
		System.out.println("a2: " + a2.toString());
		System.out.println();

		AirTaxi t1 = new AirTaxi();
		System.out.println("t1: " + t1.toString());
		t1.setHelicopter(6666, "Grey Heli", true, 13000);
		t1.setMaxPassangers(7);
		t1.setPilot(157, "P Homer");
		System.out.println("t1: " + t1.toString());
		System.out.println();

		AirTaxi t2 = new AirTaxi(7777, "White Heli", true, 19000, 158, "P Marge", 8);
		System.out.println("t2: " + t2.toString());
		System.out.println();

		AirCargo c1 = new AirCargo();
		System.out.println("c1: " + c1.toString());
		c1.setHelicopter(8888, "Purple Heli", false, 17777.99);
		c1.setAirCargo(50, 789);
		c1.setPilot(159, "P Lisa");
		System.out.println("c1: " + c1.toString());
		System.out.println();

		AirCargo c2 = new AirCargo(9999, "Black Heli", true, 15700, 160, "P Maggie", 34, 340);
		System.out.println("c2: " + c2.toString());

    }// main

} // SurnameFirstNameLabEx4Test1