package zadaci_06_08_2016;

import java.util.Scanner;

public class Zadatak_3 {

	public static void main(String[] args) {
		/*
		 * Program koji pita korisnika da unese broj te mu vrati da li je broj
		 * palindrome ili ne.
		 */
		Scanner input = new Scanner(System.in);
		// Unos broja od strane korisnika
		System.out.println("Unesite broj: ");
		int numb = input.nextInt();
		// poziv metode koja ce nam broj ispisati naopako
		System.out.println("Broj " + numb + " ispisan naopako je: "
				+ reverse(numb));
		// poziv metode koja provjerava da li je broj palindrom sa uslovom kojim
		// ispisujemo da li je broj palindrom ili ne u zavisnosti sta nam vrati
		// metoda
		if ((isPalindrom(numb)) == true) {
			System.out.println("Broj " + numb + " je palindrom.");
		} else {
			System.out.println("Broj " + numb + " nije palindrom.");
		}
		input.close();
	}

	public static int reverse(int number) {
		// metoda koja ispisuje broj u obrnutom redosljedu
		// u prazan string cemo spremati brojeve koje u petlji dobijemo
		String obrnut = "";
		int reverse = 0;
		int broj = number;
		// petlja kojom dijelimo dati broj sa 10(sve dok broj nije 0)
		// ostatak broja tj. zadnju cifru sprema u varijablu obrnut
		// kada na kraju dijeljenja vrijednost broja bude 0 petlja se prekida
		while (broj != 0) {
			obrnut += broj % 10;
			broj = broj / 10;
		}
		// vrijednost varijable obrnut dodjeljujemo varijabli reverse pomocu
		// klase Integer
		reverse = Integer.valueOf(obrnut);
		return reverse;
	}

	public static boolean isPalindrom(int number) {
		// metoda koja provjerava da li je dati broj palindrom
		
		// uslov u kojem pozovemo metodu reverse i ukoliko broj koji je korisnik
		// unio i broj koji dobijemo od metode reverse u obrnutom redosljedu su
		// jednaki vracamo true u suprotnom vracamo false
		if (number == reverse(number)) {
			return true;

		}
		return false;
	}

}
