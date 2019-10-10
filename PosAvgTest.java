
/**
 * 
 * @author Parker Williams
 * @version 2019-10-09
 * Position Average Tests 
 */
public class PosAvgTest {
	String stID = "OKCE";
	
	public void constructorTest() throws AssertException {
		
		MesoInherit mesoInherit = new MesoInherit(new MesoStation(stID));
		PosAvg posAvg = new PosAvg(stID);
		
		Assert.assertEquals("OKCE", posAvg.index);
	}
	
	
	public void indexOfStationTest() throws AssertException {
		
		MesoInherit mesoInherit = new MesoInherit(new MesoStation(stID));
		PosAvg posAvg = new PosAvg(stID);
		try {
			Assert.assertEquals(79, posAvg.indexOfStation());
		}
		catch(Exception e) {
			e.toString();
		}
	}
	
	
	public void toStringTest() throws AssertException
	{
		MesoInherit mesoInherit = new MesoInherit(new MesoStation(stID));
		PosAvg posAvg = new PosAvg(stID);
		
		Assert.assertEquals("This index is average of OILT and OKEM, NRMN and OKMU, and so on.", posAvg.toString());
	}
}	