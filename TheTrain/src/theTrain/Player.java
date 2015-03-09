package theTrain;
import java.io.IOException;
import java.util.*;

public class Player {
	
	int currentHealth;
	int currentWellBeing;
	boolean currentlyDead;
	String playerName;
	int noOfHeals;
	
	public Player() throws IOException{
		playerName = "";
		currentHealth = 100;
		currentWellBeing = 0;
		currentlyDead = false;
		noOfHeals = 5;
	}
	
	public String setPlayerName() throws IOException{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter player name: ");
		playerName = keyboard.next();
		//keyboard.close();
		return playerName;
	}
	
	public String getPlayerName(){
		return playerName;
	}
	
	public int updateHealthPoints(){
		currentHealth += currentWellBeing;
		return currentHealth;
	}
	
	public int getHealthPoints(){
		return currentHealth;
	}
	
	public int wellbeingUp(){
		currentWellBeing++;
		return currentWellBeing;
	}
	
	public int wellbeingDown(){
		currentWellBeing--;
		return currentWellBeing;
	}
	
	public void useHealthKit(){
		noOfHeals--;
		for(int i = 0; i<15; i++){
			wellbeingUp();
		}
		System.out.println("Your condition improves.");
	}
	
	public boolean healthCheck(){
		if(currentHealth > 0){
			currentlyDead = false;
			return currentlyDead;
		}
		else{
			currentlyDead = true;
			System.out.println(healthGameover());
			System.exit(0);
			return currentlyDead;
		}
	}
	
	public String healthGameover(){
		String s = "The last of your health is gone.\nYou have failed.\nGameover.";
		return s;
	}

}
