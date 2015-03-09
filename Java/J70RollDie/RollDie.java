import java.lang.*;

public class RollDie
{
	private int num;

	public RollDie()
	{
		num = 1;
	}

	public int roll()
	{
		num = (int)(Math.random()*6)+1;
		return num;
	}

	public int getNumber()
	{
		return num;
	}

	public String toString()
	{
		return ("Dice rolled " + num);
	}
}