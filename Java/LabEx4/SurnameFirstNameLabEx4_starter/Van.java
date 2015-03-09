// sub calss

public class Van extends Vehicle
{
	private int maxPassangers;
	private int maxDoors;

	//==============================================//

	public Van()
	{
		super();
		setVan(0, 2);
	}

	public Van(String regNum, String mMod, double rdTax, int maxP, int maxD)
	{
		super(regNum, mMod, rdTax);
		setVan(maxP, maxD);
	}

	//=============================================//

	public void setVan(int maxP, int maxD)
	{
		setMaxPassangers(maxP);
		setMaxDoors(maxD);
	}

	public void setMaxPassangers(int maxP)
	{
		maxPassangers = maxP;
	}

	public int getMaxPassangers()
	{
		return maxPassangers;
	}

	public void setMaxDoors(int maxD)
	{
		maxDoors = maxD;
	}

	public int getMaxDoors()
	{
		return maxDoors;
	}

	//============================================//

	public String toString()
	{
		return (getMaxPassangers() + " " + getMaxDoors());
	}

} // Van