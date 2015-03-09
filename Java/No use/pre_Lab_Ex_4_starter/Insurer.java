// Insurer class - Steven Long

public class Insurer // extends SubClass
{

//== Member Variables ====================================================

    //private String;

    private String insurerName;

    private double shipValue;

//== Member Methods - Constructors =======================================

    public Insurer ( ) // Default constructor - no parameters
    {
		setInsurer("No insurer", 0.00);
    }

    public Insurer (String name, double value) // Constructor with parameters
    {
		setInsurer(name, value);
    }

//== Member Methods - Accesser & Mutater =================================


   	public void setInsurerName(String name)
    {
        insurerName = name;
    }

	public String getInsurerName( )
	{
		return insurerName;
	}

	public void setShipValue(double value)
	{
		shipValue = value;
	}

	public double getShipValue()
	{
		return shipValue;
	}

	public void setInsurer(String name, double value)
	{
		setInsurerName(name);
		setShipValue(value);
	}



// == Other Methods (including toString) =================================

    public String toString()
    {
		return ("Insurer:" + getInsurerName() + getShipValue());
    }

} // Insurer class