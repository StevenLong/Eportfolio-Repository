// J36EmpPay Starter using "EmpPay.dat"
//'N' employees - while loop
// File Layout: Name(String)/Employee No(int)/Grade(char)/Hrs Worked(double)
// using SWITCH

import java.io.*;
import java.util.*;

public class J36EmpPayStarter
{
 	public static void main(String[] args) throws FileNotFoundException
	{
		// Constants & Variables
		final double ADMIN_RATE = 12.5 , CLERK_RATE = 9.75, MANAGER_RATE = 18.3;

		Scanner console = new Scanner(System.in);

		// File Objects
		Scanner inEmpPayFile = new Scanner(new FileReader("EmpPay.dat"));
		PrintWriter outEmpPayReport = new PrintWriter("EmpPayReport.dat");

		// File Vars
		int empNo;
		String empFirstName;
		String empSurname;
		char empGrade;
		double empHours;

		// Vars

		int empCount;
		double pay, rate, totalPay, averagePay, highPay;
		String fullName, highName;

		// Initialise Vars

		rate = empCount = 0;
		totalPay = highPay = 0.00;

		System.out.println("Name            Emp No.  Grade   Hours       Pay");
		System.out.println("================================================");

		outEmpPayReport.println("Name            Emp No.  Grade   Hours       Pay");
		outEmpPayReport.println("================================================");

		while(inEmpPayFile.hasNext())
		{
			empCount++;
			empNo = inEmpPayFile.nextInt();
			empFirstName = inEmpPayFile.next();
			empSurname = inEmpPayFile.next();
			empGrade = inEmpPayFile.next().charAt(0);
			empHours = inEmpPayFile.nextDouble();

			switch(empGrade)
			{
				case 'A': rate = ADMIN_RATE;
				break;
				case 'C': rate = CLERK_RATE;
				break;
				case 'M': rate = MANAGER_RATE;
				break;
			}

			fullName = empSurname + " " + empFirstName;

			pay = empHours * rate;
			totalPay += pay;

			if(empCount == 1){
				highPay = pay;
				highName = fullName;
			}

			if(pay > highPay){
				highPay = pay;
				highName = fullName;
			}//if



			System.out.printf("%-20s %2d %6c %7.2f %9.2f%n", fullName, empNo, empGrade, empHours, pay);
			outEmpPayReport.printf("%-20s %2d %6c %7.2f %9.2f%n", fullName, empNo, empGrade, empHours, pay);
		} //while

		System.out.printf("Total Pay:%11.2f/n", totalPay);


        inEmpPayFile.close();
        outEmpPayReport.close();

	}  // main

} // J36EmpPay



