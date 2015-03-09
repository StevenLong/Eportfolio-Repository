//Output area of circles with radius 2 and 5 - Steven Long

public class J01AreaCircleRadius2And5
{
	public static void main (String[] args)
	{
		final Double PI = 3.142;
		int Radius2;
		Double Area2;

		int Radius5;
		Double Area5;

		Radius2 = 2;

		Area2 = PI*Radius2*Radius2;

		System.out.println();
		System.out.println("Area 2 is " + Area2);
		System.out.println();

		Radius5 = 5;

		Area5 = PI*Radius5*Radius5;

		System.out.println();
		System.out.println("Area 5 is " + Area5);
		System.out.println();

	}

}