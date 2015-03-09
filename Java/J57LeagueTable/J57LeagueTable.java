//J57LeagueTable - Steven Long
//League Table Results

import java.util.*;

public class J57LeagueTable
{
	public static void main(String []args)
	{
		Scanner console = new Scanner(System.in);
		int team[] = {1, 2, 3, 4};
		int played[] = {3, 3, 2, 2};
		int goalsScored[] = {7, 4, 7, 1};
		int goalsConceded[] = {5, 8, 3, 3};
		int won[] ={1, 1, 2, 0};
		int lost[] = {1, 2, 0, 1};
		int drawn[] = {1, 0, 0, 1};
		int points[] = {3, 2, 4, 1};
		int goalsFor, goalsAgain, teamNum;

		System.out.print("Enter team no (1..4/9 to Exit): ");
		teamNum = console.nextInt();

		while(teamNum < 1 || (teamNum > 4 && teamNum != 9))
		{
			System.out.print("\nInvalid team no - please re-enter");
			System.out.print("\nEnter team no (1..4/9 to Exit): ");
			teamNum = console.nextInt();
		}

		while(teamNum != 9)
		{
			--teamNum;
			++team[teamNum];

			System.out.print("Goals for: ");
			goalsFor = console.nextInt();
			goalsScored[teamNum] += goalsFor;
			System.out.print("Goals against: ");
			goalsAgain = console.nextInt();
			goalsConceded[teamNum] += goalsAgain;

			if(goalsFor > goalsAgain)
			{
				++won[teamNum];
				points[teamNum] += 2;
			}
			else if(goalsAgain > goalsFor)
			{
				++lost[teamNum];
			}
			else
			{
				++drawn[teamNum];
				points[teamNum] += 1;
			}


			System.out.print("Enter team no (1..4/9 to Exit): ");
			teamNum = console.nextInt();

			while(teamNum < 1 || (teamNum > 4 && teamNum != 9))
			{
				System.out.print("\nInvalid team no - please re-enter");
				System.out.print("\nEnter team no (1..4/9 to Exit): ");
				teamNum = console.nextInt();
			}
		}

		System.out.println("Team  Played      Won   Drawn    Lost     For Against  Points");
		System.out.println("=============================================================");

		for(teamNum = 0; teamNum < 4; teamNum++)
		{
			System.out.printf("%4d%8d%8d%8d%8d%8d%8d%8d\n",teamNum + 1, played[teamNum], won[teamNum], drawn[teamNum], lost[teamNum], goalsScored[teamNum], goalsConceded[teamNum], points[teamNum]);

		}
	}

}