// AirAmbulance sub class - Steven Long

public class AirAmbulance extends Helicopter
{

//===  M e m b e r   V a r i a b l e s   ============================


//===  M e m b e r   M e t h o d s  =================================

	public AirAmbulance()
	{
		super();
	}

	public AirAmbulance(int heliId, String heliMM, boolean heliAW, double heliR, int pId, String pName)
	{
		super(heliId, heliMM, heliAW, heliR, pId, pName);
	}

//==================================================================

	public String toString()
	{
		return (super.toString());
	}


} // AirAmbulance