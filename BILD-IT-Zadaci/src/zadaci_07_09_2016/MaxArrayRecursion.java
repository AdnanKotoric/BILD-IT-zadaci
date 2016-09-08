package zadaci_07_09_2016;

import java.util.InputMismatchException;

public class MaxArrayRecursion {
	public static int i = 0;
	public static int max;

	public static int maxArray(int[] a) {
		if (i == a.length) {
			return max;
		} else {
			// pronalazimo najveci broj u nizu
			if (a[i] > max) {
				// spremamo vrijednost tog broja
				max = a[i];
			}
			// povecavamo indeks za 1
			i++;
			// pozivamo metodu
			return maxArray(a);
		}
	}

	public static void main(String[] args) {
		try (java.util.Scanner input = new java.util.Scanner(System.in)) {
			System.out.println("Unesite niz od 8 brijeva");
			int[] a = new int[8];
			// pomocu petlje spremamo brojeve u niz
			for (int i = 0; i < a.length; i++) {
				a[i] = input.nextInt();
			}
			// ispis brojeva
			System.out.println(maxArray(a));
		} catch (InputMismatchException e) {
			System.out.println("Pogresan unos");
			main(args);
		}
	}
}