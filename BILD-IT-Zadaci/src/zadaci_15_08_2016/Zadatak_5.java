package zadaci_15_08_2016;

import java.util.Scanner;

public class Zadatak_5 {

	public static void main(String[] args) {
		/*
		 * Napisati metodu koja ispisuje n x n matricu koristeći se sljedećim
		 * headerom: public static void printMatrix(int n). Svaki element u
		 * matrici je ili 0 ili 1, nasumično generisana. Napisati test program
		 * koji pita korisnika da unese broj n te mu ispiše n x n matricu u
		 * konzoli.
		 */

		Scanner input = new Scanner(System.in);
		// unos korisnika za velicinu matrice
		System.out.println("Unesite broj n za matricu: ");
		int n = input.nextInt();
		// pozivamo metodu za ispis matrice i prosljedjujemo joj unos korisnika
		printMatrix(n);
		input.close();

	}

	// metoda za ispis matrice n x n
	public static void printMatrix(int n) {
		// kreiramo dvodimenzionalni niz, od korisnika smo unzeli velicinu i s
		// tim odredjujemo koliko ce imati kolona i redova
		int[][] matrix = new int[n][n];
		// petljom prolazimo kroz sve kolone i redove i nausmicnim generisanjem
		// popunjavamo matricu sa 0 i 1.
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				matrix[row][column] = (int) (Math.random() * 2);

			}

		}
		//drugom petljom prolazimo kroz dvodimenzionalni niz i ispisujemo n x n matricu
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				System.out.print(matrix[row][column] + " ");
			}
			System.out.println();

		}

	}

}
