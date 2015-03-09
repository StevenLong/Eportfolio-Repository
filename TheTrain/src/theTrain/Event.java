package theTrain;
import java.util.*;
import java.io.*;

public class Event extends Read_File {
		
	private String[] eventArray;
	
	public Event() throws IOException{
		super();
		String events_file = "EventTxt.txt";		
		Read_File file = new Read_File(events_file);
		eventArray = file.collectEvents();
		
	}
	
	public int randomPercent(){
		Random r = new Random();
		int randPC = r.nextInt((100 - 0) + 1);
		return randPC;
	}
	
	public void playEvent(Player p1, Train t) throws IOException{
		enumEvents();
		String event = fetchEvent();
		Scanner organiser = new Scanner(event);
		organiser.useDelimiter("~");
		
		//story strings
		for(int i = 0; i<3; i++){
			String s;
			s = organiser.next();
			System.out.println("" + s);
		}
		//options strings
		for(int i = 0; i<3; i++){
			String o;
			o = organiser.next();
			System.out.println("" + o);
		}
		
		//results
		String[] goodOutcome = new String[3];
		String[] effects = new String[7];
		int n = 0;
		for(int i=0; i<3; i++){			//good arrays
			String results;
			String effect;
			results = organiser.next();
			effect = organiser.next();
			goodOutcome[n] = results;
			effects[n] = effect;
			n++;
		}
		int o = 0;
		String[] badOutcome = new String[3];
		for(int i=0; i<3; i++){			//bad arrays
			String results;
			String effect;
			
			results = organiser.next();
			effect = organiser.next();
			badOutcome[o] = results;
			effects[n] = effect;
			o++;
			n++;
		}	
		organiser.close();
		
		int c = 0;
		boolean correct = false;
		int r = randomPercent();
		while(correct == false){					//result while
			boolean invalidInput = false;
			
			do{
				Scanner choice = new Scanner(System.in);
				System.out.print("Choose 1, 2, or 3: ");
				invalidInput = false;
				
				try{
					c = choice.nextInt();
					invalidInput = false;
				}catch(Exception e){
					System.out.println("Invalid entry, please enter 1, 2, or 3.");
					invalidInput = true;
				}
			}while(invalidInput == true);//end exception while

			if( r > 70){
				if(c == 1){								//good outcome
					System.out.println("" + goodOutcome[0]);
					correct = true;
				}
				else if(c == 2){
					System.out.println("" + goodOutcome[1]);
					correct = true;
				}
				else if(c == 3){
					System.out.println("" + goodOutcome[2]);
					correct = true;
				}
				else{
					System.out.println("Incorrect input.");
					correct = false;
				}
			}
			else{
				if(c == 1){								//bad outcome
					System.out.println("" + badOutcome[0]);
					correct = true;
				}
				else if(c == 2){
					System.out.println("" + badOutcome[1]);
					correct = true;
				}
				else if(c == 3){
					System.out.println("" + badOutcome[2]);
					correct = true;
				}
				else{
					System.out.println("Incorrect input.");
					correct = false;
				}
			}
		//choice.close();
		}//result while close
		resolveEvent(effects, r, c, p1, t);
	}//close PlayEvent
	
	public void resolveEvent(String effects[], int r, int c, Player p1, Train t){
		
		if(r>70){
			switch(effects[c-1]){
			case "g1":
				for(int i=0; i<10; i++){
					p1.wellbeingUp();
				}	
				System.out.println("You feel healthier!");
				
				if(p1.currentWellBeing < 0){
					int negWell = (p1.currentWellBeing * -1);
					System.out.println("Your health will decrease by " + negWell + " each turn.");
				}
				else{
					System.out.println("Your health will increase by " + p1.currentWellBeing + " each turn.");
				}
			break;
			case "g2":
				for(int i=0; i<15; i++){
					p1.wellbeingUp();
				}
				System.out.println("You feel a lot healthier!");
				
				if(p1.currentWellBeing < 0){
					int negWell = (p1.currentWellBeing * -1);
					System.out.println("Your health will decrease by " + negWell + " each turn.");
				}
				else{
					System.out.println("Your health will increase by " + p1.currentWellBeing + " each turn.");
				}
			break;
			case "gt":
				t.getRepaired();
				System.out.println("The trains condition improves.");
			break;
			case "null":
			//default:
				System.out.println("No change");
			break;
			}
		}
		else{
			switch(effects[c+2]){
			case "b1":
				for(int i=0; i<15; i++){
					p1.wellbeingDown();
				}
				System.out.println("You don't feel very good.");
				if(p1.currentWellBeing < 0){
					int negWell = (p1.currentWellBeing * -1);
					System.out.println("Your health will decrease by " + negWell + " each turn.");
				}
				else{
					System.out.println("Your health will increase by " + p1.currentWellBeing + " each turn.");
				}
			break;
			case "b2":
				for(int i=0; i<25; i++){
					p1.wellbeingDown();
				}
				System.out.println("You feel very bad!");
				if(p1.currentWellBeing < 0){
					int negWell = (p1.currentWellBeing * -1);
					System.out.println("Your health will decrease by " + negWell + " each turn.");
				}
				else{
					System.out.println("Your health will increase by " + p1.currentWellBeing + " each turn.");
				}
			break;
			case "bt":
				t.takeDamage();
				System.out.println("The train takes damage.");
			break;
			case "null":
			//default:
				System.out.println("No change");
			break;
			}
		}
	}//close resolveEvent
		
	public String fetchEvent() throws IOException{
		Random r = new Random();
		int rand = r.nextInt(eventArray.length);
		String currentEvent = eventArray[rand];
		return currentEvent;
	}
	
}