import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LetterAvg {

	private char avgLetter = ',';

	public LetterAvg(char letter) {
		avgLetter = letter;
	}

	public int numberOfStationWithLetterAvg() throws FileNotFoundException {
		char fileChar;
		int matchingStations = 0;// Number of Stations starting with the average letter
		FileInputStream fileByteStream = new FileInputStream("Mesonet.txt");
		Scanner scnr = new Scanner(fileByteStream);
		for (int i = 0; i < 3; i++) { // Dismisses first 3 lines
			scnr.nextLine();
		}
		while (scnr.hasNextLine()) {
			fileChar = scnr.nextLine().charAt(1);
			if (fileChar == avgLetter) {
				++matchingStations;
			}
		}
		scnr.close();
		return matchingStations;
	}

}
