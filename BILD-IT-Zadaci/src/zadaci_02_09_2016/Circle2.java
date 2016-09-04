package zadaci_02_09_2016;

public class Circle2 extends GeometricObject {
	double radius;
	//konstruktor
	Circle2() {
	}
	Circle2(double newRadius) {
		radius = newRadius;
	}
	// metoda za izracunavanje povrsine
	double getArea() {
		return radius * radius * Math.PI;
	}

	// geteri i seteri za radius
	public double getRadius() {
		return radius;
	}

	public void setRadius(double newRadius) {
		if (radius >= 0) {
			radius = newRadius;
		}
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

}