package zadaci_22_08_2016;

import java.util.Scanner;

public class Zadatak_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a, b, c, d, e, f: ");
		// unos varijabli
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		// pravimo objekat
		LinearEquation linear = new LinearEquation(a, b, c, d, e, f);
		// ipsis rezultate linearne funkcije ukoliko ad - bc nije 0, ukoliko je
		// 0 ispis da nema rjesenja
		if (linear.isSolvable()) {
			System.out.println("x is " + linear.getX() + " and y is "
					+ linear.getY());// unutar ispisa pozivamo metode za
										// racunanje datih vrijednosti
		} else {
			System.out.println("The equation has no solution.");
		}
	}

}
