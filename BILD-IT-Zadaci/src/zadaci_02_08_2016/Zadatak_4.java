package zadaci_02_08_2016;

import java.util.Scanner;

public class Zadatak_4 {

	public static void main(String[] args) {
		/*
		 * Metoda koja nam ispisuje matricu sa n redova i kolona u kojoj su samo
		 * 0 i 1
		 */
		Scanner input = new Scanner(System.in);

		// Pitamo korisnika koliko zeli redova i kolona i pozivamo metodu kojoj
		// to prosljedjuemo
		System.out
				.println("Unesite koliko ce imati redova i kolona vasa matrica: ");
		int numb = input.nextInt();
		Matrix(numb);

	}

	public static void Matrix(int numb) {
		// Pravimo dvodimenzionalni niz
		int[][] matrix = new int[numb][numb];

		// Petljom unosimo nule i jedinice u matricu i printamo je
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				matrix[row][column] = (int) (Math.random() * 2);
				System.out.print(matrix[row][column] + " ");
			}
			System.out.println();
		}

	}

}
