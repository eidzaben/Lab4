public class ZooTest {

	
	public void zooCheck() throws AssertException {
		Animal monkey = new Animal("Brown", "George", 20.2, 23.3);
		Animal snake = new Animal("Green", "Sly", 5.2, 12.5);
		Animal elephant = new Animal("Gray", "Trunk", 521.4, 120.3);
		int capacity = 2;
		Zoo zoo = new Zoo(capacity);
		zoo.addAnimal(monkey);
		zoo.addAnimal(snake);
		zoo.addAnimal(elephant);
		Animal[] animalsCheck = {monkey, snake, elephant};
		String expectedToString = "These animals live in the zoo: \nGeorge, a Brown-colored animal. 20.2 pounds, 23.3 inches\n"
				+ "Sly, a Green-colored animal. 5.2 pounds, 12.5 inches\nTrunk, a Gray-colored animal. 521.4 pounds, 120.3 inches\n";
		
		//Get capacity and expand zoo Check 
		Assert.assertEquals(capacity*2, zoo.getCapacity());
		
		//Get Total Height Check
		Assert.assertEquals(156.1, zoo.getTotalHeight(), .01);
		
		//Get average Weight with no parameters check
		Assert.assertEquals(182, zoo.getAverageWeight());
		
		//Get average weight by color check
		Assert.assertEquals(20, zoo.getAverageWeight("Brown"));
		
		//Get animals check
		Assert.assertEquals(animalsCheck[0], zoo.getAnimals()[0]);
		
		//To string  test
		Assert.assertEquals(expectedToString, zoo.toString());
		
		
		
	}

}
