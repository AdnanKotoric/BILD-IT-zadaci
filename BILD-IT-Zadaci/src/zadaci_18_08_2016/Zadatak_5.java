package zadaci_18_08_2016;

import java.util.Scanner;

public class Zadatak_5 {

	public static void main(String[] args) {
		/*
		 * (Algebra: add two matrices) Write a method to add two matrices. The
		 * header of the method is as follows: public static double[][]
		 * addMatrix(double[][] a, double[][] b)Programming Exercises 307 In
		 * order to be added, the two matrices must have the same dimensions and
		 * the same or compatible types of elements. Let c be the resulting
		 * matrix. Write a test program that prompts the user to enter two 3 * 3
		 * matrices and displays their sum.
		 */
		// kreiramo 3 dvodimenzionalna niza dva za unos korisnika i jedan u koji
		// cemo spremiti zbir prve dvije matrice
		double[][] a = new double[3][3];
		double[][] b = new double[3][3];
		double[][] result;

		Scanner input = new Scanner(System.in);
		// unos korisnika za dvije matrice
		System.out.print("Unesite prvu matricu:");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				a[i][j] = input.nextDouble();
			}

		}

		System.out.print("Unesite drugu matricu: ");
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				b[i][j] = input.nextDouble();
			}

		}
		// pozivamo metodu koja sabire matrice i spremamo je u matricu result
		// koju smo prethodno kreirali
		result = addMatrix(a, b);

		// Ispisujemo petljama matrice koje je korisnik unio
		System.out.println("Zbira matrica: ");
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[0].length; j++) {

				System.out.print(a[i][j] + " ");
				//uslovom postavljamo gdje ce biti isprintan znak +
				if (i == 1 && j == 2) {
					System.out.print(" + ");
				} else {
					System.out.print("  ");
				}
			}
			for (int j = 0; j < result[0].length; j++) {
				System.out.print(b[i][j] + " ");
				//uslovom opet regulisemo da nam na sredini matrica isprinta sada znak jednakosti =
				if (i == 1 && j == 2) {
					System.out.print(" = ");
				} else {
					System.out.print("  ");
				}
			}
			//ispsujemo matricu koja je zbir prve dvije
			for (int j = 0; j < result[0].length; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}

	}

	// metoda koja sabire dvije matrice
	public static double[][] addMatrix(double[][] a, double[][] b) {

		// kreiramo dvodimenzionalnu matricu za rezultat sabiranja
		double[][] result = new double[3][3];
		// petljom prolazimo kroz dvije matrice koje smo proslijedili i sabiramo
		// broj u istom redu i istoj koloni(broj na istoj poziciji npr. red 0 i
		// kolona 0) i dodajemo ga na isto mjesto u
		// matricu za rezultat
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[0].length; j++) {
				result[i][j] = a[i][j] + b[i][j];
			}

		}

		return result;//vracamo dvodimenzionalni niz koji je zbir prve dvi matrice
	}

}
