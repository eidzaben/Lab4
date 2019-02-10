public class EquipmentTest {
	
	public void constructorTest() throws AssertException {
			Equipment eq = new Equipment("Batarang/5,5.0,5.0,A boomerang for bats");
			
			Assert.assertEquals("Batarang",  eq.getName());
			Assert.assertEquals(5, eq.getCount());
			Assert.assertEquals(5.0, eq.getTotalWeight(), .01);
			Assert.assertEquals(5.0, eq.getTotalPrice(), .01);
			Assert.assertEquals("A boomerang for bats", eq.getDescription());
			
			
}
	
	
	


}