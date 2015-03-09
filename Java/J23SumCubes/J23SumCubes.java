//J23SumCubes - Steven Long

public class J23SumCubes
{
	public static void main(String[] args)
	{
		int number, numberCubed, sum=0;

		System.out.printf("%4s %10s\n", "No", "Cube");
		System.out.println("===============");

		for(number=1; number<=8; number++)
		{
			numberCubed=(int)Math.pow(number,3);
			System.out.printf("%4d %10d\n", number, numberCubed);
			sum+=numberCubed;
		}

		System.out.println("===============");
		System.out.printf("sum:%11d\n", sum);
	}
}