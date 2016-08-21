package zadaci_19_08_2016;

public class Zadatak_3 {

	public static void main(String[] args) {
		/*
		 * *8.10 (Largest row and column) Write a program that randomly fills in
		 * 0s and 1s into a 4-by-4 matrix, prints the matrix, and finds the
		 * first row and column with the most 1s. Here is a sample run of the
		 * program: 0011 0011 1101 1010 The largest row index: 2 The largest
		 * column index: 2
		 */
		// kreiramo 2D niz 4x4
		int array[][] = new int[4][4];
		// pozivamo metode za
		fillArray(array);// nasumicno popunjavanje 1 i 0
		displayArray(array);// ispis niza
		calRow(array);// pregled redova
		calCol(array);// pregled kolona
	}

	public static void calCol(int array[][]) {

		int intSum = -1;
		int tempSum = 0;
		int numCol = 0;
		// petljom prolazimo kroz kolone niza i sabiremo elemente kolone jer
		// kolona sa najvise jedinica ce imati i najveci zbir
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				tempSum += array[j][i];
				// ukoliko je suma elemenata veca od prethodne vrijednosti
				// postavljamo je kao najvecu sumu a broj kolone kao kolonu sa
				// najvise 1
				if (tempSum > intSum) {
					intSum = tempSum;
					numCol = i;

				} else {
					continue;// ukoliko naidjemo na kolonu koja ima isti broj
								// jedinica
								// kako bi nam ostao sacuvan broj prve
								// kolone sa najvise jedinica
				}
			}
			tempSum = 0;// resetujemo trenutnu sumu za sljedecu kolonu

		}
		System.out.println("Broj kolone sa najvise jedinica je: " + numCol);

	}

	public static void calRow(int array[][]) {

		int intSum = 0;
		int tempSum = 0;
		int numRow = 0;
		// petljom prolazimo kroz redove niza i sabiremo elemente reda jer
		// red sa najvise jedinica ce imati i najveci zbir
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				tempSum += array[i][j];
				// ukoliko je suma elemenata veca od prethodne vrijednosti
				// postavljamo je kao najvecu sumu a broj reda kao red sa
				// najvise 1
				if (tempSum > intSum) {
					intSum = tempSum;
					numRow = i;

				} else {
					continue;// ukoliko naidjemo na red koji ima isti broj
								// jedinica
					// kako bi nam ostao sacuvan broj prvog
					// reda sa najvise jedinica
				}
			}
			tempSum = 0;// resetujemo trenutnu sumu za sljedeci red

		}
		System.out.println("Broj reda sa najvise jedinica je: " + numRow);

	}

	public static void fillArray(int array[][]) {
		// petljom popunjavamo nasumicno niz sa 0 i 1
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[1].length; j++) {
				array[j][i] = (int) (Math.random() * 2);
			}

		}
	}

	public static void displayArray(int array[][]) {
		// ispisujemo popunjen niz
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j]);
			}

			System.out.println("");
		}

	}
}