package zadaci_16_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_1 {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		/*
		 * program koji pita korisnika da unese cijeli trocifreni broj te
		 * provjerava da li je unijeti broj palindrom. Broj je palindrom ukoliko
		 * se čita isto i sa lijeva na desno i sa desna na lijevo npr. 121, 131,
		 * itd.
		 */

		System.out.println("Unesite cijeli trocifren broj: ");
		// unos korisnika
		int numb = checkInput();// provjeravamo da li je broj trocifren

		// pozivamo metodu i shodno tome da li je broj palindrom ili ne nakon
		// provjere ispisujemo poruku
		if (isPalindrom(numb) == true) {
			System.out.println("Broj " + numb + " je palindrom!");
		} else {
			System.out.println("Broj " + numb + " nije palindrom!");
		}

	}

	// metoda za provjeru je li broj palindrom
	public static boolean isPalindrom(int numb) {
		// u string spremamo broj u obrnutom redoslijedu
		String obrnut = "";
		int reverse = 0;
		int broj = numb;
		// petljom rastavljamo broj koji je korisnik unio sve dok dijeljenjem sa
		// 10
		// ostane 0, a svaki ostatak spremamo u string obrnutim redoslijedom
		while (broj != 0) {
			obrnut += broj % 10;
			broj = broj / 10;
		}
		// posto poredimo cjelobrojnu vrijednost vraijabli dodjeljujemo
		// vrijednost stringa obrnut koji smo napravili
		reverse = Integer.valueOf(obrnut);
		if (numb == reverse) {
			return true;// ukoliko je uslov ispunjen vracamo true

		}
		return false;// u suprotnom vracamo false, broj nije palindrom
	}

	public static int checkInput() {

		int num = 0;
		boolean error = true; // postavljamo da greska postoji

		do {
			try {
				num = input.nextInt();
				if (num < 100 || num > 999)// provjera unosa broja
					throw new InputMismatchException();
				// ako je unos korektan petlja staje
				error = false;// error postaje false, greske nema
			} catch (InputMismatchException e) {
				System.out
						.print("Pogresan unos, unsite ponovo! (Broj mora biti trocifren!): ");
				input.nextLine();
			}
		} while (error);// sve dok greska postoji ponavlja se unos

		return num;// vracamo unijeti broj
	}
}
