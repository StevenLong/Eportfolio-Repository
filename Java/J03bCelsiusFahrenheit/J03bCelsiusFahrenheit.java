//J03bCelsiusFahrenheit - Steven Long

import java.util.Scanner;

public class J03bCelsiusFahrenheit
{
	public static void main(String[] args )
	{

	Scanner console = new Scanner(System.in);

	double fah, cel;

	System.out.println();
	System.out.print("Enter temperature in Celsius: ");
	cel = console.nextInt();

	fah = (cel*9/5)+32;

	System.out.println();
	System.out.print("Temperature in Fahrenheit is: " + fah);
	System.out.println();

	}
}