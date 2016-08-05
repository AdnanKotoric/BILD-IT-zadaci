package zadaci_03_08_2016;

import java.util.Scanner;

public class Zadatak_1 {

	public static void main(String[] args) {
		/*
		 * program koji ima metodu sto prima 2 argumenta: početni broj i krajnji
		 * broj te printa sve proste brojeve u zadanom rangu. metoda prima i
		 * treći argument, broj brojeva za isprintati po liniji.
		 */
		Scanner input = new Scanner(System.in);
		// Od korisnika trazimo pocetnu i krajnju vvrijednost
		System.out.println("Unesite pocetni broj: ");
		int pocetak = input.nextInt();
		System.out.println("Unesite krajnji broj: ");
		int kraj = input.nextInt();
		// Isto tako trazimo koliko zeli printati brojeva po liniji
		System.out.println("Unesite koliko zelite brojeva printati po liniji");
		int count = input.nextInt();
		input.close();
		// Pozivamo metodu koja je void i prosljedjujemo joj vrijednosti
		isPrime(pocetak, kraj, count);
	}

	public static void isPrime(int start, int end, int numb) {
		// postavljamo brojac brojava za jednu liniju na 0
		int numbPerLine = 0;

		// petlja kojom provjeravamo da li su brojevi prosti u zadanom rangu
		for (int i = start; i < end; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {

				if (i % j == 0) {
					isPrime = false;
					break;

				}

			}

			// ako je prost broj ispisuje se i povecavamo brojac za 1
			if (isPrime) {
				System.out.print(i + " ");
				numbPerLine++;
			}
			// kada u liniji imamo prostih brojeva koliko je korisnik odredio
			// prebacujemo u novi red i brojac resetujemo na 0
			if (numbPerLine == numb) {
				System.out.println();
				numbPerLine = 0;
			}

		}
	}
}
