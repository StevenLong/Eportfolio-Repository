// CargoShip super class

public class CargoShip
{

	private int shipNumber;

	private String shipName;

	private double deadWeightTonnage;

	private Insurer insurer;

	//===Member methods===//

	public CargoShip()
	{
		setCargoShip(0, "No name", 0.00);
		insurer = new Insurer();
	}

	public CargoShip(int number, String name, double tonnage)
	{
		setCargoShip(number, name, tonnage);
		//insurer = new Insurer();
	}

	public CargoShip(int number, String name, double tonnage, String iName, double sValue)
	{
		setCargoShip(number, name, tonnage);
		insurer = new Insurer(iName, sValue);
	}

	//---Stuff---//

	public void setCargoShip(int number, String name, double tonnage)
	{
		setShipNumber(number);
		setShipName(name);
		setDeadWeightTonnage(tonnage);
	}

	public void setShipNumber(int number)
	{
		shipNumber = number;
	}

	public int getShipNumber()
	{
		return shipNumber;
	}

	public void setShipName(String name)
	{
		shipName = name;
	}

	public String getShipName()
	{
		return shipName;
	}

	public void setDeadWeightTonnage(double tonnage)
	{
		deadWeightTonnage  = tonnage;
	}

	public double getDeadWeightTonnage()
	{
		return deadWeightTonnage;
	}

	public void setInsurer(String iName, double sValue)
	{
		insurer.setInsurer(iName, sValue);
	}

	//---more stuff---//

	public String toString()
	{
		return ("Ship" + shipNumber + "Name of Ship" + shipName + "");
	}

} // CargoShip