package pplcompiler;
/**
 * This is a base type for the elements of the TripV language.
 * @author Jake Wilkinson
 *
 */
public abstract class VElement{
	public abstract String toHTML();
	public String alignment = "top left";
	public String color = "black";
}
