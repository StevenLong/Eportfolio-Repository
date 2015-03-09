// Test MyClass class - Gerry Agnew (with main() method java starting point)

// Create/instantiate and manipulate objects of type MyClass

public class TestMyClass
{
    public static void main(String[] args)
    {
		System.out.println("\n Create var1=default and var2=22");

		// Create an object/instance of MyClass called var1 using default constructor
        MyClass var1 = new MyClass();

        // Call var1 object toString() method to verify the object contents
        System.out.println("\n var1.toString(): " + var1.toString());

		// Create an object/instance of MyClass called var2 using parameter constructor
        MyClass var2 = new MyClass(22);

        // Call var2 object toString() method to verify the object contents
   		System.out.println("\n var2.toString(): " + var2.toString());

        // Call var2 object setMemberVar() method to manipulate the object
       	var2.setMemberVar(99);

        // Call var2 object toString() method to verify the object contents
        System.out.println("\n var2.setMyInt(99): " + var2.toString());

		System.out.println();

    }// main

} // TestMyClass