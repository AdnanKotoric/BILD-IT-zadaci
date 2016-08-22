package zadaci_20_08_2016;

import java.util.Scanner;

public class Zadatak_1 {

	public static void main(String[] args) {
		/*
		 * (Row sorting) Implement the following method to sort the rows in a
		 * two- dimensional array. A new array is returned and the original
		 * array is intact. public static double[][] sortRows(double[][] m)
		 * Write a test program that prompts the user to enter a 3 * 3 matrix of
		 * double values and displays a new row-sorted matrix.
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite elemente matrice: ");
		// kreiramo novi 2D niz 3x3 i uzimamo unos korisnika
		double[][] array = new double[3][3];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = input.nextDouble();
			}
		}
		// pozivamo metodu za sortiranje i spremamo sortiran niz u niz sorted
		// nakon sto ga metoda vrati
		double[][] sorted = sortRows(array);
		System.out.println("Matrica koju ste unijeli: ");
		printMatrix(array);// poziv metode za ispis niza, prosljedjujemo unesenu
							// matricu
		System.out.println("Sortirana matrica: ");
		printMatrix(sorted);// poziv metode za ispis niza, prosljedjujemo
							// sortiranu matricu
	}

	public static double[][] sortRows(double[][] m) {
		// kreiramo novi 2D niz
		double[][] result = new double[m.length][m[0].length];
		// petljom uzimamo svaki red i prosljedjujemo ga sljedecoj metodi kao
		// jednodimenzionalan niz
		for (int i = 0; i < result.length; i++) {
			result[i] = selectionSort(m[i]);// poziv metode za sortiranje reda
		}
		return result;
	}

	public static double[] selectionSort(double[] row) {
		// kopiramo prosljedjen niz pomocu clone metode
		double[] rows = row.clone();
		// petljom prolazimo kroz niz
		for (int i = 0; i < rows.length - 1; i++) {
			// trazimo trenutni najmanji indeks
			double currentMin = rows[i];
			int currentMinIndex = i;

			for (int j = i + 1; j < rows.length; j++) {
				if (currentMin > rows[j]) {
					currentMin = rows[j];
					currentMinIndex = j;
				}
			}

			// mijenjamo mjesta za trenutni najmanji clan ako je potrebno
			if (currentMinIndex != i) {
				rows[currentMinIndex] = rows[i];
				rows[i] = currentMin;
			}
		}
		return rows;// vracamo niz
	}

	// metoda za printanje matrice
	public static void printMatrix(double[][] list) {
		// petljom prolazimo kroz matricu i printamo njene elemente
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list.length; j++) {
				System.out.print(list[i][j] + " ");
			}
			System.out.println();
		}

	}

}
