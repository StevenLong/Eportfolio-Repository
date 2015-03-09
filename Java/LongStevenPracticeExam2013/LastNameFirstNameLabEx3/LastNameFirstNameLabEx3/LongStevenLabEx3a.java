// LongStevenLabEx3a - Steven Long
// Update sports league table with match results

import java.util.Scanner;
import java.io.*;

public class LongStevenLabEx3a
{
    public static void main(String[] args)throws FileNotFoundException
    {
		// 0) Constants/File objects/File Variables/Arrays/Other Variables
		final int STATS = 7;
		final int MAX_TEAMS = 25;
		final String EOF = "eof";
		final int SENTINAL = 0;

		Scanner inLeagueTableFile = new Scanner(new FileReader("LeagueTable.dat"));
		Scanner inMatchResultsFile = new Scanner(new FileReader("MatchResults.dat"));
		PrintWriter outLeagueTableFile = new PrintWriter("newLeagueTable.dat");
		PrintWriter outRejectedMatchResults = new PrintWriter("RejectedMatchResults");

		String teamName, homeTeam, awayTeam;
		int homeScore, awayScore;

		String []teamNames = new String[MAX_TEAMS];
		int [][]leagueTable = new int[MAX_TEAMS][STATS];

		Scanner console = new Scanner(System.in);
		int i, j, teamNo, teamCount, resultCount, posHome, posAway;
		String homeTeam2, awayTeam2;
		char homeResult;
		boolean foundHomeName, foundAwayName;

		// 1) File 1 Input init/while/subsequent read Populate & Output arrays

		System.out.println("Lab Exam practice - Steven Long\n");
		System.out.println("   Team        Play    Won   Draw   Lost Scored Conceded Points");
		System.out.println("===============================================================");


		teamCount = -1;
		teamName = inLeagueTableFile.next();

		while(teamName.equalsIgnoreCase("EOF") == false)
		{
			++teamCount;

			teamNames[teamCount] = teamName;
			System.out.printf("%2d %-9s", teamCount+1, teamNames[teamCount]);

			for(i=0; i<STATS; i++)
			{
				leagueTable[teamCount][i] = inLeagueTableFile.nextInt();
				System.out.printf("%7d", leagueTable[teamCount][i]);

			}
			System.out.println();

			teamName = inLeagueTableFile.next();
		}

		++teamCount;

		inLeagueTableFile.close();

		// 2) File 2 Input init/while/subsequent read & Output
		System.out.println("\n   Home Team Score  V   Away Team Score");
		System.out.println("=======================================");
		resultCount = 0;

		homeTeam = inMatchResultsFile.next();

		while(homeTeam.equalsIgnoreCase("EOF") == false)
		{
			++resultCount;

			homeScore = inMatchResultsFile.nextInt();
			awayTeam = inMatchResultsFile.next();
			awayScore = inMatchResultsFile.nextInt();
			System.out.printf("%2d %-9s %3d    V   %-9s %3d", resultCount, homeTeam, homeScore, awayTeam, awayScore);
			homeTeam = inMatchResultsFile.next();
			System.out.println();
		}

		// 3) do/while single row Output with nested do/while validation
		System.out.print("Enter team number (0/End): ");


		do {
			do {

				System.out.print("Enter team number (0/End): ");
				teamNo = console.nextInt();
			}while(teamNo < 0 || teamNo > teamCount);//inner

			if(teamNo > 0)
			{
				System.out.println("   Team        Play    Won   Draw   Lost Scored Conceded Points");
				System.out.println("===============================================================");
				System.out.printf("%2d %-9s", teamNo, teamNames[teamNo-1]);

				for(i = 0; i < STATS; i++)
				{
					System.out.printf("%7d", leagueTable[teamNo-1][i]);
				}
				System.out.println();
			}//if

		}while(teamNo != 0);//outer

		// 4) File 2 Reprocessed - Input init/while/subsequent read & Output
		      // Search - sucessful/unsucessful processing

		System.out.println("\n   Home Team Score  V   Away Team Score Result");
		System.out.println("==============================================");
		outRejectedMatchResults.println("\n   Home Team Score  V   Away Team Score Result");
		outRejectedMatchResults.println("==============================================");
		outRejectedMatchResults.println();
		outRejectedMatchResults.println("\n   Home Team Score  V   Away Team Score Result");
		outRejectedMatchResults.println("==============================================");

		inMatchResultsFile.close();
		inMatchResultsFile = new Scanner(new FileReader("MatchResults.dat"));
		resultCount = 0;

		homeTeam = inMatchResultsFile.next();
		while(homeTeam.equalsIgnoreCase(EOF) == false)
		{
			++resultCount;

			homeScore = inMatchResultsFile.nextInt(); System.out.print(homeScore);
			awayTeam = inMatchResultsFile.next();
			awayScore = inMatchResultsFile.nextInt();




			foundHomeName = false;
			posHome = -1;
			homeTeam2 = homeTeam;

			while(posHome < teamCount-1 && foundHomeName == false)
			{
				++posHome;
				if(teamNames[posHome].equalsIgnoreCase(homeTeam))
				{
					foundHomeName = true;
					homeTeam2 = "";
				}
				else
				{
					if(teamNames[posHome].compareToIgnoreCase(homeTeam) > 0)
					{
						posHome = teamCount;
					}
				}

			}//while search

			foundAwayName = false;
			posAway = -1;
			awayTeam2 = awayTeam;

			while(posAway < teamCount-1 && foundAwayName == false)
			{
				++posAway;
				if(teamNames[posAway].equalsIgnoreCase(awayTeam))
				{
					foundAwayName = true;
					awayTeam2 = "";
				}
				else
				{
					if(teamNames[posAway].compareToIgnoreCase(awayTeam) > 0)
					{
						posAway = teamCount;
					}
				}

			}//while search

				if(foundHomeName && foundAwayName)
				{
					if(homeScore > awayScore)
					{
						homeResult = 'W';
					}
					else if(homeScore == awayScore)
					{
						homeResult = 'D';
					}
					else
					{
						homeResult = 'L';
					}

					System.out.printf("%2d %-9s %3d    V   %-9s %3d %5s %n", resultCount, homeTeam, homeScore, awayTeam, awayScore, homeResult);

					++leagueTable [posHome][0];
					leagueTable[posHome][4] += homeScore;
					leagueTable[posHome][5] += awayScore;

					switch(homeResult)
					{
						case 'W':
								++leagueTable[posHome][1];
								leagueTable[posHome][6] += 3;
						break;

						case 'D':
								++leagueTable[posHome][2];
								++leagueTable[posHome][6];
						break;

						case 'L':
								++leagueTable[posHome][3];
						break;

					}
				}
				homeTeam = inMatchResultsFile.next();

		}//while


		// 5) File Output from arrays
			  // Close Files

    }  // main

} // LastNameFirstNameLabEx3

