//J34MinStock - Steven Long

import java.io.*;

public class J34MinStock
{
	public static void main(String []args)
			throws FileNotFoundException
	{
		PrintWriter outMinStock = new PrintWriter("minStock.dat");

		System.out.println("\nCreating the Stock.dat file. \n");

			outMinStock.printf("%4d%5d%4d%5d%4d%5d%n", 11, 100, 20, 30, 50, 40);
			System.out.printf("%4d%5d%4d%5d%4d%5d%n", 11, 100, 20, 30, 50, 40);
			outMinStock.printf("%4d%5d%4d%5d%4d%5d%n", 11, 100, 20, 30, 50, 40);
			System.out.printf("%4d%5d%4d%5d%4d%5d%n", 11, 100, 20, 30, 50, 40);
			outMinStock.printf("%4d%5d%4d%5d%4d%5d%n", 11, 100, 20, 30, 50, 40);
			System.out.printf("%4d%5d%4d%5d%4d%5d%n", 11, 100, 20, 30, 50, 40);
			outMinStock.printf("%4d%5d%4d%5d%4d%5d%n", 11, 100, 20, 30, 50, 40);
			System.out.printf("%4d%5d%4d%5d%4d%5d%n", 11, 100, 20, 30, 50, 40);

			System.out.println("\nStock.dat created. \n");

			outMinStock.close();


	}

}