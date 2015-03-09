//J21MultiplyTable - Steven Long
import java.util.*;

public class J21MultiplyTable
{
	public static void main(String[] args)
	{
		int i, j, product = 0, tableSize;
		Scanner console = new Scanner(System.in);

		System.out.println("21 - Multiplication Table");
		System.out.println("=========================\n");
		System.out.print("Enter times table size: ");
		tableSize=console.nextInt();
		System.out.println();
		System.out.print("   ");

		for(i=1; i<=tableSize; i++)
		{

			System.out.printf("%4d", i);
		}

		System.out.println();
		System.out.print("   ");

		for(i=1; i<=tableSize; i++)
		{
			System.out.print("----");
		}

		System.out.println();

		for(i=1; i<=tableSize; i++)
		{
			System.out.print(" " + i + "|");

			for(j=1; j<=tableSize; j++)
			{
				product=i*j;
				//System.out.print(product + "\t");
				System.out.printf("%4d", product);
			}

			System.out.println();
		}

	}

}