package zadaci_24_08_2016;

import java.math.BigDecimal;

public class Zadatak_5 {

	public static void main(String[] args) {
		/*
		 * Find the first ten numbers greater than Long.MAX_VALUE that are
		 * divisible by 5 or 6.
		 */
		// Brojac postavljamo na 0
		int counter = 0;

		// Prvi broj koji se testira za 1 veci od long max value
		BigDecimal numb = new BigDecimal(Long.MAX_VALUE).add(BigDecimal.ONE);

		// Petlja se vrti do 10
		while (counter < 10) {

			// Uslov ako ostatak dijeljenja broja sa 5 ili 6 je nula
			if (numb.remainder(new BigDecimal(5)).equals(BigDecimal.ZERO)
					|| numb.remainder(new BigDecimal(6))
							.equals(BigDecimal.ZERO)) {

				// Povecavamo brojac
				counter++;

				// I ispisujemo broj
				System.out.println(counter + ". broj: BigDecimal" + numb);
			}

			// Broj se povecava za 1 i petlja se ponovo vrti
			numb = numb.add(BigDecimal.ONE);
		}

	}

}
