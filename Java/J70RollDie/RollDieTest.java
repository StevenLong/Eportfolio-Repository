

public class RollDieTest
{
	public static void main(String[] args)
	{

		int roll1, roll2, sum;

		RollDie firstRoll = new RollDie();
		System.out.println("First Die set: " + firstRoll.toString());
		System.out.println("First Roll is: " + firstRoll.roll());
		roll1 = firstRoll.getNumber();


		RollDie secondRoll = new RollDie();
		System.out.println("Second Die set: " + secondRoll.toString());
		System.out.println("Second Roll is: " + secondRoll.roll());
		roll2 = secondRoll.getNumber();

		sum = roll1 + roll2;
		System.out.println("Sum rolls 1 + 2 is: " + sum);

		System.out.println("After reroll sum is : " + (firstRoll.roll() + secondRoll.roll()));

	}

}