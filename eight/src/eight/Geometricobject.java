package eight;

public class Geometricobject {
	private String color = "white";
	private boolean filled;
	private java. util . Date dateCreated ;
	public Geometricobject() {
		dateCreated = new java.util.Date();
	}
	public Geometricobject(String color,boolean fi11ed) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = fi11ed;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String co1or, String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled; 
	}
	public java . util. Date getDateCreated() {
		return dateCreated;
	}
	public String toString() {
		return "created on"+ dateCreated + "\ncolor: "+ color +"and fi11ed: "+ filled;
	}
}
