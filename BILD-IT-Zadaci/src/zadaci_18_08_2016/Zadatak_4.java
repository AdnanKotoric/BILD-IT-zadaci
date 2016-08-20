package zadaci_18_08_2016;

import java.util.Scanner;

public class Zadatak_4 {

	public static void main(String[] args) {
		/*
		 * (Sum elements column by column) Write a method that returns the sum
		 * of all the elements in a specified column in a matrix using the
		 * following header: public static double sumColumn(double[][] m, int
		 * columnIndex) ✓ Check Point306 Chapter 8 Multidimensional Arrays Write
		 * a test program that reads a 3-by-4 matrix and displays the sum of
		 * each column.
		 */
		// kreiramo dvodimenzionalni niz 3 puta 4 velicine
		double[][] matrix = new double[3][4];

		Scanner input = new Scanner(System.in);
		// od korisnika uzimamo unos, i pomocu petlje unosimo brojeve na
		// adekvatna mjesta kolone i reda
		System.out.println("Unesite matricu velicine 3 sa 4 red po red: ");
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				matrix[row][column] = input.nextDouble();
			}
		}
		// petljom prolazimo kroz kolone i pozivamo za svaku kolone metodu koja
		// sabire brojeve za datu kolonu
		for (int column = 0; column < matrix[0].length; column++) {
			System.out.println("Zbir brojeva u koloni " + column + " je "
					+ sumColumn(matrix, column));// ujedno i ispisujemo zbir za
													// datu kolonu
		}
		input.close();

	}

	// metoda kojom sabiremo brojeve po kolonama
	public static double sumColumn(double[][] m, int columnIndex) {

		double sum = 0;
		// petljom prolazimo kroz kolone i sabiremo brojeve unutar kolone koja
		// nam je prosljedjena
		for (int row = 0; row < m.length; row++) {
			sum += m[row][columnIndex];
		}
		return sum;// vracamo sumu date kolone

	}

}
