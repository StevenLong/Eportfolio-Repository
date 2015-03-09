// CargoShip super class

public class CargoShip
{
	private int	shipNumber;
	private String shipName;
	private double deadWeightTonnage;
	private Insurer insurer;

	//======================================================================//

	public CargoShip()
	{
		setCargoShip(0, "None", 0.00);
		insurer = new Insurer();
	}

	public CargoShip(int sNumber, String sName, double dwt)
	{
		setCargoShip(sNumber, sName, dwt);
		insurer = new Insurer();
	}

	public CargoShip(int sNumber, String sName, double dwt, String iName, double sValue)
	{
		setCargoShip(sNumber, sName, dwt, iName, sValue);
		insurer = new Insurer();
	}

	//========================================================================//

	public void setCargoShip(int sNumber, String sName, double dwt)
	{
		setShipNumber(sNumber);
		setShipName(sName);
		setDeadWeightTonnage(dwt);
	}

	public void setShipNumber(int sNumber)
	{
		shipNumber = sNumber;
	}

	public int getShipNumber()
	{
		return shipNumber;
	}

	public void setShipName(String sName)
	{
		shipName = sName;
	}

	public String getShipName()
	{
		return shipName;
	}

	public void setDeadWeightTonnage(double dwt)
	{
		deadWeightTonnage = dwt;
	}

	public void setDeadWeightTonnage(int dwt)
	{
		deadWeightTonnage *= ((dwt / 100) + 1);
	}

	public double getDeadWeightTonnage()
	{
		return deadWeightTonnage;
	}

	public setInsurer()

} // CargoShip