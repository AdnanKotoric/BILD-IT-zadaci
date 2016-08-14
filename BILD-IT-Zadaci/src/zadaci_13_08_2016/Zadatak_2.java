package zadaci_13_08_2016;

import java.util.Scanner;

public class Zadatak_2 {

	public static void main(String[] args) {
		/*
		 * Program koji pita korisnika da unese neki cijeli broj te mu vrati
		 * isti ispisan naopako. Na primjer, reverse(3456) treba da vrati 6543.
		 */

		// unos korisnika i provjera da li je korisnik unio cijeli broj
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite cijeli broj: ");
		int number = input.nextInt();
		input.close();
		reverse(number);// pozivamo metodu koja ispisuje brojeve naopako i
						// prosljedjujemo joj broj koji je korisnik unio

	}

	// metoda za ispis broja naopako
	public static void reverse(int number) {
		// varaijabla u koju spremamo naopako okrenuti broj
		int reverse = 0;
		int digit;
		// petljom rastavljamo broj koji je korisnik unio
		do {
			digit = number % 10;// kada podijelimo uneseni broj sa 10 kao
								// ostatak nam ostaje zadnji broj
			reverse = reverse * 10 + digit; // zadnji broj koji smo dobili
											// dodajemo na varijablu reverse i
											// sada ce biti na prvom mjestu
			number /= 10;// na kraju broj podijelimo sa 10 da bi nastavili sa
							// ciframa koje su nam ostale kod broja koji je
							// korisnik unio da i njih ispisemo napako
		} while (number != 0);// petlja radi sve dok broj koji je korisnik unio
								// djelivsi ga u petlji ne bude 0

		System.out.println(reverse);// ispis naopako broja
	}

}
