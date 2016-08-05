package zadaci_03_08_2016;

import java.util.Scanner;

public class Zadatak_4 {

	public static void main(String[] args) {
		/*
		 * program koji pita korisnika da unese 2D niz te mu ispisuje lokaciju
		 * najvećeg elementa u nizu.
		 */
		Scanner input = new Scanner(System.in);
		// trazimo od korisnika unos broja redova i kolona
		System.out.println("Unesite broj redova i broj kolona u 2D niza: ");
		int r = input.nextInt();
		int c = input.nextInt();
		// Kreiramo 2D niz i korisnik unosi u njega elemnte
		double matrix[][] = new double[r][c];

		System.out.println("Unesite brojeve u niz: ");
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				matrix[row][column] = input.nextInt();
			}
		}
		// printamo datu lokaciju najveceg elementa
		int location[] = locateLargest(matrix);
		System.out.print("Najveci element se nalazi na poziciji: ");
		for (int i = 0; i < location.length; i++) {
			System.out.print(location[i] + " ");
		}
		System.out.print(" u 2D nizu");
		System.out.println();
		// printamo 2D niz kako bi korisnik vidio da je najveci element na datoj
		// lokaciji

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static int[] locateLargest(double[][] a) {
		// napravimo niz u koji cemo spremiti lokaciju najveceg elemnta 2D niza
		// i postavljamo prvi elemenat niza kao trenutni najveci
		int[] location = { 0, 0 };
		double max = a[0][0];

		// Petljom prolazimo kroz niz i vrijednost sljedeceg najveceg elementa
		// dodjeljujemo varijabli max
		for (int row = 0; row < a.length; row++) {
			for (int column = 0; column < a[row].length; column++) {
				if (max < a[row][column]) {
					max = a[row][column];
					location[0] = row;
					location[1] = column;// kada pronadjemo najveci elemnt
											// ujedno njegovu lokaciju spremamo
											// u niz location
				}
			}
		}
		//vracamo niz koji sadrzi lokaciju najveceg elementa
		return location;
	}
}
