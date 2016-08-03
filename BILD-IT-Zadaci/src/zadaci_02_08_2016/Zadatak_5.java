package zadaci_02_08_2016;

import java.util.Scanner;

public class Zadatak_5 {

	public static void main(String[] args) {
		/*
		 * Simulacija bacanja novcica Napravicemo metodu koja simulira bacanje
		 * novcica i testira cemo je
		 */

		// Pitamo korisnika koliko puta zeli da se ponovi bacanje novcica
		Scanner input = new Scanner(System.in);
		System.out.println("Koliko puta zelite da bacate novcic");
		int count = input.nextInt();

		// Pozivamo metodu i prosljedjujemo joj od korisnika broj ponavljanja
		simulacija(count);

	}

	public static void simulacija(int count) {
		/*
		 * Oderdimo varijable koje su nam potrebne, pismo nam je 0 a glava 1
		 * tako simuliramo bacanje novcica nasumicno pomocu random metode
		 */
		int broj = (int) (Math.random() * 2);
		int pismo = 0;
		int glava = 0;
		// Petlja koja ce bacati novcic onoliko puta koliko je korisnik unio
		for (int i = 0; i < count; i++) {

			int novcic = (int) (Math.random() * 2);

			if (novcic == 0) {
				pismo++;

			} else if (novcic == 1) {
				glava++;
			}
		}
		// Ispis
		System.out.println("Novcic je pao na pismo " + pismo
				+ " novcic je pa na glavu " + glava);

	}

}
