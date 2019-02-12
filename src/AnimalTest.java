/**
 * Testing class for Product object
 *
 * @author Stephen Thung, references previous code from Dr.Fagg, Taner Davis
 * @version 2018-08-25
 */
public class AnimalTest
{

    /**
     * Test the empty Animal constructor and the getters
     */
	//git check
    public void emptyConstructorTest() throws AssertException
    {
        // Use the default constructor
        Animal animal = new Animal();

        // The name should be "noname", color "unknown", height and weight 0.
        Assert.assertEquals("unknown", animal.getColor());
        Assert.assertEquals("noname", animal.getName());
        Assert.assertEquals(0, animal.getHeight(), 0.01);
        Assert.assertEquals(0, animal.getWeight(), 0.01);
    }

    // TODO: test full constructor, getters, and toString
    
    public void fullConstructorTest() throws AssertException {
    	Animal animal = new Animal("blue", "swan", 3.3, 5.4);
    	
    	Assert.assertEquals("blue", animal.getColor());
    	Assert.assertEquals("swan", animal.getName());
        Assert.assertEquals(5.4, animal.getHeight(), 0.01);
        Assert.assertEquals(3.3, animal.getWeight(), 0.01);
    	
    }
    
  /*  public void gettersTest() {
    	Animal animal = new Animal("blue", "swan", 5.4, 3.3);
    	String expectedColor = "blue";
    	String expectedName = "swan";
    	double expectedHeight = 5.4;
    	double expectedWeight = 3.3;
    	
    	try {
		Assert.assertEquals(expectedColor, animal.getColor());
		Assert.assertEquals(expectedName, animal.getName());
    	Assert.assertEquals(expectedHeight, animal.getHeight(), 0.01);
    	Assert.assertEquals(expectedWeight, animal.getWeight(), 0.01);
		} catch (AssertException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
    	
    	
    	
    }
    */
    
    
    public void toStringTest() throws AssertException {
    	Animal animal = new Animal("blue", "swan", 5.4, 3.3);
    	String expectedToString = "swan, a blue-colored animal. 5.4 pounds, 3.3 inches\n";
    	Assert.assertEquals(expectedToString, animal.toString());
    			//"(name), a (color)-colored animal. (weight) pounds, (height) inches.\n"
    }
}

