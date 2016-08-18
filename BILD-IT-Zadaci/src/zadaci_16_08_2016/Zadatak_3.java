package zadaci_16_08_2016;

import java.util.Scanner;

public class Zadatak_3 {

	public static void main(String[] args) {
		/*
		 * program koji pita korisnika da unese Social Security Number (SSN) u
		 * formatu DDD-DD-DDDD gdje D predstavlja broj. Program treba da
		 * provjerava da li je broj unesešen u ispravnom formatu. Ukoliko nije,
		 * program pita korisnika da pokuša ponovo. Ukoliko jeste unešen u
		 * pravom formatu, program završava sa radom.
		 */
		Scanner input = new Scanner(System.in);
		// unos korisnika za ssn
		System.out
				.print("Unesite Social Security Number (SSN), u formatu DDD-DD-DDDD (gdje D predstavlja broj): ");
		String s = input.next();
		// petljom uzimamo unos korisnika sve dok metoda koja provjerava
		// validnost ssn broja ne vrati true tj da je validan unos
		while (isValid(s) != true) {

			System.out
					.println("Unijeli ste SSN u pogresnom formatu, pokusajte ponovo!");
			s = input.next();// ispisujemo poruku da je pogresan unos i korisnik
								// ponovo unosi
		}
		// ukoliko je tacan ssn vvracamo metoda vraca true i ispisujemo poruku
		// korisniku da je validan ssn i prekidamo program
		if (isValid(s) == true) {
			System.out.println("Unijeli ste ispravan SSN");
		}
		input.close();

	}

	// metoda za provjeru validnosti ssn
	public static boolean isValid(String s) {
		// varijablu isValid postavljamo na false
		boolean isValid = false;
		// petljom prolazimo kroz ssn
		for (int i = 0; i < s.length(); i++) {
			if (s.length() < 11 || s.length() > 11) {
				return isValid;// ukoliko je duzi od 11 ili kraci vracamo false
			}
			// provjeravamo da li su brojevi na svim mjestima osim 4 i 7 gdje
			// treba da budu crtice
			if (!Character.isDigit(s.charAt(i))) {
				if (i == 3 && i == 6) {
					continue;// preskacemo 3 i 6 indeks
				}
				isValid = false;
			} else {
				isValid = true;
			}
		}
		// provjeravamo da li su na odredjenim mjestima (4 i 7 mjesto tj. 3 i 6
		// indeks) crtice
		if ((s.charAt(3) != '-') && (s.charAt(6) != '-')) {
			isValid = false;
		} else {
			isValid = true;

		}

		return isValid;// vracamo isValid sa trenutnom vrijednoscu
	}
}
