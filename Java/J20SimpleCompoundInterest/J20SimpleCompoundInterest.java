//J20SimpleCompoundInterest - Steven Long

import java.util.*;

public class J20SimpleCompoundInterest
{
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		double principal, rate, actRate, simpleInt, compoundInt, difference;
		int years;

		System.out.print("\nEnter principal: ");
		principal = console.nextInt();
		System.out.print("\nEnter rate: ");
		rate = console.nextInt();

		actRate=1+rate/100;

		System.out.printf("%5s %10s %10s %10s\n", "Years", "Simple Int", "Compound Int", "Difference");
		System.out.println("============================================================");

		for(years=5; years<=30; years+=5)
		{
			simpleInt=principal*rate/100*years;
			compoundInt=principal*((Math.pow(actRate,years))-1);
			difference=compoundInt-simpleInt;
			System.out.printf("%5d %10.2f %10.2f %10.2f\n", years, simpleInt, compoundInt, difference);
		}


	}
}