/* Rohan Agarwal
 * 10/23/24
  Food.java
  This program creates a class called Food, which contains a string set to a message to be read at a bake sale. A subclass is created called
  Pizza, and a subclass of Pizza is created called DeepDishPizza. These classes contain a method called printToSale which prints out a message
  outlining the ingredient and name of each Food.
  
*/


public class Food //Creates food class
{
	protected String str; //Declares field variable str that will be printed when printForSale is called
	
	public Food () //No-arg constructor for Food
	{
		str = new String(""); //Initializes str to a blank string
	}
	
	public Food (String prepMethod, String ingredient, String name) //Overloaded constructor for food -- takes in
	//prepMethod, ingredient, and name
	{	
		str = "At the sale: " + name + " " + prepMethod + " with " + ingredient; //Sets str to "At the sale: name prepMethod with ingredient"
	}

	public void printForSale() //printForSale function -- acts as a printer for str
	{
		System.out.println(str); //Use println to print str
	}
}
