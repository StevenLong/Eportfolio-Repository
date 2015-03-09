//J17QtyPriceDisc - Steven Long

import java.util.*;


public class J17QtyPriceDisc
{

	public static void main(String[] args)
	{

	Scanner console=new Scanner(System.in);

	final int MAX_QUANTITY=100, MAX_ITEM=4;
	int quantity, discount, i, exceedCounter=0, exceedQuantity=0;
	double price, cost, netCost, discAmount, totalCost=0, totalDisc=0, totalNetCost=0, aveQtyExceed=0;

	System.out.println("J17QtyPriceDisc			Item	 Qty	Price	 Cost	  Disc	   Net");
	System.out.println("===============================================================================");

	for (i=1; i<=MAX_ITEM; i++)
	{
		System.out.println();
		System.out.print("Qty/Pri/Disc: ");
		quantity = console.nextInt();
		price = console.nextDouble();
		discount = console.nextInt();

		if (quantity>10)
		{
			exceedCounter++;
			exceedQuantity+=quantity;
		}

		cost=quantity*price;
		discAmount=cost*discount/100;
		netCost=cost-discAmount;

		totalCost+=cost;
		totalDisc+=discAmount;
		totalNetCost+=netCost;

		//System.out.println(i + " " + quantity +" " + price + " " + cost +" " + discAmount+ " " + netCost);
		System.out.printf("%25s %8d %8d %8.2f %8.2f %8.2f %8.2f", " ", i, quantity, price, cost, discAmount, netCost);

	}

	System.out.println("\n\n");
	//System.out.print(totalCost + " " + totalDisc + " " + totalNetCost + "\n");
	System.out.printf("    Total cost:  %7.2f \n", totalCost);
	System.out.printf("Total discount:  %7.2f \n", totalDisc);
	System.out.printf("Total net cost:  %7.2f \n", totalNetCost);

	aveQtyExceed=exceedQuantity/exceedCounter;

	System.out.println("\n\n");
	System.out.printf("Exceeded Sales limit: %8d \n", exceedCounter);
	System.out.printf("Average Qty Exceeded Sales: %8.2f \n", aveQtyExceed);

	}

}