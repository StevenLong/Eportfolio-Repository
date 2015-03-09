//J05bEuroDollar - Steven Long

import java.util.*;

public class J05bDollarEuro
{
	public static void main(String[] args)
	{

		Scanner console = new Scanner(System.in);

		double dollar, euro;

		System.out.println();
		System.out.print("Insert value in Dollars: ");
		dollar = console.nextDouble();
		System.out.println();

		euro = dollar/1.45;

		System.out.println();
		System.out.print("Value in Euro is: " + euro);
		System.out.println();

		}

	}