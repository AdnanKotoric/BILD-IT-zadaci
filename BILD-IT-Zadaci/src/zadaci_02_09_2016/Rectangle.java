package zadaci_02_09_2016;

public class Rectangle extends GeometricObject{

	// data
	double width = 1;
	double height = 1;

	// konstruktor
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

	// metoda za izracunavanje perimetra
	double getPerimetar() {
		return (2 * width) + (2 * height);
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}


}