package zadaci_04_08_2016;

import java.util.Scanner;

public class Zadatak_1 {

	public static void main(String[] args) {
		/*
		 * program koji pita korisnika da unese neki cijeli broj te ispisuje
		 * njegove najmanje faktore u rastućem redosljedu.
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite broj za koji zelite najmanje faktore: ");
		int numb = input.nextInt();

		System.out.print("Najmanji faktori broja " + numb + " su: ");

		// koristimo petlju da provjerimo najmanje faktore
		for (int factor = 2; factor <= numb; factor++) {

			// ako je broj faktor broja koji je korisnik unio ponavljamo petlju
			// sve dok je to moguce
			while (numb % factor == 0) {
				System.out.print(factor + " ");
				numb = numb / factor;
			}
		}

	}

}
