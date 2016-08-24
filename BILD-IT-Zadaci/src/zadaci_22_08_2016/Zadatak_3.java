package zadaci_22_08_2016;

import java.util.Scanner;

public class Zadatak_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		// unos koeficjenata
		System.out.print("Unesite a, b, c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		// pravimo objekat prosljedjujemo koeficjente
		QuadraticEquation equation = new QuadraticEquation(a, b, c);
		// poziv metode koju smo napravili za racunanje diskriminanta
		equation.getDiscriminant();
		System.out.println("Root1 : " + equation.getRoot1());// poziv metode za ispis prvog
												// korjena
		System.out.println("Root2 : " + equation.getRoot2());// metoda za drugi korijen

	}

}
