/* Rohan Agarwal
 * 10/23/24
  Food.java
  
*/


public class Food3 //Creates food class
{
	protected String str; //Declares field variable str that will be printed when printForSale is called
	
	public Food3 () //No-arg constructor for Food
	{
		str = new String(""); //Initializes str to a blank string
	}
	
	public Food3 (String prepMethod, String ingredient, String name, int numPieces, int centsPiece) //Overloaded constructor for food -- takes in
	//prepMethod, ingredient, name, number of pieces, and price in cents per piece.
	{	
		str = String.format("At the sale %ss baked with %s will be sold for %d cents each. With %d %s(s), $%.2f can be made.", name, ingredient, centsPiece, numPieces, name, (float)((numPieces*centsPiece)/100));
		//Sets str to the required string, using String.format to add the name, ingredient, price, and  number of pieces 
		//wherever needed as taken in from the constructor's arguments. Sets the total price to (float)((numPieces*centsPiece)/100), the necessary calculation
	}

	public void printForSale() //printForSale function -- acts as a printer for str
	{
		System.out.println(str); //Use println to print str
	}
}
