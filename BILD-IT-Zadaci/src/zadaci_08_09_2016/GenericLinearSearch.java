package zadaci_08_09_2016;

import java.util.InputMismatchException;

public class GenericLinearSearch {
	public static <E extends Comparable<E>> int linearSearch(E[] list, E key) {

		for (int i = 0; i < list.length; i++) {
			// usporedjuje key sa brojevima u listi
			if (key.compareTo(list[i]) == 0) {
				// vraca index
				return i;
			}
		}
		// ukoliko se broj ne nalazi u listi
		return -1;
	}

	public static <E> void main(String[] args) {
		try (java.util.Scanner input = new java.util.Scanner(System.in)) {
			// niz cijelih brojeva
			Integer[] list = new Integer[10];
			for (int i = 0; i < list.length; i++) {
				// u niz dodajemo nasumicne brojeve
				list[i] = (int) (Math.random() * 5);
			}
			// unos korisnika
			System.out.println("Unesite broj koji zelite provjeriti");
			Integer key = input.nextInt();
			// ispis vrijednosti koju vrati metoda
			System.out.println(linearSearch(list, key));
			// ispis liste
			for (int i = 0; i < list.length; i++) {
				System.out.print(list[i] + " ");
			}
		} catch (InputMismatchException e) {
			System.out.println("Pogresan unos");
			main(args);
		}
	}

}