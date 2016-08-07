package zadaci_05_08_2016;

import java.util.Scanner;

public class Zadatak_4 {

	public static void main(String[] args) {
		/*
		 * Program koji prima 10 cijelih brojeva te ih ispisuje u obrnutom
		 * redosljedu.
		 */
		Scanner input = new Scanner(System.in);
		// Unos 10 cijeli brojeva od strane korisnika
		System.out.println("Unesite 10 cijelih brojeva: ");
		// Kreiramo niz u koji spremamo unesene brojeve
		int array[] = new int[10];
		// petljom unosimo brojeve u kreirani niz
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		System.out.println("Brojevi u obrnutom redoslijedu: \n");
		// Drugom petljom printamo brojeve niza u obrnutom redosljedu
		for (int j = array.length - 1; j >= 0; j--) {
			System.out.print(array[j] + " ");

		}

	}

}
