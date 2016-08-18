package zadaci_16_08_2016;

import java.util.Scanner;

public class Zadatak_2 {

	public static void main(String[] args) {
		/*
		 * program koji pita korisnika da unese neki string te mu ispisuje
		 * dužinu tog stringa kao i prvo slovo stringa.
		 */
		Scanner input = new Scanner(System.in);
		// Unos korisnika za string
		System.out.println("Unesite string: ");
		String s = input.nextLine();
		// ispisujemo duzinu pomocu lenght metode i prvo slovo pomocu charAt
		System.out.println("Duzina stringa je " + s.length()
				+ " karaktera, a prvo slovo stringa je " + s.charAt(0));
		input.close();

	}

}
