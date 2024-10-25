// Rohan Agarwal
// 10/23/24
// Pizza.java

public class Pizza extends Food //Create subclass of Food called Pizza -- automatically calls the base constructor, so we now have a
//String str = ""
{
	public Pizza() //Default constructor of Pizza -- this will initialize the string to a blank string.
	{
		super(); //Call base constructor for parent class -- this will initialize str to blank string
	}
	public Pizza(String ingredientIn) //Overloaded Pizza constructor -- takes in ingedient
	{
		super("baked", ingredientIn, "Pizza"); //Call overloaded constructor for parent class; set prepMethod to "bake", name to "Pizza",
		// and ingredient to the string the constructor takes in.
	}
	
	public Pizza(String ingredientIn, String nameIn) //Overloaded Pizza constructor -- takes in ingedient and name (this is a second
	//parameter for DeepDishPizza)
	{
		super("baked", ingredientIn, nameIn); //Call overloaded constructor for parent class; set prepMethod to "bake", name to nameIn,
		// and ingredient to ingredientIn
	}
	
}
