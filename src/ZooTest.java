	public class ZooTest {
		
		public void zooConstructorTest() throws AssertException {
				Zoo zoo = new Zoo(20);
			//	int expectedAnimals = 20;
				int expCapacity = 20;
				Animal[] expAnimals = new Animal[20];
				
				Assert.assertEquals(expCapacity, zoo.getCapacity());
				Assert.assertEquals(expAnimals, zoo.getAnimals());
			//	Assert.assertEquals(
				
			}
	
	
}