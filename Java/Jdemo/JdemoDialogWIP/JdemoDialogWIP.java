//JdemoDialogWIP - Steven Long

import javax.swing.JOptionPane;

public class JdemoDialogWIP
{
	public static void main(String []args)
	{

		String name, string, str1;
		int num1 =20, num2 = 10, sum = 0, x = 1, y = 2, z = 3;

		name = JOptionPane.showInputDialog("Enter name: ");

		JOptionPane.showMessageDialog(null, "Hello " + name);

		string = JOptionPane.showInputDialog("Enter an int: ");

		num1 = Integer.parseInt(string);

		JOptionPane.showMessageDialog(null, "Int is:" + num1 + " int plus 100 is " + (num1 + 100));

		str1 = "The two numbers are " + num1 + " and " + num2 + "\n";

		sum = num1 + num2;

		str1 += "The sum of the numbers is: " + sum + "\n";

		str1 += "That's all for now";

		JOptionPane.showMessageDialog(null, str1, "Summing", JOptionPane.ERROR_MESSAGE);

		str1 = "x= " + String.format("%2d", x) + "\n";

		str1 += "y= " + String.format("%2d", y) + "\n";

		str1 += "z= " + String.format("%2d", z) + "\n";

		JOptionPane.showMessageDialog(null, str1, "3-12/3-14", JOptionPane.WARNING_MESSAGE);

		System.exit(0);
	}
}

