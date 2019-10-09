import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class LetterAvg {

	private char avgLetter = ',';
	private ArrayList<String> matchingStations = new ArrayList<String>();
	
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
			station = scnr.nextLine().substring(1,5);
			fileChar = station.charAt(0);
			if (fileChar == avgLetter) {
				++numOfMatchingStations;
				matchingStations.add(station);
			}
		}
		scnr.close();
		return numOfMatchingStations;
	}
	
	@Override
	public String toString() {
		String str = "They are:\n";
		for(int i = 0; i < matchingStations.size(); i++) {
			str = str.concat(matchingStations.get(i) + "\n");
		}
		return str;
	}
}
