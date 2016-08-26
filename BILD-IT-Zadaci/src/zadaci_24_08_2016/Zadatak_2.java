package zadaci_24_08_2016;

import java.math.BigInteger;

public class Zadatak_2 {

	public static void main(String[] args) {
		/*
		 * Find the first ten square numbers that are greater than
		 * Long.MAX_VALUE. A square number is a number in the form of n2 . For
		 * example, 4, 9, and 16 are square numbers. Find an efficient approach
		 * to run your program fast. Opet mi malo nejasno al haj
		 */
		long squareMax = (long) (Math.ceil(Math.sqrt(Long.MAX_VALUE)));

		BigInteger numb = new BigInteger(squareMax + "");
		BigInteger square;

		int counter = 0;
		System.out
				.println("Brojevi koji, kada se kvadriraju, su veci od Long.MAX_VALUE\n");
		while (counter != 10) {
			// nadjemo kvadrat broja
			square = numb.multiply(numb);
			// ispisujemo broj i kvadrat
			System.out.println(numb + " kad se kvadrira: " + square);
			// povecavamo za 1 broj
			numb = numb.add(BigInteger.ONE);
			// te povecavamo brojac za 1
			counter++;
		}

	}

}
