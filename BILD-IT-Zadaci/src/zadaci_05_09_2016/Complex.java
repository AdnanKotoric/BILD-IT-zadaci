package zadaci_05_09_2016;

public class Complex implements Cloneable {
	// stvarni dio
	private final double a;
	// imaginarni dio
	private final double b;

	// konstruktori
	public Complex(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}

	public Complex(double a) {
		this.a = a;
		this.b = 0;
	}

	public Complex() {
		this.a = 0;
		this.b = 0;
	}

	// motda za sabiranje
	public Complex add(Complex b) {

		Complex a = this;
		double addA = a.a + b.a;
		double addB = a.b + b.b;
		return new Complex(addA, addB);
	}

	// metoda za oduzimanje
	public Complex substract(Complex b) {
		Complex a = this;
		double subA = a.a - b.a;
		double subB = a.b - b.b;
		return new Complex(subA, subB);
	}

	// metoda za mnozenje
	public Complex multyply(Complex b) {
		Complex a = this;
		double mulA = (a.a * b.a) - (a.b * b.b);
		double mulB = (a.a * b.b) + (a.a * b.b);
		return new Complex(mulA, mulB);
	}

	// metoda za dijeljenje
	public Complex divide(Complex b) {
		Complex a = this;
		double mulA = a.a / b.a;
		double mulB = a.b / b.b;
		return new Complex(mulA, mulB);
	}

	// racuna absolutnu vrijednost
	public double abs() {
		return Math.sqrt((a * a) + (b * b));
	}

	public double getRealPart() {
		return a;
	}

	public double getImaginaryPart() {
		return b;

	}

	// overajdamo toString metodu
	@Override
	public String toString() {
		if (b == 0) {
			return "" + a;
		} else {

			return "Complex [" + a + " + " + b + "i]";
		}
	}

}