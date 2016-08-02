package zadaci_01_08_2016;

import java.util.Scanner;

public class Zadatak_5 {

	public static void main(String[] args) {
		/*
		 * Pronalazenje najveceg broja koji je unesen od strane korisnika i
		 * brojanje koliko je puta unesen taj broj
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("Unesite broj (0 prekida unos): ");
		// varijable broj, brojac, i najveci broj
		int numb = 1;
		int counter = 1;
		int maxNumb = 0;

		/*
		 * petljom provjeravamo svaki broj koji korisnik unese, nula prekida
		 * unos najveci unesen broj dodjeljujemo varijabli maxNumb i povecamo
		 * brojac svaki puta kada se ponovi taj broj
		 */
		while (numb != 0) {
			numb = input.nextInt();

			if (numb > maxNumb) {
				maxNumb = numb;
				counter = 0;

			}
			if (numb == maxNumb) {
				counter++;
			}

		}
		input.close();
		// ispis najveceg broja i koliko se puta ponovio
		System.out.println("Najveci broj koji ste unijeli je: " + maxNumb
				+ " i ponovio se " + counter + " puta.");

	}

}
