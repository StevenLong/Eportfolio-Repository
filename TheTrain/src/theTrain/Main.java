package theTrain;
import java.io.IOException;
import java.util.*;

public class Main {
	
	Player p1;
	Event e;
	Train t;
	
	public Main()throws IOException{
		p1 = new Player();
		e = new Event();
		t = new Train();
	}
	
	public void playTurn() throws IOException{
		e.playEvent(p1, t);
		p1.updateHealthPoints();
		t.showCondition();
		p1.healthCheck();
		t.checkBroken();
	}
	
	public void afterTurn(){
		
		Scanner scan = null;
		int c = 9;
		boolean invalidInput = false;
		do{
			System.out.println("Enter 0 to continue, 1 to use a health kit, or 2 to repair the train: ");
			scan = new Scanner(System.in);
			try{
				c = scan.nextInt();
				invalidInput = false;
			}
			catch(Exception e){
				System.out.println("Invalid input, enter 0, 1, or 2");
				invalidInput = true;
			}
		}while(invalidInput == true);
		
		if(c == 1){
			if(p1.noOfHeals>0){
				p1.useHealthKit();
				if(p1.currentWellBeing < 0){
					int negWell = (p1.currentWellBeing * -1);
					System.out.println("Your health will decrease by " + negWell + " each turn.");
				}
				else{
					System.out.println("Your health will increase by " + p1.currentWellBeing + " each turn.");
				}
			}
			else{
				System.out.println("You don't have any health kits.");
			}
			afterTurn();
		}
		else if(c == 2){
			if(t.repairKit>0){
				t.useRepairKit();
				t.showCondition();
			}
			else{
				System.out.println("You don't have any repair kits.");
				
			}
			afterTurn();
		}
		else if(c == 0){
			System.out.println("The train rolls on.");
		}
		else{
			System.out.println("Incorrect input, try again.");
			afterTurn();
		}
		
		//scan.close();
	}

	public static void main(String[] args) throws IOException{
		
		Main m = new Main();
		m.p1.setPlayerName();
		System.out.println("=====================================================================================");

		System.out.println("\nWelcome " + m.p1.getPlayerName() + 
				".\n\nIn this game your objective is to survive a journey across a\n" +
				"barren wasteland in search of land you can live on.\n" +
				"You are the owner of the last (mostly) working train in all the land!\n" +
				"If you get hurt on your journey you will need to heal yourself.\n" +
				"If you don't your condition will worsen each turn.\n" +
				"Likewise, the train can take damage and will eventually break.\n" +
				"You start with 5 health kits to help you maintain your health,\n" +
				"and 5 repair kits to maintain the train." +
				"You must protect it, and yourself, if you expect to succeed.\n"+
				"This game will require luck and forethought in order to survive.\n\nGood luck!");
		Scanner enter = new Scanner(System.in);
		System.out.println("=====================================================================================");
		System.out.println("Press enter to continue.");
		System.out.println("=====================================================================================");
		enter.nextLine();
		
		for(int i =0; i<=30; i++){
			m.playTurn();
			System.out.println("Your health is " + m.p1.getHealthPoints());
			System.out.println("=====================================================================================");
			m.afterTurn();
			System.out.println("=====================================================================================");
		}
		
		System.out.println("=====================================================================================");
		System.out.println("You beat the game and live happily ever after.\nWell done " + m.p1.playerName + ".");
		System.out.println("=====================================================================================");

		enter.close();
	}

}