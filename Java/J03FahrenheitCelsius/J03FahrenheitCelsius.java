//J03FahrenheitCelsius - Steven Long

import java.util.Scanner;

public class J03FahrenheitCelsius
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

	}
}