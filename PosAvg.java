import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class PosAvg {
	
	int index = 0;
	String stationID = null;
	String indexPlusOne;
	String indexPlusTwo;
	String indexMinusOne;
	String indexMinusTwo;
	
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
	
	private void fileSearch(){
		try{
			FileInputStream fileByteStream = new FileInputStream("Mesonet.txt");
			Scanner scnr = new Scanner(fileByteStream);
			for (int i = 0; i < index; i++) {
				scnr.nextLine();
			}
			
			indexMinusTwo = scnr.nextLine().substring(1,5);
			indexMinusOne = scnr.nextLine().substring(1,5);
			scnr.nextLine();//Line of index
			indexPlusOne = scnr.nextLine().substring(1,5);
			indexPlusTwo = scnr.nextLine().substring(1,5);
		}
		catch(Exception e) {
			e.toString();
		}	
	}
	
	
	
	@Override
	public String toString(){
		this.fileSearch();
		String str = String.format("This index is average of %s and %s, %s and %s, and so on.", indexMinusOne, indexPlusOne, indexMinusTwo, indexPlusTwo);
		return str;
	}
	
}
