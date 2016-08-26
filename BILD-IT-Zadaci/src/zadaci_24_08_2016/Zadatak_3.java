package zadaci_24_08_2016;

import java.math.BigInteger;

public class Zadatak_3 {

	public static void main(String[] args) {
		/*
		 * (Large prime numbers) Write a program that finds five prime numbers
		 * larger than Long.MAX_VALUE
		 */

		// koristimo BigInteger klasu
		BigInteger numb = new BigInteger(Long.MAX_VALUE + "");
		int counter = 0;

		System.out.println("Prime brojevi su:\n");
		// Koristuimo metode BigInteger klase isProbablyPRime za proveru prostih
		// brojeva
		while (counter < 5) {
			// ako jeste, ispisuje nam broj, povecava brojac, te povecava broj
			if (numb.isProbablePrime(1) == true) {
				System.out.println(counter + 1 + ". " + numb);
				counter++;
				numb = numb.add(BigInteger.ONE);
			}
			// ako nije prime, povecavamo broj dok ga ne nadje
			numb = numb.add(BigInteger.ONE);
		}

	}

}
