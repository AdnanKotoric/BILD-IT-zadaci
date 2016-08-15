package mini_2_craps_and_credit_cards;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Credit_Card_Number_Validation {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		/*
		 * Brojevi kreditnih kartica slijede određeni obrazaca patern. Brojevi
		 * kreditne kartice moraju imati između 13 i 16 znamenki. Kartica mora
		 * početi sa: 4 za Visa kartice 5 za Master kartice 37 za American
		 * Express kartice 6 za Discover kartica Godine 1954., Hans Luhn IBM
		 * predložio algoritam za provjeru brojeva kreditne kartice. Algoritam
		 * je koristan kako bi se utvrdilo da li je uneseni broj kartice
		 * ispravan ili ne.
		 */

		// unos korisnika za broj kreditne kartice kao long
		System.out.println("Unesite broj vase kreditne kartice: ");
		long number = checkInput();// pozivamo metodu koja provjerava unos i
									// duzinu broja
		String sNumber = Long.toString(number);// broj kartice pretvaramo u
												// string radi lakse provjere te
												// ga saljemo petodama kao
												// string

		// uslov u kojem pozivamo metodu(prosljedjujemo joj broj kartice kao
		// string) koja provjerava valjanost kartice te
		// ispisuje shodno tome je li validna ili ne
		if (isValid(sNumber) == true) {
			System.out.println("Vasa kreditna kartica je validna.");
		} else {
			System.out.println("Vasa kreditna kartica nije validna");
		}

	}

	// metoda za provjeru valjanost
	public static boolean isValid(String sNumber) {
		// posto validnost kartice provjeravamo sa Luhn check ili the Mod 10
		// check pozivamo metode koje nam olaksavaju dobiti konacnu sumu svih
		// parnih i neparnih(s desna na lijevo) brojeva kartice
		int sum = sumOfDoubleEvenPlace(sNumber) + sumOfOddPlace(sNumber);
		// uslov ukoliko je suma svih brojeva djeljiva sa 10 i tacan je prefix
		// vracamo true
		if ((sum % 10 == 0) && prefixMatched(sNumber)) {
			return true;
		}
		return false;// ukoliko jedan od uslova nije ispunjen vracamo false

	}

	// metoda za sabiranje parnih brojeva(s desna na lijevo)
	public static int sumOfDoubleEvenPlace(String sNumber) {
		int sum = 0;
		// petljom prolazimo kroz string i provjeravamo parne brojeve
		for (int i = sNumber.length() - 1; i >= 0; i--) {
			// sa parnog mjesta stringa na n dodajemo cjelobrojnu vrijednost
			int n = Integer.parseInt(sNumber.substring(i, i + 1));

			if (i % 2 == 0) { // ukoliko je paran indeks uzimamo vrijednost sa
								// te pozicije

				n *= 2;// duplamo taj broj

				// uslo ukoliko je uduplana vrijednost veca od 9
				if (n > 9) {
					// pozivamo metodu i vrijednost koju vrati dodajemo na sumu
					sum += getDigit(n);
				} else {
					sum += n;// u suprotnom uduplanu vrijednost dodajemo
								// direktno na sumu
				}

			}

		}

		return sum;// vracamo sumu brojeva na parnim mjestima(s desna na lijevo
	}

	// metoda za razbijanje uduplanog broja veceg od 9
	public static int getDigit(int number) {
		number = (number % 10) + 1; // dati broj podijelimo sa 10, te povecamo
									// za 1
		return number;// vracamo potreban broj
	}

	// metoda za sabiranje brojeva na neparnim mjestima(s desna na lijevo)
	public static int sumOfOddPlace(String sNumber) {
		int sum = 0;
		// petljom prolazimo kroz string te sabiremo brojeve na neparnim
		// mjestima
		for (int i = sNumber.length() - 1; i >= 0; i--) {
			// sa datog mjesta stringa na n dodajemo cjelobrojnu vrijednost
			int n = Integer.parseInt(sNumber.substring(i, i + 1));

			if (i % 2 == 0) { // ukoliko je indeks paran nastavljamo s petljom
								// ne dodajemo broj na sumu

				continue;
			}

			sum += n;// u suprotnom broj dodajemo na sumu brojeva na neparnim
						// mjestima
		}

		return sum;
	}

	// metoda za provjeru prvih cifara kreditne kartice koje su razlicite za
	// odredjene kreditne kartice
	public static boolean prefixMatched(String sNumber) {
		// uslov sa kojim provjeravamo cifru na prvom odnosno na prva dva mjesta
		// u zavisnosti koja je kartica
		if (sNumber.startsWith("4") || sNumber.startsWith("5")
				|| sNumber.startsWith("37") || sNumber.startsWith("6")) {
			return true;// ukoliko je tacan prefix vracamo true
		} else {
			return false;// u suprotnom nije kartica validna vracamo false
		}
	}

	// checks input
	public static long checkInput() {

		long num = 0;
		boolean error = true; // postavljamo da greska postoji

		do {
			try {
				num = input.nextLong();
				if (num < 13 && num > 16)// provjera duzine broja kartice
					throw new InputMismatchException(
							"Kartica sadrzi najmanje 13 a najvise 16 brojeva!");
				// ako je unos korektan petlja staje
				error = false;// error postaje false, greske nema
			} catch (InputMismatchException e) {
				System.out.print("Pogresan unos, unsite ponovo:  ");
				input.nextLine();
			}
		} while (error);// sve dok greska postoji ponavlja se unos

		return num;// vracamo unijeti broj
	}

}
