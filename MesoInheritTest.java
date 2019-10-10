
/**
 * 
 * @author Parker Williams
 * @version 2019-10-09
 * MesoInherit Tests
 */
public class MesoInheritTest {
	
	public void calAverageTest() throws AssertException {
		String stID = "OKCE";
		MesoInherit mesoInherit = new MesoInherit(new MesoStation(stID));
	
		//The name should be "noname", the height and weight 0, and the color "unknown"
		Assert.assertEquals(73, mesoInherit.calAverage()[0]);
		Assert.assertEquals(72, mesoInherit.calAverage()[1]);
		Assert.assertEquals(73, mesoInherit.calAverage()[2]);
	}

	public void letterAverage() throws AssertException {
		String stID = "OKCE";
		MesoInherit mesoInherit = new MesoInherit(new MesoStation(stID));
		
		Assert.assertEquals('I', mesoInherit.letterAverage());
	}
}

	