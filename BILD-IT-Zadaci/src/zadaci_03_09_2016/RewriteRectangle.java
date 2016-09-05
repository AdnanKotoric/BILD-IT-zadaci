package zadaci_03_09_2016;

public class RewriteRectangle {

	public static void main(String[] args) {
		// kreiramo objekte Rectangle klase
		Rectangle r = new Rectangle(4, 6);
		Rectangle rr = new Rectangle(4, 6);
		// ispisuje da li su jednaki ili nisu
		System.out.println(r.equals(rr));

	}

}

class Rectangle extends GeometricObject implements Comparable<Rectangle> {

	// data fildovi
	double width = 1;
	double height = 1;

	// konstruktori
	Rectangle() {
	}

	Rectangle(double newWidth, double newHeight) {
		width = newWidth;
		height = newHeight;
	}

	// metoda za izracunavanje povrsine
	double getArea() {
		return Math.ceil(width * height);
	}

	// metoda za izracunavanje povrsine
	double getPerimetar() {
		return (2 * width) + (2 * height);
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}

	// overajdamo equals metodu
	@Override
	public boolean equals(Object obj) {
		if (obj.equals(getArea())) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int compareTo(Rectangle o) {
		return 0;
	}

}