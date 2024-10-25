/* Rohan Agarwal
 * 10/23/24
  DeepDishPizza.java
  
*/
public class DeepDishPizza extends Pizza //DeepDishPizza class created that is a subclass of Pizza
{
	public DeepDishPizza() //Blank constructor for DeepDishPizza 
	{
		super(); //calls Pizza's blank constructor which calls Food's blank constructor,
		//which sets the String str to ""
	}
	public DeepDishPizza(String ingredientIn) //Overloaded constructor takes in ingredientIn
	{
		super(ingredientIn, "deep dish pizza"); // Calls second overloaded constructor for parent class (Pizza) which takes in an
		//ingredient and a name -- take in the constructor parameter ingredientIn for ingredient and the name "deep dish pizza" for name
	}
}
