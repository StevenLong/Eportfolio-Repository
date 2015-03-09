// Sub class

public class Lorry extends Vehicle
{
	private double maxWeight;

	//====================================================================//

	public Lorry()
	{
		super();
		setLorry(0.00);
	}

	public Lorry(String regNum, String mMod, double rdTax, double maxW)
	{
		super(regNum, mMod, rdTax);
		setLorry(maxW);
	}

	//===================================================================//

	public void setLorry(double maxW)
	{
		setMaxWeight(maxW);
	}

	public void setMaxWeight(double maxW)
	{
		maxWeight = maxW;
	}

} // Lorry