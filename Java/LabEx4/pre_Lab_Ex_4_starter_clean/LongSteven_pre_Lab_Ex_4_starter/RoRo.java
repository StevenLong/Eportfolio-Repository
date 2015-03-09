// RoRo sub class

public class RoRo extends CargoShip
{
	private int maxLorrys;
	private int maxPassangers;

	//========================================================================//

	public RoRo()
	{
		super();
		setRoRo(0, 0);
	}

	public RoRo(int sNumber, String sName, double dwt, String iName, double sValue, int maxL, int maxP)
	{
		super(sNumber, sName, dwt, iName, sValue);
		setRoRo(maxL, maxP);
	}

	//========================================================================//

	public void setRoRo(int maxL, int maxP)
	{
		setMaxLorrys(maxL);
		setMaxPassangers(maxP);
	}

	public void setMaxLorrys(int maxL)
	{
		maxLorrys = maxL;
	}

	public int getMaxLorrys()
	{
		return (maxLorrys);
	}

	public void setMaxPassangers(int maxP)
	{
		maxPassangers = maxP;
	}

	public int getMaxPassangers()
	{
		return (maxPassangers);
	}

	//========================================================================//

	public String toString()
	{
		return (super.toString() + " Lorrys: " + getMaxLorrys() + " Pass: " + getMaxPassangers());
	}

} // RoRo