public class EquipmentTest {
	
	public void constructorTest() throws AssertException {
			Equipment eq = new Equipment("Batarang/5,5.0,5.0,A boomerang for bats");
			
			Assert.assertEquals("Batarang",  eq.getName());
			Assert.assertEquals(5, eq.getCount());
			Assert.assertEquals(5.0, eq.getTotalWeight(), .01);
			Assert.assertEquals(5.0, eq.getTotalPrice(), .01);
			Assert.assertEquals("A boomerang for bats", eq.getDescription());
			
			
}
	public void gettersTest() throws AssertException {
		Equipment eq = new Equipment("Bomb/1,50.6,70.6,Something you sometimes just can't get rid of");
		String expectedName = "Bomb";
		int expectedCount = 1;
		double expectedWeight = 50.6;
		double expectedPrice = 70.6;
		String expectedDescription = "Something you sometimes just can't get rid of";
		
		
		Assert.assertEquals(expectedName, eq.getName());
		Assert.assertEquals(expectedCount, eq.getCount());
		Assert.assertEquals(expectedWeight, eq.getTotalWeight(), .01);
		Assert.assertEquals(expectedPrice, eq.getTotalPrice(), .01);
		Assert.assertEquals(expectedDescription, eq.getDescription());
		
	}
		
	


}