package zadaci_18_08_2016;

public class Zadatak_1 {
	public static void main(String[] args) {
		/*
		 * (Count single digits) Write a program that generates 100 random
		 * integers between 0 and 9 and displays the count for each number.
		 * (Hint: Use an array of ten integers, say counts , to store the counts
		 * for the number of 0s, 1s, . . . , 9s.
		 */
		
		// kreiramo niz za 10 elemenata
		int[] counts = new int[10];

		// petljom generisemo stotinu nasumicnih brojeva
		for (int i = 0; i < 100; i++) {
			// posto niz ima indekse od 0 - 9 za svaki generisan broj na
			// adekvatnom indeksu povecavamo vrijednost za jedan i tako
			// prebrojavamo koliko se puta koji broj ponovio
			counts[(int) (Math.random() * 10)]++;
		}
		// ispisujemo indekse kao brojeve koje smo generisali od 0-9 i
		// vrijednost na
		// ideksima kao broj koliko se puta ponovio
		for (int i = 0; i < counts.length; i++) {
			System.out.println("Broj " + i + " se pojavljuje " + counts[i]
					+ " puta.");

		}

	}

}
