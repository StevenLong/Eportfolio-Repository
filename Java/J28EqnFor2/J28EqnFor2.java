//J28EqnFor2 - Steven Long

public class J28EqnFor2
{
	public static void main(String[] args)
	{
		int x, y, i, lowX = 0, lowY = 0;

		System.out.println("\nY = 2*X Squared - 5*X - 20");
		System.out.println("==========================");

		for(i = -3; i <= 3; i++)
		{
			y =  2*(int)Math.pow(i, 2)-(5*i)-20;
			System.out.printf("  X = %2d      Y = %4d\n", i, y);

			x = y;

			if(x <= lowX)
			{
				lowX = x;
				lowY = i;
			}


		}

		System.out.println("\nSmallest Y is: " + lowX + " for X = " + lowY);
	}
}