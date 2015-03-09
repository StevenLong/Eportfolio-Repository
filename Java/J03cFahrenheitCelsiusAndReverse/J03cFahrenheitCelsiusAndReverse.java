//J03cFahrenheitCelsiusAndReverse - Steven Long

import java.util.Scanner;

public class J03cFahrenheitCelsiusAndReverse
{
	public static void main(String[] args )
	{

	Scanner console = new Scanner(System.in);

	double fah, cel;

	System.out.println();
	System.out.print("Enter temperature in Fahrenheit: ");
	fah = console.nextInt();

	cel = (fah-32)*5/9;

	System.out.println();
	System.out.print("Temperature in Celsius is: " + cel);
	System.out.println();

	System.out.println();
	System.out.print("Enter temperature in Celsius: ");
	cel = console.nextInt();

	fah = (cel*9/5)+32;

	System.out.println();
	System.out.print("Temperature in Fahrenheit is: " + fah);
	System.out.println();


	}
}