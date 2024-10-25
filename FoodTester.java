/* Rohan Agarwal
 * 10/23/24
  FoodTester.java
  
*/
public class FoodTester
{
	public static void main(String[] args)
	{
		System.out.println("\n\n\n");
		Food food1 = new Food ("baked", "banana", "muffins"); //Creates Food3 object with the given parameters for a banana muffin
		food1.printForSale(); //Calls printForSale method to print string
		Food food2 = new Food ("fried", "yam", "fritters"); //Creates Food3 object with the given parameters for fritters
		food2.printForSale(); //Calls printForSale method to print string
		Pizza pizza = new Pizza ("pepperoni"); //Creates pizza object with ingredient pepperoni
		pizza.printForSale(); //Calls printForSale method to print string
		System.out.print("\n\n\n");
	}
}
