// TestShip2 driver class using array of Cargo Ship objects

public class SurnameFirstNameTestShip2
{
    public static void main (String[] args)
    {
		final int MAX_SHIPS = 9;

		CargoShip ships[] = new CargoShip[MAX_SHIPS];

		System.out.printf("      %8s %-12s %9s %-14s %-12s  \n",
						"Ship", "Name of Ship", "Weight", "Insurer", "Value");
		System.out.println("===========================================================================");

		ships[0] = new CargoShip();
		ships[0].setCargoShip(1000, "Red ship 1", 30000.10);
		ships[0].setInsurer("Agnew Ins", 12345.55);

		ships[1] = new CargoShip(2000, "Green ship 2", 9999.99, "Murphy Ins", 9789.20);


		ships[2] = new CargoShip(2500, "Navy ship 3", 7777.99);
		ships[2].setInsurer("Wally Ins", 22222.20);

		ships[3] = new Container();
		ships[3].setCargoShip(3000, "Blue con 1", 9999.99);
		ships[3].setInsurer("Ins 34", 3434.34);

		ships[4] = new Container(4000, "Yellow con 2", 997899.99, "Agnew Ins", 12345.88);

		ships[5] = new RoRo();
		ships[5].setCargoShip (5000, "Grey ror 1", 1239.99);
		RoRo roro = (RoRo) ships[5];
		roro.setRoRo(345, 678);
		ships[5].setInsurer ("Reilly Ins", 3434.34);

		ships[6] = new RoRo(6000, "White ror 2", 997899.99, "Agnew Ins", 12345.88, 11, 22);

		ships[7] = new Tanker();
		ships[7].setCargoShip(7000, "Purple tnk 1", 12939.99);
		Tanker tanker = (Tanker) ships[7];
		tanker.setTanker(99999);
		ships[7].setInsurer("Ins 34", 3434.34);

		ships[8] = new Tanker(8000, "Black tnk 2", 997899.99, "Agnew Ins", 12345.88, 4567);

		for(int i = 0; i < MAX_SHIPS; ++i)
		{
			System.out.printf("%-10s", ships[i].getClass().getName());

			System.out.println(ships[i].toString());
		}
		System.out.println();
    }

} // TestShip2