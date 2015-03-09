// Tanker sub class

public class Tanker extends CargoShip
{
	private final int DEFAULT_CAPASITY = 10000;

	private int maxCapasity;

	//==============================================================//

	public Tanker()
	{
		super();
		setMaxCapasity(DEFAULT_CAPASITY);
	}

	public Tanker(int sNumber, String sName, double dwt, String iName, double sValue, int maxCap)
	{
		super(sNumber, sName, dwt, iName, sValue);
		setMaxCapasity(maxCap);
	}

	//==============================================================//

	public void setTanker(int maxCap)
	{
		maxCapasity = maxCap;
	}

	public void setMaxCapasity(int maxCap)
	{
		maxCapasity = maxCap;
	}

	public int getMaxCapasity()
	{
		return (maxCapasity);
	}

	//===============================================================//

	public String toString()
	{
		return (super.toString() + " Capasity: " + getMaxCapasity());
	}
} // Tanker