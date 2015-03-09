//J25SumEvens - Steven Long

public class J25SumEvens
{
	public static void main(String []args)
	{
		int i, evenCount = 0, sum = 0, average = 0;

		for(i = 2; i <= 20; i += 2)
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