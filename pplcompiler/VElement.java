package pplcompiler;
/**
 * This is a base type for the elements of the TripV language.
 * @author Jake Wilkinson
 *
 */
public abstract class VElement{
	//Required classes
	public abstract String toHTML();
	//Inherited variables
	public String alignment = "left top";
	public String color = "black";
}
	