
public class MesoInherit extends MesoAbstract {

	private String stationID = null;
	private int average = -1;

	public MesoInherit(MesoStation station) {
		// TODO Auto-generated constructor stub
		stationID = station.getStID();
	}

	@Override
	int[] calAverage() {
		// TODO Auto-generated method stub
		int[] asciiCharacters = new int[4];
		int[] asciiAverage = new int[3];
		int ceiling = -1;
		int floor = 1000;
		double sumOfCharacters = 0;
		double trueAverage;

		for (int i = 0; i < 4; i++) { // Loop to put character values in array
			asciiCharacters[i] = stationID.charAt(i);
		}

		for (int i = 0; i < 4; i++) { // Add All characters
			sumOfCharacters += asciiCharacters[i];
		}

		trueAverage = sumOfCharacters / 4;

		ceiling = (int) Math.ceil(trueAverage);
		floor = (int) Math.floor(trueAverage);

		if ((sumOfCharacters % 4) >= 2) {
			average = ceiling;
		} else
			average = floor;

		asciiAverage[0] = ceiling;
		asciiAverage[1] = floor;
		asciiAverage[2] = average;

		return asciiAverage;
	}

	@Override
	char letterAverage() {
		// TODO Auto-generated method stub
		return (char) average;
	}

}
