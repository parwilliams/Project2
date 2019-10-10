
/**
 * 
 * @author Parker Williams
 * @version 2019-10-09
 * Letter Average Tests
 */
public class LetterAvgTest {
	String stID = "OKCE";
	MesoInherit mesoInherit = new MesoInherit(new MesoStation(stID));
	LetterAvg letterAvg = new LetterAvg(mesoInherit.letterAverage()); 
	
	public void numberOfStationWithLetterAvgTest() throws AssertException {
		try{
			Assert.assertEquals(2, letterAvg.numberOfStationWithLetterAvg());	
		}
		catch(Exception e) {
			e.toString();
		}
	}

	public void toStringTest() throws AssertException
	{
		Assert.assertEquals("\nThey are:\n" + "IDAB\n" + "INOL", letterAvg.toString());
	}

}