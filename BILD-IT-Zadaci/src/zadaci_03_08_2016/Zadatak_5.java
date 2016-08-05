package zadaci_03_08_2016;

import java.util.Arrays;
import java.util.Scanner;

public class Zadatak_5 {

	public static void main(String[] args) {
		/*
		 * program koji pita korisnika da unese matricu velicine koju zeli te mu
		 * ispisuje na konzoli matricu sa sortiranim redovima - od najmanjeg
		 * broja do najvećeg.
		 */
		Scanner input = new Scanner(System.in);
		// trazimo od korisnika da nam unese koliku matricu zeli
		System.out.println("Unesite broj redova i kolona 2D niza: ");
		int r = input.nextInt();
		int c = input.nextInt();
		double matrix[][] = new double[r][c];
		// korisnik popunjava 2D niz sa elementima
		System.out.println("Unesite brojeve u niz: ");
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				matrix[row][column] = input.nextInt();
			}
		}
		// printamo niz koji je korisnik unio radi usporedbe
		System.out.println("Niz koji ste unijeli ");
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				System.out.print(matrix[row][column] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out
				.println("Sortiran niz po redovima(od najmanjeg do najveceg elementa) ");
		// pozivamo metodu koja sortira niz i printamo sortiran niz po redovima
		// od najmanjeg do najveceg elementa
		double sorted[][] = sortRows(matrix);
		for (int i = 0; i < sorted.length; i++) {
			for (int j = 0; j < sorted[i].length; j++) {
				System.out.print(sorted[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static double[][] sortRows(double[][] array) {
		// petljom prolazimo kroz redove koja svaki red tretira kao zaseban niz
		for (double niz[] : array) {
			// pomocu metode sort sortiramo elemente u redovima(koji su sada
			// jednodimenzionalni nizovi)
			Arrays.sort(niz);

		}
		// vracamo sortiran niz
		return array;
	}
}