//J05cEuroDollarInput - Steven Long

import java.util.*;

public class J05cEuroDollarInput
{
	public static void main(String[] args)
	{

		Scanner console = new Scanner(System.in);

		double exchange;
		double euro;
		double dollar = 0;

		System.out.println();
		System.out.print("Insert exchange rate: ");
		exchange = console.nextDouble();
		System.out.println();

		System.out.println();
		System.out.print("Insert anount in Euro: ");
		euro = console.nextDouble();
		System.out.println();

		dollar = euro*exchange;

		System.out.print("Value in Dollar: " + dollar);
		System.out.println();


		}








	}