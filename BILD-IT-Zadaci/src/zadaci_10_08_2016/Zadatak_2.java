package zadaci_10_08_2016;

public class Zadatak_2 {

	public static void main(String[] args) {
		/*
		 * Program koji ispisuje sve twin prime brojeve manje od 10000, 10
		 * parova po liniji. ( Twin prime brojevi su par prostih brojeva koji se
		 * razlikuju za 2. Na primjer, brojevi 3 i 5 su twin primes, brojevi 5 i
		 * 7 i 11 i 13 su također twin primes. )
		 */
		// setujemo brojac na 0
		int counter = 0;
		// petljom provjeravamo sve brojeve manje od 10.000, unutar petlje
		// pozivamo metodu koja provjerava je li broj prost

		for (int i = 2; i < 10000; i++) {
			// uslovom provjeravamo proste brojeve koji se razlikuju za 2
			if (Prime(i) && Prime(i + 2)) {
				// ukoliko je uslov ispunjen printamo taj par twin prime brojeva
				System.out.print(("(" + i + ", " + (i + 2) + ")"));
				counter++;// povecavamo brojac
			}
			// kada brojac dosegne 10, prebacujemo u novi red ispis twin brojeva
			// a brojac resetujemo na 0
			if (counter == 10) {
				System.out.println();
				counter = 0;
			}
		}
	}

	// metoda za provjeru prostih brojeva
	public static boolean Prime(int numb) {

		// petlja koja prolazi sve brojeve do datog broja i koja provejrava da
		// li je broj prost
		for (int n = 2; n < numb; n++) {
			// uslov ukoliko je broj djeljiv sa nekim drugim brojem osim sa 1 i
			// sam sa sobom vracamo false
			if (numb % n == 0) {
				return false;
			}

		}
		// ukoliko uslov nije tacan vracamo true tj da je broj prost
		return true;
	}

}
