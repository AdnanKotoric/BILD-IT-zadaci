package zadaci_19_08_2016;

public class Zadatak_5 {

	public static void main(String[] args) {
		/*
		 * *8.22 (Even number of 1s) Write a program that generates a 6-by-6
		 * two-dimensional matrix filled with 0s and 1s, displays the matrix,
		 * and checks if every row and every column have an even number of 1s.
		 */

		// kreiramo 2D niz sa 6 redova i 6 kolona
		int array[][] = new int[6][6];
		// pozivamo metode
		fillArray(array);// za nasumicno popunjavanje 0 i 1
		displayArray(array);// ispis metode
		calRow(array);// pregled jedinica po redovima
		calCol(array);// pregled jedinica po kolonama
	}

	public static void calCol(int array[][]) {

		int intSum = 0;
		// petljom prolazimo kroz kolone i sabiremo sve clanove kolone
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				intSum += array[j][i];
			}
			// ukoliko je rezultat nula kolona nema jedinica
			if (intSum == 0) {
				System.out.println("U koloni nema jedinica!");
				continue;
			}
			// ukoliko je suma brojeva kolone djeljiva sa dva paran je broj
			// jedinica u suprotnom ispisujemo da je neparan broj jedinica
			if (intSum % 2 == 0) {
				System.out.println("Kolona " + i + " ima paran broj jedinica.");
			} else {
				System.out.println("Kolona " + i
						+ " ima neparan broj jedinica.");
			}
			intSum = 0;// resetujemo sumu na 0 za sljedecu kolonu
		}

	}

	public static void calRow(int array[][]) {

		int intSum = 0;
		// petljom prolazimo kroz redove i sabiremo elemente svakog reda
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				intSum += array[i][j];
			}// ukoliko je suma elemenata 0 ispisujemo da nema jedinica
			if (intSum == 0) {
				System.out.println("U redu nema jedinica!");
				continue;
			}
			// za sve ostale sume provjeravamo da li je djeljiva sa 2 i shodno
			// tome ispisujemo je li paran ili neparan broj jedinica
			if (intSum % 2 == 0) {
				System.out.println("Red " + i + " ima paran broj jedinica.");
			} else {
				System.out.println("Red " + i + " ima neparan broj jedinica.");
			}
			intSum = 0;// sumu resetujemo na 0 za sljedeci red

		}

	}

	public static void fillArray(int array[][]) {
		// petljom popunjavamo 0 i 1 nasumicno citav 2D niz
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[1].length; j++) {
				array[j][i] = (int) (Math.random() * 2);
			}

		}
	}

	public static void displayArray(int array[][]) {
		// ispisujemo niz pomocu petlje radi pregleda
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j]);
			}

			System.out.println("");
		}

	}

}
