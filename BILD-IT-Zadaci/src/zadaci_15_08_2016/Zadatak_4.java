package zadaci_15_08_2016;

import java.util.Scanner;

public class Zadatak_4 {

	public static void main(String[] args) {
		/*
		 * Napisati metodu koja izračunava zbir svih brojeva u cijelom broju.
		 * Koristite sljedeći header: public static int sumDigits(long n). Na
		 * primjer, ako pozovemo metodu i proslijedimo joj broj 234
		 * (sumDigits(234)) metoda treba da vrati 9. (2 + 3 + 4 = 9)
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite cijeli broj: ");
		// unos broja od strane korisnika
		long n = input.nextLong();
		// pozivamo metodu i prosljedjujemo joj broj koji korisnik unese
		System.out.println(sumDigits(n));
		input.close();

	}

	// metoda za sabiranje cifara unutar borja kojeg korisnik unese
	public static int sumDigits(long n) {
		int sum = 0;
		long digit;

		// petljom rastavljamo broj koji je korisnik unio
		do {
			digit = n % 10;// kada podijelimo uneseni broj sa 10 kao
							// ostatak nam ostaje zadnji broj
			sum += digit; // zadnji broj koji smo dobili sabiremo sa svakom
							// sljedecom cifrom koju dobijemo i dodajemo na sumu

			n /= 10;// na kraju broj podijelimo sa 10 da bi nastavili sa
					// ciframa koje su nam ostale kod broja koji je
					// korisnik unio
		} while (n != 0);// petlja radi sve dok broj koji je korisnik unio
							// djelivsi ga u petlji ne bude 0

		return sum;// vracamo zbir cifara datog broja
	}
}
