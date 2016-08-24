package zadaci_22_08_2016;

public class QuadraticEquation {
	// data fieldovi klase
	private double a;
	private double b;
	private double c;

	// konstruktor klase
	public QuadraticEquation(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	// geteri i seteri za fieldove klase
	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	// metoda za racunanje diskriminanta
	public double getDiscriminant() {
		return (b * b) - (4.0 * a * c);
	}

	// metode za racunanje dvije root vrijednosti
	public double getRoot1() {
		if (getDiscriminant() < 0) {
			return 0;// ukoliko je negativna ispisuje 0
		} else {
			return (-b + (-b + Math.sqrt(getDiscriminant())) / (2 * a));
		}
	}

	public double getRoot2() {
		if (getDiscriminant() < 0) {
			return 0;// ukoliko je negativna ispisuje 0
		} else {
			return (-b - (-b + Math.sqrt(getDiscriminant())) / (2 * a));
		}

	}
}
