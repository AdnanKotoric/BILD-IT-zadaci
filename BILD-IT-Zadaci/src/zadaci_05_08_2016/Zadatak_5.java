package zadaci_05_08_2016;

import java.util.Scanner;

public class Zadatak_5 {

	public static void main(String[] args) {
		/*
		 * Program koji pita korisnika da unese neki string te mu vrati koliko
		 * taj string ima slova.
		 */
		Scanner input = new Scanner(System.in);
		// Unos stringa od strane korisnika
		System.out.println("Unesite recenicu: ");
		String s = input.nextLine();
		// Poziv metode i printanje broja slova u stringu
		input.close();
		System.out.println("Broj slova u stringu je: " + countLetters(s));

	}

	public static int countLetters(String s) {
		// postavljamo brojac koji broji slova na 0
		int counter = 0;
		// Petlja s kojom prolazimo kroz string zajedno sa uslovom koji
		// provjerava da li je karakter na toj poziciji u stringu slovo
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetter(s.charAt(i))) {
				counter++;
			}

		}
		return counter;

	}

}
