package zadaci_26_08_2016;

public class GeometricObject {
	
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;

	//konstruktori
	public GeometricObject() {
		dateCreated = new java.util.Date();
	}

	public GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// vraca boolijan vrijednost
	public boolean isFilled() {
		return filled;
	}

	// setujemo ako je filed
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;

	}
}