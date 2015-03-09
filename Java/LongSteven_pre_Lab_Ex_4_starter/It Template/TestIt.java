// TestIt  - Gerry Agnew
// Create/instantiate & manipulate objects of type/class It

public class TestIt
{
    public static void main(String[] args)
    {
		System.out.println("\n Create it1=default and it2=222");

        It it1 = new It();
        System.out.println("\n it1.toString(): " + it1.toString());

       	it1.setIt(111);
        System.out.println("\n it1.setMyInt(111): " + it1.toString());

        It it2 = new It(222);
   		System.out.println("\n it2.toString(): " + it2.toString() + "\n");

    }// main

} // TestIt