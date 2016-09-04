package zadaci_02_09_2016;

public class GeometricObject implements Comparable<GeometricObject> {
	// data 
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;

	// konstruktor
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

	//vracamo true ukoliko je filled 
	public boolean isFilled() {
		return filled;
	}

	// setujemo ukoliko je filled
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	// datum
	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;

	}
	//pronalazi maximalnu vrijednost
	public static GeometricObject max(GeometricObject o, GeometricObject o2) {
		if (o.compareTo(o2) > 0)
			return o;
		else
			return o2;
	}
	@Override
	public int compareTo(GeometricObject o) {
		return 0;
	}
}
