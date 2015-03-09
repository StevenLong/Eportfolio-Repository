//J24AeqBeqC - Steven Long
import java.util.*;

public class J24AeqBeqC
{
	public static void main(String []args)
	{
		Scanner console = new Scanner (System.in);
		int num1, num2, num3;

		System.out.print("Enter numbers 1, 2, 3: ");
		num1 = console.nextInt();
		num2 = console.nextInt();
		num3 = console.nextInt();

		if(num1 == num2 && num2 == num3)
		{
			System.out.println("All three numbers are equal.");
		}

		else if(num1 == num2 || num2 == num3 || num1 == num3)
		{
			System.out.println("Two numbers equal.");
		}
		else
		{
			System.out.println("None of 3 Numbers equal.");
		}
	}

}
