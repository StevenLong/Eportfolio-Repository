// MyClass - Gerry Agnew Note: no main ( ) method requiring separate test program

public class MyClass
{
//== Member Variables =============================================================
    private int myMemberVar;

//== Member Methods ===============================================================
//== Constructors (same name as class) ============================================
    public MyClass( ) 		 // Default constructor - no parameters
    {
		myMemberVar = 1; 	 // set member variables directly
    }
    public MyClass (int i) 	 // Constructor with parameters
    {
		setMemberVar(i);     // set member variables via method if error handling
    }

//== Accessor & Mutator methods (get/sets) ========================================
    public int getMemberVar( )
    {
        return myMemberVar;
    }
   	public void setMemberVar(int i)
    {
        myMemberVar = i;
    }

// == Other Methods (including toString) ==========================================
    public String toString()
    {
	      return ("Member Var is: " + myMemberVar);
    }
} // MyClass