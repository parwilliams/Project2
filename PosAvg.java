import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class PosAvg {
	
	String index = null;
	String stationID = null;
	
	public PosAvg(String id){
		stationID = id;
		
		
	}
	
	public String indexOfStation() throws IOException{
		//TODO: Implement
		FileInputStream fileByteStream = new FileInputStream("Mesonet.txt");
		Scanner scnr = new Scanner(fileByteStream);
		boolean exitWhile = false;
		for (int i = 0; i < 3; i++) {
			scnr.nextLine();
		}
		
		do {
			String lineOfData = scnr.nextLine();
			String indexCheck = lineOfData.substring(1, 4);
			
			if(indexCheck.contentEquals(stationID)) {
				index = stationID;
				exitWhile = true;
			}
		}
		while(exitWhile == false);
		fileByteStream.close();
		return index;
	}
	
	@Override
	public String toString() {
		String str = null;
		int indexInt = Integer.parseInt(index);
		
		
		return str;
	}
	
}
