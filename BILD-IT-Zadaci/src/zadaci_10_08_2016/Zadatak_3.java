package zadaci_10_08_2016;

public class Zadatak_3 {

	public static void main(String[] args) {
		/*
		 * Program koji ispisuje sve moguće kombinacije za biranje dva broja u
		 * rasponu od 1 do 7. Također, program ispisuje broj svih mogućih
		 * kombinacija. Dakle, program treba da ispiše sve moguće parove brojeva
		 * u datom rasponu, krenuvši sa 1 2, 1 3, 1 4, itd. Broj mogućih
		 * kombinacija je 21.
		 */
		// setujemo brojac za moguce kombinacije na 0
		int counter = 0;
		// ugnijezdenom petljom, tj petljom unutar petlje (prva petlja krece od
		// 1 druga od elementa za 1 vecim nego u prvoj petlji) ispisujemo svaki
		// bro od 1 do 7 sa mogucim parom u tom rasponu
		for (int i = 1; i <= 7; i++) {
			for (int j = i + 1; j <= 7; j++) {

				System.out.println(i + " " + j);
				counter++;// povecavamo brojac pri svakom ispisu
			}

		}
		// ispisujemo broj mogucih kombinacija koje je brojac zabiljezio
		System.out.println("Broj mogucih kombinacije je " + counter);

	}

}
