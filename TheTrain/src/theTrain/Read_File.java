package theTrain;
import java.io.*;

public class Read_File {

	private static String path;
	
	public Read_File (String EventTxt){
		path = EventTxt;
	}
	
	public Read_File() {}

	public String[] collectEvents() throws IOException{
		FileReader fr = new FileReader(path);
		BufferedReader textReader = new BufferedReader(fr);
		
		int noOfEvents = enumEvents();
		String[] eventsText = new String[noOfEvents];
		
		for(int i = 0; i < noOfEvents; i++){
			eventsText[i] = textReader.readLine();	
		}
		
		textReader.close();
		return eventsText;
	}
	
	public static int enumEvents() throws IOException{
		
		FileReader ftr = new FileReader(path);
		BufferedReader br = new BufferedReader(ftr);
		
		String aLine;
		int numOfLines = 0;
		
		while((aLine = br.readLine()) != null){
			numOfLines++;
		}
		
		br.close();
		
		return numOfLines - 1;
	}
	
}
