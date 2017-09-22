import junit.framework.TestCase;

/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 */
public class GroceryItemTestListLinked extends TestCase {
  
  /**
   * A test method.
   * (Replace "X" with a name describing the test.  You may write as
   * many "testSomething" methods in this class as you wish, and each
   * one will be called when running JUnit over this class.)
   */
  public void testAdd(){
    GroceryItem carrot = new GroceryItem("Carrot",3);
    GroceryItem egg = new GroceryItem("Egg",12);
    GroceryItem fish = new GroceryItem("Fish",2);
    GroceryItem meat = new GroceryItem("Meat",1);
    GroceryItem apple = new GroceryItem("Apple",5);
    GroceryItem banana = new GroceryItem("Banana",20);
    
    GroceryListLinked food = new GroceryListLinked();
    
    food.add(carrot);
    food.add(egg);
    food.add(fish);
    food.add(meat);
    food.add(apple);
    food.add(banana);
    
  }
  public void testMarkAsBought(){
    GroceryItem carrot = new GroceryItem("Carrot",3);
    GroceryItem egg = new GroceryItem("Egg",12);
    GroceryItem fish = new GroceryItem("Fish",2);
    GroceryItem meat = new GroceryItem("Meat",1);
    GroceryItem apple = new GroceryItem("Apple",5);
    GroceryItem banana = new GroceryItem("Banana",20);
    
    GroceryListLinked food = new GroceryListLinked();
    
    food.add(carrot);
    food.add(egg);
    food.add(fish);
    food.add(meat);
    food.add(apple);
    food.add(banana);
    
    assertEquals(true,food.markAsBought("Egg"));
    assertEquals(false,food.markAsBought("Egg!!!!!!"));
  
  }
  
  public void testDisplay(){
    GroceryItem carrot = new GroceryItem("Carrot",3);
    GroceryItem egg = new GroceryItem("Egg",12);
    GroceryItem fish = new GroceryItem("Fish",2);
    GroceryItem meat = new GroceryItem("Meat",1);
    GroceryItem apple = new GroceryItem("Apple",5);
    GroceryItem banana = new GroceryItem("Banana",20);
    
    GroceryListLinked food = new GroceryListLinked();
    
    food.add(carrot);
    food.add(egg);
    food.add(fish);
    food.add(meat);
    food.add(apple);
    food.add(banana);
    
    food.display();
  }
  
  public void testRemove(){
    GroceryItem carrot = new GroceryItem("Carrot",3);
    GroceryItem egg = new GroceryItem("Egg",12);
    GroceryItem fish = new GroceryItem("Fish",2);
    GroceryItem meat = new GroceryItem("Meat",1);
    GroceryItem apple = new GroceryItem("Apple",5);
    GroceryItem banana = new GroceryItem("Banana",20);
    
    GroceryListLinked food = new GroceryListLinked();
    
    food.add(carrot);
    food.add(egg);
    food.add(fish);
    food.add(meat);
    food.add(apple);
    food.add(banana);
    
    assertEquals(true,food.remove("Carrot"));
    assertEquals(false,food.remove("Egg!"));
    assertEquals(false,food.remove("CaCarrot"));
    assertEquals(false,food.remove("Bababababanana"));
    
  }
  
}
