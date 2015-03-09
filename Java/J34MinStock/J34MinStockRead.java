//J34MinStockRead - Steven Long

import java.io.*;
import java.util.*;

public class J34MinStockRead
{
	public static void main(String []args)
	{
		Scanner minStockFile = new Scanner(new FileReader("minStock.dat"));

		int stkRefNum, stkOldBal, stkIssue, stkReceipts, stkMinLev, stkRecordQty;


		while (inStockFile.hasNext())
		{
			stkRefNum = inStockFile.nextInt();
			stkOldBal = inStockFile.nextInt();
			stkIssue = inStockFile.nextInt();
			stkReceipts = inStockFile.nextInt();
			stkMinLev = inStockFile.nextInt();
			stkRecordQty = inStockFile.nextInt();

			outminStock


		}

		System.out.println();

        inStockFile.close();
	}
}