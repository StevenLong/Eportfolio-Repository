// LabEx4Test2 driver class using array of objects
// Steven Long

public class LongStevenLabEx4Test2
{
    public static void main (String[] args)
    {
		final int HELICOPTERS = 9;

		Helicopter helicopters[]= new Helicopter[HELICOPTERS];

		System.out.println("Class    Heli  Id  Make/Model All W     Range   Id Pilot ");
		System.out.println("==============================================================================");

		helicopters[0] = new Helicopter();
		//System.out.println("h1: " + h1.toString());
		helicopters[0].setHelicopter(1111, "Red Heli", true, 10000);
		helicopters[0].setPilot(152, "P Murphy");
		//System.out.println("h1: " + helicopters[0].toString());
		//System.out.println();

		helicopters[1] = new Helicopter(2222, "Green Heli", false, 20000, 153, "P Reilly");
		//System.out.println("h2: " + h2.toString());
		//System.out.println();

		helicopters[2] = new Helicopter(3333, "Blue Heli", true, 17000);
		//System.out.println("h3: " + h3.toString());
		helicopters[2].setPilot(154, "P Wally");
		//System.out.println("h3: " + h3.toString());
		//System.out.println();

		helicopters[3] = new AirAmbulance();
		//System.out.println("a1: " + a1.toString());
		helicopters[3].setHelicopter(4444, "Orange Heli", true, 18000);
		helicopters[3].setPilot(155, "P Smith");
		//System.out.println("a1: " + a1.toString());
		//System.out.println();

		helicopters[4] = new AirAmbulance(5555, "Brown Heli", false, 16500, 156, "P Bart");
		//System.out.println("a2: " + a2.toString());
		//System.out.println();

		helicopters[5] = new AirTaxi();
		//System.out.println("t1: " + t1.toString());
		helicopters[5].setHelicopter(6666, "Grey Heli", true, 13000);
		AirTaxi airTaxi = (AirTaxi) helicopters[5];
		airTaxi.setMaxPassangers(7);
		helicopters[5].setPilot(157, "P Homer");
		//System.out.println("t1: " + t1.toString());
		//System.out.println();

		helicopters[6] = new AirTaxi(7777, "White Heli", true, 19000, 158, "P Marge", 8);
		//System.out.println("t2: " + t2.toString());
		//System.out.println();

		helicopters[7] = new AirCargo();
		//System.out.println("c1: " + c1.toString());
		helicopters[7].setHelicopter(8888, "Purple Heli", false, 17777.99);
		AirCargo airCargo = (AirCargo) helicopters[7];
		airCargo.setAirCargo(50, 789);
		helicopters[7].setPilot(159, "P Lisa");
		//System.out.println("c1: " + c1.toString());
		//System.out.println();

		helicopters[8] = new AirCargo(9999, "Black Heli", true, 15700, 160, "P Maggie", 34, 340);
		//System.out.println("c2: " + c2.toString());

		for(int i = 0; i < HELICOPTERS; ++i)
		{
			System.out.printf("%-9s", helicopters[i].getClass().getName());

			System.out.println(helicopters[i].toString());
		}

    }

} // LongStevenNameLabEx4Test2