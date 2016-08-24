package zadaci_22_08_2016;

public class RegularPolygon {
	// data fieldovi za klasu
	private int numberOfSides;
	private double sideLength;
	private double centerX;
	private double centerY;

	// kontruktor koji ne prima argumente u kojem postavljamo data fieldove na
	// efault vrijednosti
	public RegularPolygon() {
		numberOfSides = 3;
		sideLength = 1;
		centerX = 0;
		centerY = 0;

	}

	// konstruktor koji prima argumente broj strana i duzinu strane
	public RegularPolygon(int numberOfSides, double sideLength) {
		this();
		this.sideLength = sideLength;
		this.numberOfSides = numberOfSides;

	}

	public RegularPolygon(int numberOfSides, double sideLength, double x,
			double y) {
		this(numberOfSides, sideLength);
		centerX = x;
		centerY = y;
	}

	// geteri i seteri
	public int getNumberOfSides() {
		return numberOfSides;
	}

	public void setNumberOfSides(int numberOfSides) {
		this.numberOfSides = numberOfSides;
	}

	public double getSideLength() {
		return sideLength;
	}

	public void setSideLength(double sideLength) {
		this.sideLength = sideLength;
	}

	public double getCenterY() {
		return centerY;
	}

	public void setCenterY(double centerY) {
		this.centerY = centerY;
	}

	public double getCenterX() {
		return centerX;
	}

	public void setCenterX(double centerX) {
		this.centerX = centerX;
	}

	// metoda za racunanje perimetra
	public double getPerimeter() {

		return numberOfSides * sideLength;
	}

	// metoda za ranucanje povrsine
	public double getArea() {

		return (numberOfSides * sideLength * sideLength)
				/ (4.0 * Math.tan(Math.PI / numberOfSides));
	}

}
