// TestShip1 driver class with simple object instances

public class SurnameFirstNameTestShip1
{
    public static void main (String[] args)
    {
		System.out.printf("      %-4s %-12s %9s %-14s %-12s  \n",
						"Ship", "Name of Ship", "Weight", "Insurer", "Value");
		System.out.println("===========================================================================");

		Insurer ins1 = new Insurer();
		System.out.println("ins1: " + ins1.toString());
		ins1.setInsurer("Murphy Ins", 100000.99);
		System.out.println("ins1: " + ins1.toString());
		Insurer ins2 = new Insurer("Agnew Ins", 123456.99);
		System.out.println("ins2:  " + ins2.toString());

		CargoShip shp1 = new CargoShip();
		System.out.println("shp1: " + shp1.toString());
		shp1.setCargoShip(1000, "Red ship 1", 30000.10);
		//System.out.println("shp1: " + shp1.toString());
		Insurer ins3 = new Insurer("Agnew Ins", 12345.55);
		shp1.setInsurer(ins3);
		System.out.println("shp1: " + shp1.toString());

		CargoShip shp2 = new CargoShip(2000, "Green ship 2", 9999.99, "Murphy Ins", 9789.20);
		System.out.println("shp2: " + shp2.toString());


		CargoShip shp3 = new CargoShip();
		shp3.setCargoShip(2500, "Navy ship 3", 7777.99);
		System.out.println("shp3: " + shp3.toString());
		Insurer ins4 = new Insurer();
		ins4.setInsurer("Wally Ins", 22222.20);
		shp3.setInsurer(ins4);
		System.out.println("shp3: " + shp3.toString());

		Container shp4 = new Container();
		System.out.println("con1: " + shp4.toString());
		shp4.setContainer (3000, "Blue con 1", 9999.99);
		Insurer ins5 = new Insurer("Ins 34", 3434.34);
		shp4.setInsurer(ins5);
		System.out.println("con1: " + shp4.toString());


		Container shp5 = new Container(4000, "Yellow con 2", 997899.99, "Agnew Ins", 12345.88);
		System.out.println("con2: " + shp5.toString());

		RoRo shp6 = new RoRo();
		System.out.println("ror1: " + shp6.toString());
		shp6.setCargoShip (5000, "Grey ror 1", 1239.99);
		shp6.setRoRo (345, 678);
		Insurer ins6 = new Insurer("Reilly Ins", 3434.34);
		shp6.setInsurer(ins6);
		System.out.println("ror1: " + shp6.toString());

		RoRo shp7 = new RoRo(6000, "White ror 2", 997899.99, "Agnew Ins", 12345.88, 11, 22);
		System.out.println("ror2: " + shp7.toString());

		Tanker shp8 = new Tanker();
		System.out.println("tnk1: " + shp8.toString());
		shp8.setCargoShip(7000, "Purple tnk 1", 12939.99);
		shp8.setTanker(99999);
		Insurer ins8 = new Insurer("Ins 34", 3434.34);
		shp8.setInsurer(ins8);
		System.out.println("tnk1: " + shp8.toString());

		Tanker shp9 = new Tanker(8000, "Black tnk 2", 997899.99, "Agnew Ins", 12345.88, 4567);
		System.out.println("tnk1: " + shp9.toString());


    }// main

} // TestShip1