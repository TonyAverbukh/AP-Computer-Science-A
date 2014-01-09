//Pat St.Clair
//August 7, 2011
//A class to represent a 6 sided die

public class Die   //class names always begin with a capital letter
{
	//declare instance/state variables
	// in the AP world ALL instance variables are private
	private int faceValue;
	
	//construct the object by assigning values to its instance variables
	public Die()
	{
		faceValue = (int)(Math.random() * 6) + 1;
	}
	
	//provides the user the ability to see what value the private variable holds
	//accessor or getter method
	public int getFaceValue()
	{
		return faceValue;
	}
	
	//provides the user the ability to change the value stored in the private variable
	public void roll()
	{
		faceValue = (int)(Math.random() * 6) + 1;
	}
	
	public String toString()
	{
		return "faceValue: " + faceValue;
	}
	
	
}