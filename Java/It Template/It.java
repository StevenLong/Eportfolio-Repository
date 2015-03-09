// It Template class - Gerry Agnew

public class It // extends SubClass
{

//== Member Variables ====================================================

    private int it;

//== Member Methods - Constructors =======================================

    public It ( ) // Default constructor - no parameters
    {
		setIt(0);
    }

    public It (int i) // Constructor with parameters
    {
		setIt(i);
    }

//== Member Methods - Accesser & Mutater =================================

    public int getIt( )
    {
        return it;
    }

   	public void setIt(int i)
    {
        it = i;
    }

// == Other Methods (including toString) =================================

    public String toString()
    {
		return ("'It' is: " + getIt());
    }

} // It class