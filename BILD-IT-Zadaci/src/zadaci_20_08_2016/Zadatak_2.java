package zadaci_20_08_2016;

import java.util.Scanner;

public class Zadatak_2 {

	public static void main(String[] args) {
		/*
		 * (Strictly identical arrays) The two-dimensional arrays m1 and m2 are
		 * strictly identical if their corresponding elements are equal. Write a
		 * method that returns true if m1 and m2 are strictly identical, using
		 * the following header: public static boolean equals(int[][] m1,
		 * int[][] m2) Write a test program that prompts the user to enter two 3
		 * * 3 arrays of integers and displays whether the two are strictly
		 * identical.
		 */
		Scanner input = new Scanner(System.in);
		// kreiramo dva visedimenzionalna niza 3x3 i uzimamo unos korisnika za
		// elemente oba niza
		System.out.println("Unesite prvu 3x3 matricu");
		int[][] m1 = new int[3][3];
		for (int row = 0; row < m1.length; row++) {
			for (int column = 0; column < m1[row].length; column++) {
				m1[row][column] = input.nextInt();
			}
		}
		System.out.println("Unesite drugu 3x3 matricu");
		int[][] m2 = new int[3][3];

		for (int row2 = 0; row2 < m2.length; row2++) {
			for (int column2 = 0; column2 < m2[row2].length; column2++) {
				m2[row2][column2] = input.nextInt();
			}
		}
		// uslovom regulisemo sta cemo ispisati u konzoli u zavisnosti sto nam
		// vrati metoda za provjeru matrica
		if (equals(m1, m2) == true)// pozivamo metoda unutra if-a
			System.out.println("Matrice su striktno indenticne!");
		else {
			System.out.println("Matrice nisu striktno identicne!");
		}

	}

	// metoda za provjeru da li su dva visedimenzionalna niza striktno identicni
	public static boolean equals(int[][] m1, int[][] m2) {
		// petljom prolzaimo kroz oba niza istovremeno
		for (int row = 0; row < m1.length; row++) {
			for (int column = 0; column < m1.length; column++) {
				// provjeravamo uslovom jesu li svi clanovi na istim pozicijama
				// u oba niza jednaki
				if (m1[row][column] != m2[row][column]) {

					return false;// ukolik nisu vracamo false

				}
			}
		}
		return true;// ukoliko jesu vracamo true

	}

}
