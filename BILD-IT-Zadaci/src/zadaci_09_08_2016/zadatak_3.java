package zadaci_09_08_2016;

public class zadatak_3 {

	public static void main(String[] args) {
		/*
		 * Program koji ispisuje sve brojeve, od 100 do 1000, 10 brojeva po
		 * liniji, koji su djeljivi i sa 5 i sa 6
		 */
		// postavljamo brojac na 0
		int counter = 0;
		// Petlja kojom trazimo sve brojeve od 100 do 1000 djeljive sa 5 i 6
		for (int i = 100; i < 1000; i++) {
			// uslov ukoliko je broj djeljiv sa 5 i sa 6, povecavamo brojac za
			// jedan, i printamo broj
			if ((i % 5 == 0) && (i % 6 == 0)) {
				counter++;
				System.out.print(i + " ");
				// postavljamo uslov ukoliko brojac dodje do 10 prebacujemo
				// ispis u novi red a brojac resetujemo na 0
				if (counter == 10) {
					System.out.println();
					counter = 0;
				}
			}
		}

	}

}
