package zadaci_08_09_2016;

import java.util.Arrays;
import java.util.InputMismatchException;

public class BinarySearchArrayE {
	public static <E extends Comparable<E>> int binarySearch(E[] list, E key) {
		// sortiramo listu
		Arrays.sort(list);
		// ispis liste
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
		// pretrazujemo listu
		int search = Arrays.binarySearch(list, key);
		// ukoliko pronadje broj vraca index broja, u suprotnom vraca -1
		return search;
	}

	public static void main(String[] args) {
		try (java.util.Scanner input = new java.util.Scanner(System.in)) {
			// niz cijelih brojeva
			Integer[] list = { 6, 77, 4, 23, 2, 65, 8, 9, 43 };
			// unos korisnika
			System.out.println("Unesite broj koji zelite provjeriti");
			Integer key = input.nextInt();
			// ispis vrijednosti koju nam vrati metoda
			System.out.println("Uneseni broj se nalazi na indexu: "
					+ binarySearch(list, key));
		} catch (InputMismatchException e) {
			System.out.println("Pogresan unos");
			main(args);
		}
	}

}