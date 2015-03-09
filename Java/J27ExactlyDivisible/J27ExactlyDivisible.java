//J27ExactlyDivisible - Steven Long

import java.util.*;

public class J27ExactlyDivisible
{
	public static void main(String [] args)
	{
		Scanner console = new Scanner(System.in);
		int num1 = 0, num2 = 0;

		System.out.print("Enter first and second intergers: ");
		num1 = console.nextInt();
		num2 = console.nextInt();

		if(num1 % num2 == 0)
		{
			System.out.println(num1 + " Exactly divisible by " + num2);
		}
		else
		{
			System.out.println(num1 + " NOT exactly divisible " + num2);
		}
	}
}