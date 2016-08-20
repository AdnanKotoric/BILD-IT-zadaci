package zadaci_18_08_2016;

import java.util.Scanner;

public class Zadatak_2 {

	public static void main(String[] args) {
		/*
		 * (Random number chooser) Write a method that returns a random number
		 * between 1 and 54, excluding the numbers passed in the argument. The
		 * method header is specified as follows: public static int
		 * getRandom(int... numbers)
		 */
		Scanner input = new Scanner(System.in);
		int[] numbers = new int[10];

		System.out
				.print("Unesite 10 brojeva izmedju 1 - 54 koji se nece generisati nasumicno:");

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}

		System.out.println("100 nasumicno generisanih brojeva: ");
		// petljom ispisujemo nasumicne brojeve
		for (int i = 0; i < 100; i++) {
			// unutar petlje pozivamo metodu koja generise nasumican broj koji
			// se ne nalazi u prosljedjenoj listi za iskljucenje
			System.out.println(getRandom(numbers));

		}

	}

	public static int getRandom(int... numbers) {

		int getRandom = 0;
		boolean isInList = true;

		// petlja radi sve dok se ne pojavio broj koji se nalazi u nizu koji
		// treba biti iskljucen i generisanja
		while (isInList) {
			getRandom = (int) (Math.random() * 54) + 1;
			// pretopstavimo da se broj ne nalazi u nizu i postavljamo isInList
			// na false
			isInList = false;
			// provjeravamo da li se broj nalazi u nizu za iskljucenje
			for (int i : numbers) {
				// ako se nalazi u listi resetujemo isInList na true i trazimo
				// novi nasumican broj koji nije u listi
				if (getRandom == i) {
					isInList = true;
					break;
				}
			}
		}

		return getRandom;// ukoliko nije u listi vracamo nasumican broj
	}

}
