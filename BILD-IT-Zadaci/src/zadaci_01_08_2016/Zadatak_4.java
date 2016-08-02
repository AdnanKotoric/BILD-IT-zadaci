package zadaci_01_08_2016;

public class Zadatak_4 {

	public static void main(String[] args) {
		// Generisanje nasumicnih 100 brojeva od 0-9 i prebrojavanje koliko se
		// puta koji broj ponovio

		// Napravimo niz od 100 clanova i drugi niz koji ce da sprema
		// ponavljanje brojeva
		int[] array = new int[100];
		int[] counterList = new int[10];

		// Petlja za generisanje nasumicnih brojeva od 0-9
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 10);
		}

		// Petlje kojima dodajemo brojeve iz prvog niza koji se ponavljaju na
		// odgovarajucim ineksima drugog niza
		for (int i = 0; i < counterList.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (i == array[j]) {
					counterList[i]++;
				}
			}
		}

		// Petlja za ispis broja ponavljanja
		for (int i = 0; i < counterList.length; i++) {
			System.out.println("Broj " + i + " se ponovio " + counterList[i]
					+ " puta.");
		}

	}

}
