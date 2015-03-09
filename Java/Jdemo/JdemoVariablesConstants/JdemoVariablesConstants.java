// JdemoVariablesConstants - Gerry Agnew
// Demo of java Variables and Constants

public class JdemoVariablesConstants
{
	public static void main(String[] args)
	{
		// A variable is a memory location whose contents can change (vary)
		// Variable syntax: type variableName; or type variableName = value;

		// Type: int (integer) - whole positive/negative numbers

		int number;
		int myNumber = 10;
		int num1, num2, num3;

		myNumber = 77;

		System.out.println("myNumber is: " + myNumber);
		System.out.println();

		// Type: double - numbers with a decimal point

		double pay;
		double price = 31.56;
		double pay1, pay2, pay3;

		pay = 34567.89;

		System.out.println("pay is: " + pay);
		System.out.println();

		// Type: char - single character including punctuation

		char digit;
		char letter = 't';
		char let1, let2, let3;

		digit = '6';

		System.out.println("digit is: " + digit);
		System.out.println();

		// Type: bool - 2 values either true or false

		boolean happy;
		boolean isRaining = true;
		boolean isMon, isTue, isWed;

		isRaining = false;

		System.out.println("isRaining is: " + isRaining);
		System.out.println();

		// A constant is a memory location whose contents cannot change (fixed/locked)
		// Variable syntax: final type constantName = value;

		// Constants are defined the same as for variables except 1) They are prefixed by final
		// 2) Normally have an initial value 3) Employ an upper case naming convention

		final double CENTIMETRES_PER_INCH = 2.54, PI = 3.142;
		final int TAX_RATE;
		final char BLANK = ' ';
		final boolean SWITCHED_OFF = true;

		// PI = 10.999; // cannot be assigned or only assigned once

		System.out.println("CENTIMETRES_PER_INCH is: " + CENTIMETRES_PER_INCH);
		System.out.println();

	} // main
} // JdemoVariablesConstants
