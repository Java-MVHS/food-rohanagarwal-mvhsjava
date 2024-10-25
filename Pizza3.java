// Rohan Agarwal
// 10/23/24
// Pizza.java

public class Pizza3 extends Food3 //Create subclass of Food called Pizza -- automatically calls the base constructor, so we now have a
//String str = ""
{
	public Pizza3() //Default constructor of Pizza -- this will initialize the string to a blank string.
	{
		super(); //Call base constructor for parent class -- this will initialize str to blank string
	}
	public Pizza3(String ingredientIn, int piecesIn, int priceIn) //Overloaded Pizza constructor -- takes in ingedient, number of pieces,
	//and price per piece
	{
		super("baked", ingredientIn, "pizza", piecesIn, priceIn); //Call overloaded constructor for parent class; set prepMethod to "bake", name to "Pizza",
		//ingredient to ingredientIn, number of pieces to piecesIn, and price per piece to priceIn.
	}
	
	public Pizza3(String ingredientIn, String nameIn, int piecesIn, int priceIn) //Overloaded Pizza constructor that takes in nameIn too
	{
		super("baked", ingredientIn, nameIn, piecesIn, priceIn); //Call overloaded constructor for parent class; set prepMethod to "bake", name to nameIn,
		//ingredient to ingredientIn, pieces to piecesIn, and price per piece to priceIn
	}
	
}
