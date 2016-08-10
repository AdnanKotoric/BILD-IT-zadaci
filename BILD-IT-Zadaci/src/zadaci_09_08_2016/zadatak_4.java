package zadaci_09_08_2016;

import java.util.Scanner;

public class zadatak_4 {

	public static void main(String[] args) {
		/*
		 * Program koji učitava neodređen broj cijelih brojeva (unos prekida
		 * nula), pronalazi najveći od unijetih brojeva te ispisuje koliko se
		 * najveći broj puta ponovio. Na primjer, ukoliko unesemo 3 5 2 5 5 5 0
		 * program ispisuje da je najveći broj 5 te ispisuje da se isti ponavlja
		 * 4 puta.
		 */
		Scanner input = new Scanner(System.in);
		// varijable za unos korisnika, max kao najveci broj i brojac za najveci
		// broj counterMax
		int userIn = 0;
		int max = 0;
		int counterMax = 0;
		System.out.println("Unesite cijeli broj (0 prekida unos): ");
		// Petlja kojom korisnik unosi cijele brojeve sve dok ne unese 0
		do {
			// unos korisnika
			userIn = input.nextInt();
			// uslov ukoliko broj koji korisnik unese je veci od vrijednosti
			// koja je vec spremljena u max, taj broj postavljamo kao novu
			// vrijednost max
			if (userIn > max) {
				max = userIn;
				counterMax = 0;// brojac resetujemo na 0

			}
			// uslov s kojim provjeravamo da li su max i unos korisnika jednaki,
			// ukoliko jesu brojac povecavamo za 1
			if (userIn == max) {
				counterMax++;
			}

		} while (userIn != 0);// unosom 0 petlja se zavrsava
		input.close();
		// ispisujemo najveci broj koji je korisnik unio i koliko se puta
		// ponovio taj broj
		System.out.println("Najveci broj je " + max + " ponovio se "
				+ counterMax + " puta.");
	}

}
