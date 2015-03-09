//J18EqnFor2 - Steven Long

public class J18EqnFor2
{
	public static void main(String[] args)
	{

		int x, y;

		System.out.println("		x 		y");
		System.out.println("====================================");

		for(x=1; x<=8; x++)
		{
			y=3*(x*x)+2*x-4;
			//System.out.println("		"+x+"		 "+y);
			System.out.printf("%17d	%10d \n", x, y);
		}

		System.out.println();
	}
}