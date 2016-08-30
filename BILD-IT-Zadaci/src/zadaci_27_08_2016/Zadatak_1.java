package zadaci_27_08_2016;

import java.util.ArrayList;

public class Zadatak_1 {

	public static int count(int[] n) {
		int counter = 0;
		// petljom brojimo 1
		for (int i = 0; i < n.length; i++) {
			if (n[i] == 1) {
				counter++;
			}
		}
		return counter;
	}

	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);
		int max1 = 0;
		int max2 = 0;
		System.out.println("Unesite velicinu matrice: ");
		int lenght = input.nextInt();
		// matrica sa duzinama
		int[][] matrix = new int[lenght][lenght];
		// reverse matrica
		int[][] matrix2 = new int[lenght][lenght];
		// u indekse spremamo pozicije
		int[] array = new int[matrix.length];
		int[] array2 = new int[matrix2.length];

		// lista za spremanje reda i kolone
		ArrayList<Integer> row = new ArrayList<>();
		ArrayList<Integer> column = new ArrayList<>();
		// nasumicno 0 i 1 u matrici
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				int n = (int) (Math.random() * 2);
				matrix[i][j] = n;
			}
		}
		// ispis matrice
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");

			}
			System.out.println();
		}
		// okrenuta matrica
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix2[j][i] = matrix[i][j];
			}
		}
		// sprema prebrojanu vrijednost
		for (int i = 0; i < matrix.length; i++) {
			array[i] = count(matrix[i]);
			array2[i] = count(matrix2[i]);
		}
		// red i kolona sa najvise 1
		for (int i = 0; i < array.length; i++) {
			while (max1 < array[i]) {
				max1 = array[i];
			}
			while (max2 < array2[i]) {
				max2 = array2[i];
			}
		}
		// dodajemo u listu pozicije
		for (int i = 0; i < array.length; i++) {

			if (max1 == array[i]) {
				row.add(i);
			}
			if (max2 == array2[i]) {
				column.add(i);
			}
		}
		input.close();
		// ispis
		System.out.println("Largest row index:");
		System.out.println(row.toString());
		System.out.println("Largest column index:");
		System.out.println(column.toString());

	}
}
