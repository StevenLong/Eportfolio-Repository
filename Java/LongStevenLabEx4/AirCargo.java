// AirCargo sub class - Steven Long

public class AirCargo extends Helicopter
{

//===  M e m b e r   V a r i a b l e s   ============================

	private final int DEFAULT_CAPASITY = 12;

	private int maxCapasity;
	private int maxWeight;


//===  M e m b e r   M e t h o d s  =================================

	public AirCargo()
	{
		super();
		setAirCargo(DEFAULT_CAPASITY, 0);
	}

	public AirCargo(int heliId, String heliMM, boolean heliAW, double heliR, int pId, String pName, int maxCap, int maxW)
	{
		super(heliId, heliMM, heliAW, heliR, pId, pName);
		setAirCargo(maxCap, maxW);
	}

//===================================================================

	public void setAirCargo(int maxCap, int maxW)
	{
		setMaxCapasity(maxCap);
		setMaxWeight(maxW);
	}

	public void setMaxCapasity(int maxCap)
	{
		maxCapasity = maxCap;
	}

	public int getMaxCapasity()
	{
		return maxCapasity;
	}

	public void setMaxWeight(int maxW)
	{
		maxWeight = maxW;
	}

	public int getMaxWeight()
	{
		return maxWeight;
	}

//==================================================================

	public String toString()
	{
		String s = super.toString() + " Cap: " + getMaxCapasity() + " Wght: " + getMaxWeight();
		return s;
	}



} // AirCargo