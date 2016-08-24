package zadaci_22_08_2016;

import java.util.Scanner;

public class Zadatak_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		// unos od strane korisnika za kordinate tacaka
		System.out.println("Unesite x1, y1, x2, y2, x3, y3, x4, y4: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		double x4 = input.nextDouble();
		double y4 = input.nextDouble();
		// ranucanje linija u sistemu za izracunavanje presjeka
		double a = (y1 - y2);
		double b = (-x1 + x2);
		double c = (y3 - y4);
		double d = (-x3 + x4);
		double e = (-y1 * (x1 - x2)) + ((y1 - y2) * x1);
		double f = (-y3 * (x3 - x4)) + ((y3 - y4) * x3);
		LinearEquation le = new LinearEquation(a, b, c, d, e, f);
		// ispis u konzoli je li se linije sijeku ili su paralelne
		if (le.isSolvable()) {
			System.out.println("The intersecting point is at (" + le.getX()
					+ ", " + le.getY() + ")");
		} else {
			System.out.println("The two lines are parallel");
		}

	}

}
