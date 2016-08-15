package mini_2_craps_and_credit_cards;

public class Craps {

	public static void main(String[] args) {
		/*
		 * Game: craps) Craps is a popular dice game played in casinos. Write a
		 * program to play a variation of the game, as follows: Roll two dice.
		 * Each die has six faces representing values 1, 2, ..., and 6, respec-
		 * tively. Check the sum of the two dice. If the sum is 2, 3, or 12
		 * (called craps), you lose; if the sum is 7 or 11 (called natural), you
		 * win; if the sum is another value (i.e., 4, 5, 6, 8, 9, or 10), a
		 * point is established. Continue to roll the dice until either a 7 or
		 * the same point value is rolled. If 7 is rolled, you lose. Otherwise,
		 * you win.
		 */
		int dice = 0;

		// pozivamo metodu koja "baca kocke" ( generise nasumicno dobivene
		// brojeve)
		dice = roll();

		// prvojeravamo dobiveni broj
		switch (dice) {
		case 2:
		case 3:
		case 12:
			System.out.println("Zao nam je, izgubili ste!");// za 2, 3, 12 igrac
															// gubi
			break;
		case 7:
		case 11:
			System.out.println("Pobijedili ste!");// za dobieven 7 ili 11 igrac
													// pobjedjuje
			break;
		default:
			System.out.println("Point je " + dice);// za sve ostale brojeve
													// koje je moguce dobiti
													// postavljamo point za
													// naredno bacanje
			// naredno bacanje
			int next;
			// petlja kojom nastavljamo bacanje
			do {
				next = roll();// poziv metode za bacanje

			} while (!(next == dice || next == 7));// petlja se vrti sve dok ne
													// bacanjem dobijemo 7 ili
													// brojku iz proslih bacanja

			if (next == 7) {
				System.out.println("Zao nam je, izgubili ste!");// ukoliko
																// dobijemo 7
																// ispisujemo da
																// je korisnik
																// izgubio
			} else {
				System.out.println("Cestitamo, pobijedili ste!");// ukoliko
																	// dobije
																	// ponit
																	// koji je
																	// odredjen
																	// korisnik
																	// pobjedjuje
			}

		}
	}

	// metoda za generisanje nasumicno dobivenih brojeva bacanjem kocke
	public static int roll() {
		int dice1 = (int) (Math.random() * 6 + 1);// prva kocka
		int dice2 = (int) (Math.random() * 6 + 1);// druga kocka
		int sum = dice1 + dice2;// sabiramo brojeve koje dobijemo bacanjem obe
								// kocke

		System.out.println("Bacanjem kocki dobili ste " + dice1 + " + " + dice2
				+ " = " + sum);

		return sum;// vracamo sumu dobivenog bacanja

	}

}
