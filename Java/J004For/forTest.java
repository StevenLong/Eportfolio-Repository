//forTest - Steven Long

import java.util.*;

public class forTest
{
	public static void main(String[] args)
	{

		Scanner console = new Scanner(System.in);

		int foo;
		int baa;

		System.out.println();
		System.out.print("Enter number foo: ");
		foo = console.nextInt();
		System.out.println();


		for (foo = foo; foo < 100; foo= foo+5)

		System.out.print(foo + " ");
		System.out.println();

		System.out.println();
		System.out.print("Enter number baa: ");
		System.out.println();

		for (baa = console.nextInt(); baa > 100; baa++)

		System.out.println();
		System.out.print(baa + " ");
		System.out.println();

		}

}