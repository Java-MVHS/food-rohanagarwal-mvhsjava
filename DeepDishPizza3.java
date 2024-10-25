public class DeepDishPizza3 extends Pizza3 //DeepDishPizza class created that is a subclass of Pizza
{
	public DeepDishPizza3() //Blank constructor for DeepDishPizza 
	{
		super(); //calls Pizza's blank constructor which calls Food's blank constructor,
		//which sets the String str to ""
	}
	public DeepDishPizza3(String ingredientIn, int piecesIn, int priceIn) //Overloaded constructor takes in ingredientIn
	{
		super(ingredientIn, "deep dish pizza", piecesIn, priceIn); // Calls second overloaded constructor for parent class (Pizza) which takes in an
		//ingredient and a name -- take in the constructor parameter ingredientIn for ingredient and the name "deep dish pizza" for name,
		//as well as piecesIn for number of pieces and priceIn for price
	}
}