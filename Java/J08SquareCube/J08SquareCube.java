//J08SquareCube - StevenLong
//Numbers Squared and Cubed Table using a for loop

import java.util.*;

public class J08SquareCube
{
	public static void main(String[] args)
	{

		Scanner console = new Scanner(System.in);

		//final int MAX_NUM = 8;

		int i = 0, square, cube;
		int numStart, numEnd;
		String heading1 = "No.";
		String heading2 = "Square";
		String heading3 = "Cube";
		String underscore = "=========================";

		System.out.println();
		System.out.print("Enter starting number: ");
		numStart = console.nextInt();
		System.out.println();
		System.out.print("Enter ending number: ");
		numEnd = console.nextInt();



		System.out.println();
		System.out.printf("%-6s %-6s %-6s \n \n", heading1, heading2, heading3);
		System.out.printf("%-23s", underscore);


		//for(i = 1; i <= MAX_NUM; i++)
		for(i = numStart; i <= numEnd; i++)
		{
			square = i*i;
			cube = i*i*i;

			System.out.println();
			//System.out.print(i + " " + square + " " + cube);
			System.out.printf("%6d %6d %6d", i, square, cube);
			System.out.println();

		}






		}












	}