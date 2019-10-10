import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
//toString gives correct Output but ZyBooks will not Accept
public class LetterAvg {
	private int total;
	private char avgLetter = ',';
	//private ArrayList<String> matchingStations = new ArrayList<String>();
	private int arrayLength = 1;
	private String[] matchingStations = new String[arrayLength];
	
	public LetterAvg(char letter) {
		avgLetter = letter;
	}

	public int numberOfStationWithLetterAvg() throws FileNotFoundException {
		String station;
		char fileChar;
		int numOfMatchingStations = 0;// Number of Stations starting with the average letter
		FileInputStream fileByteStream = new FileInputStream("Mesonet.txt");
		Scanner scnr = new Scanner(fileByteStream);
		for (int i = 0; i < 3; i++) { // Dismisses first 3 lines
			scnr.nextLine();
		}
		while (scnr.hasNextLine()) {
			station = scnr.nextLine().substring(1, 5);
			fileChar = station.charAt(0);
			if (fileChar == avgLetter) {
				if(numOfMatchingStations == arrayLength) {
					expandArray();
				}
				matchingStations[numOfMatchingStations] = station;
				++numOfMatchingStations;
				//matchingStations.add(station);
			}
		}
		scnr.close();
		return numOfMatchingStations;
	}

	private void expandArray() {
		String[] tempArray = new String[arrayLength + 1];
		for(int i = 0; i < arrayLength; i++) {
			tempArray[i] = matchingStations[i];
		}
		matchingStations = tempArray;
		arrayLength++;
	}
	
	public String[] numberOfStationWithLetterAvg2() throws FileNotFoundException {
		String station;
		char fileChar;
		int numOfMatchingStations = 0;// Number of Stations starting with the average letter
		FileInputStream fileByteStream = new FileInputStream("Mesonet.txt");
		Scanner scnr = new Scanner(fileByteStream);
		for (int i = 0; i < 3; i++) { // Dismisses first 3 lines
			scnr.nextLine();
		}
		while (scnr.hasNextLine()) {
			station = scnr.nextLine().substring(1, 5);
			fileChar = station.charAt(0);
			if (fileChar == avgLetter) {
				if(numOfMatchingStations == arrayLength) {
					expandArray();
				}
				matchingStations[numOfMatchingStations] = station;
				++numOfMatchingStations;
				//matchingStations.add(station);
			}
		}
		scnr.close();
		return matchingStations;
	}
	
	@Override
	public String toString(){
		String str = "\nThey are:";
		try {
		int countingIndex;
		String[] matchingStationsV2 = numberOfStationWithLetterAvg2();
		for(int i = 0; i < arrayLength; i++) {
			matchingStationsV2[i] = matchingStations[i];
		}
		
		/*for (countingIndex = 0; countingIndex < total - 1; countingIndex++) {
			str = str.concat(matchingStations.get(countingIndex) + "\n");
		}
		str = str.concat(matchingStations.get(countingIndex));
		*/
		
		/*for (countingIndex = 0; countingIndex < arrayLength - 1; countingIndex++) {
			str = str.concat(matchingStations[countingIndex] + "\n");
		}
		str = str.concat(matchingStations[countingIndex]);
		*/
		for (countingIndex = 0; countingIndex < arrayLength; countingIndex++) {
			str = str.concat("\n" + matchingStationsV2[countingIndex]);
		}
		return str;
		
		}
		catch(Exception e) {
			
		}
		return str;
	}
}
