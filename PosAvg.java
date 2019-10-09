import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class PosAvg {
	
	int index = 0;
	String stationID = null;
	
	public PosAvg(String id){
		stationID = id;
		
		
	}
	
	public int indexOfStation() throws IOException{
		//TODO: Implement
		FileInputStream fileByteStream = new FileInputStream("Mesonet.txt");
		Scanner scnr = new Scanner(fileByteStream);
		boolean exitWhile = false;
		for (int i = 0; i < 3; i++) {
			scnr.nextLine();
		}
		
		do {
			++index;
			String lineOfData = scnr.nextLine();
			String indexCheck = lineOfData.substring(1, 5);
			
			if(indexCheck.contentEquals(stationID)) {
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
		
		
		
		return str;
	}
	
}
