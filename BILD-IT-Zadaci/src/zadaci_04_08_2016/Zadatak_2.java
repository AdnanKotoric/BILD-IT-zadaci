package zadaci_04_08_2016;

import java.util.Scanner;

public class Zadatak_2 {

	public static void main(String[] args) {
		/*
		 * ISBN-10 (International Standard Book Number) se sadrži od 10 brojeva
		 * Posljednji broj, d10, služi kao checksum i njega izračunavamo iz
		 * prvih devet brojeva. Ukoliko je checksum 10, zadnji broj označavamo
		 * sa X u skladu sa ISBN-10 konvencijom. program koji pita korisnika da
		 * unese prvih 9 brojeva te ispiše desetocifreni ISBN-10 broj.
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite prvi 9 brojeva");
		// numb nam korisit u formuli za izracunavanje posljednjeg broja i sluzi
		// kao redni broj broja koji unosimo
		int numb = 1;
		//
		int lastNum = 0;
		// last je cheksum tj. posljednji deseti broj
		int checksum = 0;
		// kreiramo niz u koji spremamo 9 brojeva od strane korisnika
		int[] niz = new int[9];
		// pomocu petlje unosimo brojeve u niz
		for (int i = 0; i < niz.length; i++, numb++) {
			niz[i] = input.nextInt();
			// koristeci prvi dio formule unutar petlje racunamo broj koji cemo
			// kasnije dijeliti sa 11 kako bi dobili zadnji broj
			lastNum += niz[i] * numb;

		}
		// dijelimo broj koji smo dobili sa 11 kako bi dobili zadnji deseti broj
		checksum = lastNum % 11;
		// petljom printamo prvih 9 clanova ISBN-10
		for (int i = 0; i < niz.length; i++, numb++) {
			System.out.print(niz[i]);

		}
		// uslovom regulisemo ukoliko je zadnji broj broj 10 kako bi nam
		// printalo X
		if (checksum == 10) {
			System.out.print('X');
		} else {
			System.out.print(checksum);// za sve ostale slucajeve printamo
										// dobiveni broj
		}
	}
}
