package zadaci_03_09_2016;

public class RewriteCircle {

	public static void main(String[] args) {
		// kreiramo novu objekat
		Circle c = new Circle(4);
		Circle cc = new Circle(8);
		// u zavisnosti da li su jednaki ispisujemo true ili false
		System.out.println(c.equals(cc));
	}

}

class Circle extends GeometricObject implements Comparable<GeometricObject> {
	double radius;

	// Konstruktori
	Circle() {
	}

	Circle(double newRadius) {
		radius = newRadius;
	}

	// metoda za izracunavanje povrsine
	double getArea() {
		return radius * radius * Math.PI;
	}

	// geteri i seteri
	public double getRadius() {
		return radius;
	}

	public void setRadius(double newRadius) {
		if (radius >= 0) {
			radius = newRadius;
		}
	}

	// provjerava da li su objekta jednaki
	@Override
	public boolean equals(Object obj) {

		if (obj.equals(radius)) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Circle [Area " + getArea() + "]";
	}

	@Override
	public int compareTo(GeometricObject o) {
		return 0;
	}

}