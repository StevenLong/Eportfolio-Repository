// Insurer inner class

public class Insurer
{
	private String insurerName;

	private double shipValue;

	//===================================================//

	public Insurer()
	{
		setInsurer("No Name", 0.00);
	}

	public Insurer(String iName, double sValue)
	{
		setInsurer(iName, sValue);
	}

	//===================================================//

	public void setInsurer(String iName, double sValue)
	{
		setInsurerName(iName);
		setShipValue(sValue);
	}

	public void setInsurerName(String iName)
	{
		insurerName = iName;
	}

	public String getInsurerName()
	{
		return insurerName;
	}

	public void setShipValue(double sValue)
	{
		shipValue = sValue;
	}

	public double getShipValue()
	{
		return shipValue;
	}

	//===================================================//

	public String toString()
	{
		return (getInsurerName() + " " + getShipValue());
	}
} // Insurer