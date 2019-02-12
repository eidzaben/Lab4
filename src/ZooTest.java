public class ZooTest {
/*
	public void zooConstructorTest() throws AssertException {
		Zoo zoo = new Zoo(20);
		int expCapacity = 20;
		Animal[] expAnimals = new Animal[20];

		Assert.assertEquals(expCapacity, zoo.getCapacity());
		Assert.assertEquals(expAnimals[0], zoo.getAnimals()[0]);

	}

	public void addAnimalTest() throws AssertException {
		Zoo zoo = new Zoo(20);
		Animal monkey = new Animal();
		int expectedNumAnimals = 20;
		zoo.addAnimal(monkey);
		
		Assert.assertEquals(expectedNumAnimals, zoo.getAnimals().length);
		Assert.assertEquals(monkey, zoo.getAnimals()[0]);
		Assert.assertEquals(20, zoo.getCapacity());

	}

	public void gettersTest() throws AssertException {
		Zoo zoo = new Zoo(20);
		Animal monkey = new Animal("Brown", "George", 20, 3);
		zoo.addAnimal(monkey);
		Animal snake = new Animal("Green", "Sly", 10, 2);
		zoo.addAnimal(snake);
		
		int expectedCapacity = 20;
		double expectedTotalHeight = 5;
		double expectedAverageWeight = 15;
		double expectedAverageWeightGreen = 10;
		Animal[] expectedAnimals = {monkey, snake};
		
		
		Assert.assertEquals(expectedCapacity, zoo.getCapacity());
		Assert.assertEquals(expectedTotalHeight, zoo.getTotalHeight(), .01);
		Assert.assertEquals(expectedAverageWeight, zoo.getAverageWeight(), 0.01);
		Assert.assertEquals(expectedAverageWeightGreen, zoo.getAverageWeight("Green"), 0.01);
		Assert.assertEquals(expectedAnimals[0], zoo.getAnimals()[0]);


	}

	public void toStringTest() throws AssertException {
		Zoo zoo = new Zoo(20);
		Animal monkey = new Animal("Brown", "George", 20, 3);
		zoo.addAnimal(monkey);
		Animal snake = new Animal("Green", "Sly", 10, 2);
		zoo.addAnimal(snake);
		String expected = "These animals live in the zoo: \nGeorge, a Brown-colored animal. 20.0 pounds, 3.0 inches\n"
				+ "Sly, a Green-colored animal. 10.0 pounds, 2.0 inches\n";
		
		Assert.assertEquals(expected, zoo.toString());
		

	}
	*/
	
	
	public void zooCheck() throws AssertException {
		Animal monkey = new Animal("Brown", "George", 20.2, 23.3);
		Animal snake = new Animal("Green", "Sly", 5.2, 12.5);
		Animal elephant = new Animal("Gray", "Trunk", 521.4, 120.3);
		int capacity = 2;
		Zoo zoo = new Zoo(capacity);
		zoo.addAnimal(monkey);
		zoo.addAnimal(snake);
		zoo.addAnimal(elephant);
		
		Assert.assertEquals(capacity*2, zoo.getCapacity());
		
		Assert.assertEquals(156.1, zoo.getTotalHeight(), .01);
		
		Assert.assertEquals(182, zoo.getAverageWeight());
		
		Assert.assertEquals(20, zoo.getAverageWeight("Brown"));
		
	}

}