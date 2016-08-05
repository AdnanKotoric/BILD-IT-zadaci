package zadaci_03_08_2016;

import java.util.Scanner;

public class Zadatak_2 {

	public static void main(String[] args) {
		/*
		 * program koji pita korisnika da unese deset brojeva te poziva metodu
		 * da vrati najmanji element u nizu.
		 */
		Scanner input = new Scanner(System.in);
		// Kreiramo niz i trazimo unos od strane korisnika
		double[] numbers = new double[10];
		System.out.println("Unesite 10 brojeva u niz: ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextDouble();
		}
		// pozivamo metodu koja nam printa najmanji element u nizu
		System.out.println(min(numbers));

	}

	public static double min(double[] array) {
		// postavljamo prvi element za pocetnu vrijednost najmanjeg
		double min = array[0];
		// Petlja s kojom provjeravamo najmanji element u nizu krecemo od drugog
		// elemnta
		for (int i = 1; i < array.length; i++) {
			// kada pronadje element koji je manji od onog koji se nalazi
			// spremljen u varijabli postavljamo ga umjesto trenutnog
			if (array[i] < min) {
				min = array[i];
			}
		}
		//vracamo najmanji element
		return min;
	}

}
