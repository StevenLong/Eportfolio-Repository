// Super class

public class Vehicle
{
	private String regNumber;
	private String makeModel;
	private double roadTax;
	private Driver driver;

	//================================================//

	public Vehicle()
	{
		setVehicle("","", 0.00);
		driver = new Driver();
	}

	public Vehicle(String regNum, String mMod, double rdTax, int dNum, String dName)
	{
		setVehicle(regNum, mMod, rdTax);
		driver = new Driver();
	}

	//=================================================//

	public void setVehicle(String regNum, String mMod, double rdTax)
	{
		setRegNumber(regNum);
		setMakeModel(mMod);
		setRoadTax(rdTax);
	}

	public void setRegNumber(String regNum)
	{
		regNumber = regNum;
	}

	public String getRegNumber()
	{
		return regNumber;
	}

	public void setMakeModel(String mMod)
	{
		makeModel = mMod;
	}

	public String getMakeModel()
	{
		return makeModel;
	}

	public void setRoadTax(double rdTax)
	{
		roadTax = rdTax;
	}

	public void setRoadTax(int rdTax)
	{
		roadTax *= ((rdTax / 100) + 1);
	}

	public double getRoadTax()
	{
		return roadTax;
	}

	//==========================================================//

	public void setDriver(int dNumber, String dName)
	{
		driver.setDriver(dNumber, dName);
	}

	public String getDriver()
	{
		return driver.toString();
	}

	//==========================================================//

	public String toString()
	{
		return (getRegNumber() + " " + getMakeModel() + " " + getRoadTax() + " " + driver.toString());
	}

} // Vehicle