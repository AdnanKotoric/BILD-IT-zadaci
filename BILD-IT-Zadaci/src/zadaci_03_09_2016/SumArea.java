package zadaci_03_09_2016;

public class SumArea {
	public static double sumArea(GeometricObject[] a) {
		double sum = 0;
		// izracunavamo povrsinu objekata
		for (int i = 0; i < a.length; i++) {
			sum += a[i].getArea();
		}
		// vracamo ukupnu sumu
		return sum;
	}

	public static void main(String[] args) {
		// kreiramo objekte Circle klase
		Circle c1 = new Circle(5);
		Circle c2 = new Circle(4);
		Rectangle r1 = new Rectangle(2, 5);
		Rectangle r2 = new Rectangle(7.3, 2);
		// spremamo ih u niz
		GeometricObject[] a = { c1, c2, r1, r2 };
		// ispsiujemo povrsinu
		System.out.println("Sum of objects area is: " + sumArea(a));

	}

}