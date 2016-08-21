package zadaci_19_08_2016;

import java.util.Scanner;

public class Zadatak_2 {

	public static void main(String[] args) {
		/*
		 * **8.6 (Algebra: multiply two matrices) Write a method to multiply two
		 * matrices. The header of the method is:
		 * 
		 * public static double[][] multiplyMatrix(double[][] a, double[][] b)
		 * 
		 * To multiply matrix a by matrix b, the number of columns in a must be
		 * the same as the number of rows in b, and the two matrices must have
		 * elements of the same or compatible types. Let c be the result of the
		 * multiplication. Assume the column size of matrix a is n. Each element
		 * cij=ai1×b1j+ai2×b2j+...+ain×bnjcij=ai1×b1j+ai2×b2j+...+ain×bnj.
		 */
		// kreiramo 3 2D niza, dva za unos matrica, jedan za rezultat
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

		System.out.print("Unesite drugu matricu:");
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[0].length; j++) {
				b[i][j] = input.nextDouble();
			}

		}
		// pozivamo metodu za mnozenje prosljedjujemo matrice koje je unio
		// korisnik
		result = multiplyMatrix(a, b);

		// ispis matrica i rezultata
		System.out.println("The matrices are added as follows");
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[0].length; j++) {

				System.out.print(a[i][j] + " ");
				if (i == 1 && j == 2) {
					System.out.print("  *  ");
				} else {
					System.out.print("     ");
				}
			}
			for (int j = 0; j < result[0].length; j++) {
				System.out.print(b[i][j] + " ");
				if (i == 1 && j == 2) {
					System.out.print(" = ");
				} else {
					System.out.print("   ");
				}
			}
			for (int j = 0; j < result[0].length; j++) {
				System.out.printf("%.1f ", result[i][j]);
			}
			System.out.println();
		}
		input.close();
	}

	public static double[][] multiplyMatrix(double[][] a, double[][] b) {

		// kreiramo novu matricu
		double[][] result = new double[a.length][b[0].length];
		// petljom mnozimo clanove dviju matrica po zadanoj formuli
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[0].length; j++) {
				for (int n = 0; n < a[0].length; n++) {
					result[i][j] += a[i][n] * b[n][j];
				}

			}

		}

		return result;// vracamo novu matricu kao rezultat
	}
}