package theTrain;

public class Train {
	
	private int condition = 100;
	private boolean broken = false;
	
	int currentCondition;
	boolean currentlyBroken;
	
	int repairKit = 5;
	
	public Train(){
		currentCondition = condition;
		currentlyBroken = broken;
	}
	
	public void showCondition(){
		System.out.println("The trains condition is " + currentCondition);
	}
	
	public int takeDamage(){
		currentCondition-=20;
		return currentCondition;
	}
	
	public int getRepaired(){
		currentCondition += 10;
		return currentCondition;
	}
	
	public void useRepairKit(){
		repairKit--;
		getRepaired();
	}
	
	public boolean checkBroken(){
		if(currentCondition>0){
			currentlyBroken = false;
			return currentlyBroken;
		}
		else{
			currentlyBroken = true;
			System.out.println(showBrokenGameover());
			System.exit(0);
			return currentlyBroken;
		}
	}
	
	public String showBrokenGameover(){
		String s = "The train is broken.\nYou are doomed.\nGameover.";
		return s;
	}
	
	/*public static void main(String[] args){
		
		Train t = new Train();
		
		t.showCondition();
		t.checkBroken();
		for(int i = 0; i < 21; i++)
		t.takeDamage();
		t.showCondition();
		t.checkBroken();
	}*/
}

