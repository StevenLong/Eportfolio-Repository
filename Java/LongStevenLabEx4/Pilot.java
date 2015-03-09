// Pilot inner class - Steven Long

public class Pilot
{

//===  M e m b e r   V a r i a b l e s   ============================

	private int pilotId;
	private String pilotName;

//===  M e m b e r   M e t h o d s  =================================

	public Pilot()
	{
		setPilot(0, "No Pilot");
	}

	public Pilot(int pId, String pName)
	{
		setPilot(pId, pName);
	}

//==================================================================

	public void setPilot(int pId, String pName)
	{
		setPilotId(pId);
		setPilotName(pName);
	}

	public void setPilotId(int pId)
	{
		pilotId = pId;
	}

	public int getPilotId()
	{
		return pilotId;
	}

	public void setPilotName(String pName)
	{
		pilotName = pName;
	}

	public String getPilotName()
	{
		return pilotName;
	}

//=================================================================

	public String toString()
	{
		String s = String.format("%5d %6s", getPilotId(), getPilotName());

		return s;
	}

} // Pilot