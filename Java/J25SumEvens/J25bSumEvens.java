//J25bSumEvens - Steven Long

public class J25bSumEvens
{
	public static void main(String []args)
	{
		int i, evenCount = 0, sum = 0, average = 0;

		for(i = 1; i <= 20; i += 2)
		{
			sum += i;
			evenCount += 1;

			System.out.print(i + " ");
		}

		average = sum/evenCount;

		System.out.println();
		System.out.println("\nSum = " + sum);
		System.out.println("average = " + average);
	}
}