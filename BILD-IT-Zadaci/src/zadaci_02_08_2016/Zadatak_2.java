package zadaci_02_08_2016;

import java.util.Scanner;

public class Zadatak_2 {

	public static void main(String[] args) {
		/*
		 * Program koji generise odredjen broj nasumicnih pitanja (koliko
		 * korisnik zeli) tipa "5 - 2" i broji koliko je korisnik imao tacnih
		 * ili netacnih odgovora
		 */
		Scanner input = new Scanner(System.in);
		// Unos broja pitanja od strane korisnika
		System.out.println("Unesite broj pitanja koliko zelite: ");
		int numQ = input.nextInt();
		// Pozivanje metode i proslijedjivanje broja pitanja metodi
		pitanja(numQ);

	}

	public static void pitanja(int n) {
		// Postavljamo brojaca za tacne i netacne odgovore
		java.util.Scanner input = new Scanner(System.in);
		int counterT = 0;
		int counterF = 0;
		// Petlja koja generise nasumicna pitanja (broj zavisi od unosa
		// korisnika)
		for (int i = 0; i < n; i++) {
			int numb1 = (int) (Math.random() * 10);
			int numb2 = (int) (Math.random() * 10);
			System.out.println("Koliko je " + numb1 + " - " + numb2 + " ?");
			int sum = input.nextInt();
			// U zavisnosti od tacnosti odgovora povecavamo adekvatan brojac
			if (sum == (numb1 - numb2)) {
				counterT++;
			} else
				counterF++;

		}
		// Ispis
		System.out.println("Broj tacnih odgovora je " + counterT);
		System.out.println("Broj netacnih odgovora je " + counterF);
	}

}
