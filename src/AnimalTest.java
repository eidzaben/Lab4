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
    
    public void fullConstructorTest() {
    	Animal animal = new Animal("blue", "swan", 5.4, 3.3);
    	
    	Assert.assertEquals("blue", animal.getColor());
    	Assert.assertEquals("swan", animal.getName());
        Assert.assertEquals(5.4, animal.getHeight(), 0.01);
        Assert.assertEquals(3.3, animal.getWeight(), 0.01);
    	
    }
    
    public void gettersTest() {
    	Animal animal = new Animal("blue", "swan", 5.4, 3.3);
    	String expectedColor = "blue";
    	String expectedName = "swan";
    	String expectedHeight
    	
    	
    }
    
    
    public void toStringTest() {
    	Animal animal = new Animal("blue", "swan", 5.4, 3.3);
    	
    }
}

