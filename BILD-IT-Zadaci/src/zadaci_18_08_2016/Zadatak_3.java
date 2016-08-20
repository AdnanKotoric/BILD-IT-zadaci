package zadaci_18_08_2016;

import java.util.Scanner;

public class Zadatak_3 {

	public static void main(String[] args) {
		/*
		 * (Pattern recognition: consecutive four equal numbers) Write the
		 * following method that tests whether the array has four consecutive
		 * numbers with the same value. public static boolean
		 * isConsecutiveFour(int[] values) Write a test program that prompts the
		 * user to enter a series of integers and dis- plays if the series
		 * contains four consecutive numbers with the same value. Your program
		 * should first prompt the user to enter the input size—i.e., the number
		 * of values in the series.
		 */
		Scanner input = new Scanner(System.in);
		System.out.print("Koliko brojeva zelite unijeti:");

		int[] numbers = new int[input.nextInt()];

		System.out.print("Unesite brojeve:");

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}

		if (isConsecutiveFour(numbers)) {
			System.out.println("U listi postoje 4 uzastopna ista broja");
		} else {
			System.out.println("U listi ne postoje 4 uzastopna ista broja");
		}
		input.close();

	}

	public static boolean isConsecutiveFour(int[] numbers) {
		// kao pocetnu vrijednost uzimamo broj na nultom indeksu
		int start = numbers[0];
		// brojac postavljamo na 1 zbog pocetne vrijednosti kako ne bi bila
		// izostavljena
		int count = 1;
		// petljom nastavljamo od prvog indeksa do kraja niza kako bi pretrazili
		// da li ima 4 uzastopna broja
		for (int i = 1; i < numbers.length; i++) {
			// uslovom regulisemo ukoliko se pojavi broj koji nije isti
			// postavljamo ga kao pocetnu vrijednost i nastavljamo provjeravati
			// za njega jer nam je prekinuo niz od 4 uzastopna broja
			if (start != numbers[i]) {
				start = numbers[i];
				count = 1;// brojac ponovo postavljamo na 1
			} else {

				count++;// sve dok se pojavljuje isti broj brojac povecavamo za
						// 1
			}

			if (count == 4)// ukoliko je brojac bude 4 prekidamo petlju
				break;

		}

		if (count == 4)// ukoliko je brojac jednak 4 vracamo true
			return true;

		return false;// u suprotnom vracamo false jer nemamo 4 uzastopna broja
	}

}
