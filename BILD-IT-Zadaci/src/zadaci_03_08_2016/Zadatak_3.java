package zadaci_03_08_2016;

import java.util.Scanner;

public class Zadatak_3 {

	public static void main(String[] args) {
		/*
		 * Program koji pita korisnika da unese dva niza cijelih brojeva te
		 * provjerava da li su striktno identični.
		 */
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite duzinu prvog niza: ");
		int size = input.nextInt();

		System.out.println("Unesite brojeve u prvi niz: ");
		int[] list1 = new int[size];
		for (int i = 0; i < size; i++)
			list1[i] = input.nextInt();

		System.out.print("Unesite duzinu drugog niza: ");
		size = input.nextInt();

		System.out.println("Unesite brojeve u drugi niz: ");
		int[] list2 = new int[size];
		for (int i = 0; i < size; i++)
			list2[i] = input.nextInt();

		if (equals(list1, list2)) {
			System.out.println("Nizovi su striktno identicni");
		} else {
			System.out.println("Nizovi nisu striktno identicni");
		}

	}

	public static boolean equals(int[] list1, int[] list2) {
		// Postavljamo uslov ukoliko nizovi nisu jednake duzine da vrati false
		if (list1.length != list2.length)
			return false;
		// Petljom prolazimo kroz oba niza i provjeravamo da li se na istim
		// pozicijama nalaze identicni elementi
		for (int i = 0; i < list1.length; i++) {
			if (list1[i] != list2[i])
				return false;
		}

		return true;
	}

}
