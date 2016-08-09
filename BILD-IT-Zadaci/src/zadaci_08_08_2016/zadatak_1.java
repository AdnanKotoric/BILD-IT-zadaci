package zadaci_08_08_2016;

import java.util.Scanner;

public class zadatak_1 {

	public static void main(String[] args) {
		/*
		 * program koji ispisuje tri nasumična cijela broja te pita korisnika da
		 * unese njihov zbir. Ukoliko korisnik pogriješi, program ispisuje
		 * pitanje ponovo sve sa porukom da pokuša ponovo.
		 */

		Scanner input = new Scanner(System.in);
		// Generisemo 3 nasumicna broja
		int numb1 = (int) (Math.random() * 10);
		int numb2 = (int) (Math.random() * 10);
		int numb3 = (int) (Math.random() * 10);
		// postavljamo unos korisnika na 0
		int userin = 0;
		// varijabla sum cuva zbir 3 broja radi lakseg poredjenja u petlji
		int sum = numb1 + numb2 + numb3;

		// ispisujemo pitanje korisniku sa 3 nasumicna broja
		System.out.println("Koliki je zbir " + numb1 + " + " + numb2 + " + "
				+ numb3 + "?");
		// unos odgovora od strane korisnika
		userin = input.nextInt();
		// pravimo petlju ukoliko odgovor nije tacan i petlja se pokrece i trazi
		// od korisnika da unese zbir brojeva sve dok
		// korisnik ne unese tacan odgovor
		while (userin != sum) {
			System.out.println("Vas odgovor nije tacan. Pokusajte ponovo!"
					+ " Koliki je zbir " + numb1 + " + " + numb2 + " + "
					+ numb3 + "?");
			userin = input.nextInt();
		}
		input.close();
		// unosom tacnog odgovora ispisujemo krajnju poruku korisniku
		System.out
				.println("Cestitamo vas odgovor je tacan! Zbir datih brojeva je "
						+ sum + ".");
	}

}
