//J22StarsNested - Steven Long

public class J22StarsNested
{
	public static void main(String[] args)
	{
		int i, j;

		System.out.println("Nested Loops Star Display");
		System.out.println("==========================");


		for(i=1; i<=6; i++)
		{
			for(j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();

		}
	}
}
