// J30EmployeePay - Steven Long
//Calculate Named Employee Pay Based on their grade and hours worked

import java.util.Scanner;

public class J30EmployeePay
{
	public static void main(String []args)
	{
		Scanner console = new Scanner(System.in);

		final double ADMIN = 12.50;
		final double CLERK = 9.75;
		final double MANAGER = 18.30;

		String empName = "";
		char grade;
		int empNumber, hoursWorked = 0;
		double pay, totalPay = 0, rate = 0;

		for(empNumber = 1; empNumber <= 3; empNumber++)
		{
			System.out.println("Enter employee " + empNumber + " Details:");
			System.out.print("Name: ");
			empName = console.nextLine();
			System.out.print("Grade(A/C/M): ");
			grade = console.next().charAt(0);
			System.out.print("Hours Worked: ");
			hoursWorked = console.nextInt();

			if(grade == 'A' || grade == 'a'){
				rate = ADMIN;
			}
			else if(grade == 'C' || grade == 'c'){
				rate = CLERK;
			}
			else if(grade == 'M' || grade == 'm'){
				rate = MANAGER;
			}

			pay = hoursWorked * rate;
			totalPay += pay;

			System.out.printf("\t\t%10s\t\t%6.2f\n", empName, pay);
			console.nextLine();
		}//for

		System.out.printf("%15s%5.2f%%")

	}

}