// AirTaxi sub class - Steven Long

public class AirTaxi extends Helicopter
{

//===  M e m b e r   V a r i a b l e s   ============================
	private int maxPassangers;

//===  M e m b e r   M e t h o d s  =================================

	public AirTaxi()
	{
		super();
		setMaxPassangers(0);
	}

	public AirTaxi(int heliId, String heliMM, boolean heliAW, double heliR, int pId, String pName, int maxP)
	{
		super(heliId, heliMM, heliAW, heliR, pId, pName);
		setMaxPassangers(maxP);
	}

//====================================================================

	public void setMaxPassangers(int maxP)
	{
		maxPassangers = maxP;
	}

	public int getMaxPassangers()
	{
		return maxPassangers;
	}

//====================================================================

	public String toString()
	{
		String s = super.toString() + " Pass: " + getMaxPassangers();
		return s;
	}

} // AirTaxi