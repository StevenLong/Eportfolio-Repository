package theTrain;
import java.util.*;

public class Randomise {

	public int randomPercent(){
		Random r = new Random();
		int randPC = r.nextInt((100 - 0) + 1);
		return randPC;
	}
}