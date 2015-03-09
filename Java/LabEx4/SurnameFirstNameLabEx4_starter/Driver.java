// Gerry Agnew

public class Driver
{
	private int driverNumber;
	private String driverName;

	//======================================================//

	public Driver()
	{
		setDriver(0, "No Name");
	}

	public Driver(int dNumber, String dName)
	{
		setDriver(dNumber, dName);
	}

	//======================================================//

	public void setDriver(int dNumber, String dName)
	{
		setDriverNumber(dNumber);
		setDriverName(dName);
	}

	public void setDriverNumber(int dNumber)
	{
		driverNumber = dNumber;
	}

	public int getDriverNumber()
	{
		return driverNumber;
	}

	public void setDriverName(String dName)
	{
		driverName = dName;
	}

	public String getDriverName()
	{
		return driverName;
	}

	//=====================================================//

	public String toString()
	{
		return (getDriverNumber() + " " + getDriverName());
	}

} // Driver