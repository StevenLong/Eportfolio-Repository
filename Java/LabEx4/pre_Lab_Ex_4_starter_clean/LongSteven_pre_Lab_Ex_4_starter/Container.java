// Container sub class

public class Container extends CargoShip
{

	public Container()
	{
		super();
	}

	public Container(int sNumber, String sName, double dwt, String iName, double sValue)
	{
		super(sNumber, sName, dwt, iName, sValue);
	}

	//================================================================================================//

	public void setContainer(int sNumber, String sName, double dwt)
	{
		setCargoShip(sNumber, sName, dwt);
	}

	//================================================================================================//

	public String toString()
	{
		return (super.toString());
	}

} // Container