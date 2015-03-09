// Helicopter super class - Steven Long

public class Helicopter
{

//===  M e m b e r   V a r i a b l e s   ============================

	private int helicopterId;
	private String heliMakeModel;
	private boolean heliAllWeather;
	private double heliRange;
	private Pilot pilot;

//===  M e m b e r   M e t h o d s  =================================

	public Helicopter()
	{
		setHelicopter(0, "NoMakeModel", false, 0.00);
		pilot = new Pilot();
	}

	public Helicopter(int heliId, String heliMM, boolean heliAW, double heliR)
	{
		setHelicopter(heliId, heliMM, heliAW, heliR);
		pilot = new Pilot();
	}

	public Helicopter(int heliId, String heliMM, boolean heliAW, double heliR, int pId, String pName)
	{
		setHelicopter(heliId, heliMM, heliAW, heliR);
		pilot = new Pilot(pId, pName);
	}

//===================================================================

	public void setHelicopter(int heliId, String heliMM, boolean heliAW, double heliR)
	{
		setHelicopterId(heliId);
		setHeliMakeModel(heliMM);
		setHeliAllWeather(heliAW);
		setHeliRange(heliR);
	}

	public void setHelicopterId(int heliId)
	{
		helicopterId = heliId;
	}

	public int getHelicopterId()
	{
		return helicopterId;
	}

	public void setHeliMakeModel(String heliMM)
	{
		heliMakeModel = heliMM;
	}

	public String getHeliMakeModel()
	{
		return heliMakeModel;
	}

	public void setHeliAllWeather(boolean heliAW)
	{
		heliAllWeather = heliAW;
	}

	public boolean getHeliAllWeather()
	{
		return heliAllWeather;
	}

	public void setHeliRange(double heliR)
	{
		heliRange = heliR;
	}

	public double getHeliRange()
	{
		return heliRange;
	}

//==================================================================

	public void setPilot(int pId, String pName)
	{
		pilot.setPilot(pId, pName);
	}

	public String getPilot()
	{
		return pilot.toString();
	}

//==================================================================

	public String toString()
	{
		String s = String.format("%4d %11s%6b%10.2f%11s", getHelicopterId(), getHeliMakeModel(), getHeliAllWeather(), getHeliRange(), pilot.toString());

		return s;
	}

} // Helicopter