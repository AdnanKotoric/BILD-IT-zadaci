package zadaci_17_08_2016;

import java.util.Scanner;

public class Zadatak_4 {

	public static void main(String[] args) {
		/*
		 * Napisati metodu sa sljedećim headerom: public static String
		 * format(int number, int width) koja vraća string broja sa prefiksom od
		 * jedne ili više nula. Veličina stringa je width argument. Na primjer,
		 * ukoliko pozovemo metodu format(34, 4) metoda vraća 0034, ukoliko
		 * pozovemo format(34, 5) metoda vraća 00034. Ukoliko je uneseni broj
		 * veći nego width argument, metoda vraća samo string broja. Npr.
		 * ukoliko pozovemo format(34, 1) metoda vraća 34.
		 */

		Scanner input = new Scanner(System.in);
		// Unos korisnika
		System.out.println("Unesite broj: ");
		int number = input.nextInt();
		System.out.println("Unesite duzinu broja: ");
		int width = input.nextInt();
		// pozivamo metodu i prosljedjujemo joj broj i duzina broja
		System.out.println(format(number, width));
		input.close();
	}

	public static String format(int number, int width) {
		// formatiramo string pocovu metode format vraca string u zadanom
		// formatu
		String format = String.format("%0" + width + "d", number);// postavljamo
																	// da printa
																	// nula za
																	// duzinu
																	// koju smo
																	// uzeli od
																	// korisnika
																	// uzimajuci
																	// u obzir i
																	// broj koji
																	// je unesen

		return format;
	}

}
