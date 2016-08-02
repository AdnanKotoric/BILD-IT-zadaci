package zadaci_01_08_2016;

import java.util.Scanner;

public class Zadatak_2 {

	public static void main(String[] args) {
		// Ispis broja samoglasnika i suglasnika u stringu koji korisnik unese

		Scanner input = new Scanner(System.in);
		System.out.println("Unesite recenicu: ");
		// unos stringa i postavljanje svih slova u velika radi lakse provjere
		String s = input.nextLine().toUpperCase();
		// brojac samoglasnika
		int counter1 = 0;
		// brojac suglasnika
		int counter2 = 0;
		// petlja kojom cemo proci kroz citav string
		for (int i = 0; i < s.length(); i++) {

			// provjerimo da li je na indeksu slovo
			if (Character.isLetter(s.charAt(i))) {
				/*
				 * ako je slovo provjeravamo je li samoglasnik, ako jeste brojac
				 * povecavamo za jedan u suprotnom povecavamo brojac za
				 * suglasnike
				 */
				if (s.charAt(i) == 'A' || s.charAt(i) == 'E'
						|| s.charAt(i) == 'I' || s.charAt(i) == 'O'
						|| s.charAt(i) == 'U') {
					counter1++;
				} else {
					counter2++;
					;
				}
			}

		}
		input.close();
		// ispis koliko imamo samoglasnika a koliko suglasnika
		System.out.println("U vasoj recenici ima: " + counter1
				+ " samoglasnika i " + counter2 + " suglasnika.");
	}

}
