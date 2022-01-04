package eight;

public class PolymorphismDemo {
	public static void main(String[] args) {
		displayobject (new Circle(1, "red", false)) ;
		displayobject (new Rectangle(1, 1,"black", true));
	}
	public static void displayobject (Geometricobject object) {
		System . out . println("Created on"+ object . getDateCreated() +
				 ".Color is"+ object. getColor());
	}
}
