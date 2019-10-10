import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
//toString gives correct Output but ZyBooks will not Accept
public class PosAvg {
	
	int index = 0;
	String stationID = null;
	/*	String indexPlusOne;
		String indexPlusTwo;
		String indexMinusOne;
		String indexMinusTwo;
	*/
	
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
	
	private String[] getAvgStationNames(){
		String[] avgStationNames = new String[4]; //names around index
		try{
			FileInputStream fileByteStream = new FileInputStream("Mesonet.txt");
			Scanner scnr = new Scanner(fileByteStream);
			for (int i = 0; i < index; i++) {
				scnr.nextLine();
			}
			
			
			/*indexMinusTwo = scnr.nextLine().substring(1,5);
			indexMinusOne = scnr.nextLine().substring(1,5);
			scnr.nextLine();//Line of index
			indexPlusOne = scnr.nextLine().substring(1,5);
			indexPlusTwo = scnr.nextLine().substring(1,5);
			*/
			
			avgStationNames[0] = scnr.nextLine().substring(1,5);// index - 2
			avgStationNames[1] = scnr.nextLine().substring(1,5);// index - 1
			scnr.nextLine();//Line of index
			avgStationNames[2] = scnr.nextLine().substring(1,5);// index + 1
			avgStationNames[3] = scnr.nextLine().substring(1,5);// index + 2
			return avgStationNames;
		}
		catch(Exception e) {
			e.toString();
		}	
		return avgStationNames;
	}
	
	
	
	@Override
	public String toString(){
		String[] avgStationNamesV2 = getAvgStationNames();
		/*
		 * String str = String.format("This index is average of %s and %s, %s and %s, and so on.", indexMinusOneV2, indexPlusOneV2, indexMinusTwoV2, indexPlusTwoV2);
		 */
		String str = String.format("This index is average of %s and %s, %s and %s, and so on.", avgStationNamesV2[1], avgStationNamesV2[2], avgStationNamesV2[0], avgStationNamesV2[3]);
		return str;
	}
	
}
