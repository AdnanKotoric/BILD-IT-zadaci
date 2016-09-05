package zadaci_03_09_2016;

public class Octagon extends GeometricObject implements Comparable<Octagon>,
		Cloneable {

	private double side = 5;

	public Octagon() {
	}

	public Octagon(double side) {
		super();
		this.side = side;

	}

	// geteri i seteri
	public void setSide(double side) {
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	// metoda za izracunavanje povrsine
	public double getArea() {
		return (2 + (4 / (Math.sqrt(2))) * side * side);
	}

	// metoda za izracunavanja perimetra
	public double getPerimeter() {
		return side * 8;
	}

	@Override
	public String toString() {
		return "Octagon [ sides=" + side + ", Area: " + getArea()
				+ ", Perimeter: " + getPerimeter() + "]";
	}

	@Override
	// overajdamo metodu za kloniranje
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	// overajdamo metodu za uporedjivanje
	public int compareTo(Octagon octagon1) {
		// ukoliko su strane prvog objekta duze
		if (side > octagon1.getSide()) {
			System.out.println("First object is bigger");
			return 1;
			// ukoliko su jednake strane
		} else if (side == octagon1.getSide()) {
			System.out.println("Objects are equal");
			return 0;
		} else {
			System.out.println("Second object is bigger");
			return -1;
		}

	}

}