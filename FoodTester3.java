/* Rohan Agarwal
 * 10/23/24
  Food.java
  
*/
public class FoodTester3 //FoodTester class
{
	public static void main(String[] args)
	{
		System.out.println("\n\n\n"); //3 blank lines
		Food3 food1 = new Food3 ("baked", "banana", "muffin", 12, 50); //Creates Food3 object with the given parameters for a banana muffin
		food1.printForSale(); //Calls printForSale method to print string
		Food3 food2 = new Food3 ("fried", "yam", "fritter", 3, 100); //Creates Food3 object with the given parameters for fritters
		food2.printForSale(); //Calls printForSale method to print string
		Pizza3 pizza = new Pizza3 ("pepperoni", 8, 250); //Creates pizza object with ingredient pepperoni and price as given in table
		pizza.printForSale(); //Calls printForSale method to print string
		System.out.print("\n\n\n"); //3 blank lines
	}
}
