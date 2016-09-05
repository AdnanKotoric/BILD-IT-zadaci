package zadaci_03_09_2016;

class GeometricObject {
	// data fieldovi
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;

	// konstruktori
	public GeometricObject() {
		dateCreated = new java.util.Date();
	}

	public GeometricObject(double radius) {
	}

	public GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}

	// geteri i seteri
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// vraca boolean vrijednost
	public boolean isFilled() {
		return filled;
	}

	
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	// kreira datum kada je objekat napravljen
	public java.util.Date getDateCreated() {
		return dateCreated;
	}
	//metoda za povrsinu
	double getArea() {
		return 0;
	}
	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;

	}


}