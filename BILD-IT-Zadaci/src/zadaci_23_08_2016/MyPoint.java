package zadaci_23_08_2016;

public class MyPoint {
	double x;
	double y;

	// geteri
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	// Konstruktor
	public MyPoint() {
		this.x = 0;
		this.y = 0;
	}

	public MyPoint(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	// provjeravamo razdaljinu dvije tacke
	public double distance(MyPoint p) {
		return this.distance(p.getX(), p.getY());
	}

	// provjera razdaljine za dvije tacke odredjenih koordinata x y
	public double distance(double x2, double y2) {
		return Math.sqrt((Math.pow((this.x - x2), 2) + Math.pow((this.y - y2), 2)));
}

}
