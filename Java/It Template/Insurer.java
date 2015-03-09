// It Template class - Gerry Agnew

public class Insurer // extends SubClass
{

//== Member Variables ====================================================

    private int it;

    private String insurerName;

    private double shipValue;

//== Member Methods - Constructors =======================================

    public Insurer ( ) // Default constructor - no parameters
    {
		setInsurer("None", 0.00);
    }

    public Insurer (String name, double value) // Constructor with parameters
    {
		setInsurer(name, value);
    }

//== Member Methods - Accesser & Mutater =================================

    public int getInsurer( )
    {
        return it;
    }

   	public void setInsurer(String name, double value)
    {
        it = i;
    }

// == Other Methods (including toString) =================================

    public String toString()
    {
		return ("'It' is: " + getIt());
    }

} // It class