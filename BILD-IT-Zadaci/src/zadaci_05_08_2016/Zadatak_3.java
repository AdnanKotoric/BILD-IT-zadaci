package zadaci_05_08_2016;

import java.util.Scanner;

public class Zadatak_3 {

	public static void main(String[] args) {

		/*
		 * program koji pita korisnika da unese 2 stringa te ispisuje najveći
		 * zajednički prefix za ta dva stringa, ukoliko isti postoji.
		 */
		Scanner input = new Scanner(System.in);
		// Unos dva stringa od strane korisnika
		System.out.println("Unesite prvi string: ");
		String s1 = input.nextLine();
		System.out.println("Unesite drugi string: ");
		String s2 = input.nextLine();
		input.close();
		// Pozivanje metode i printanje prefixa
		System.out.println("Najveci zajednicki prefiks za dva stringa je "
				+ longestPrefix(s1, s2));
	}

	public static String longestPrefix(String s1, String s2) {
		// trazimo prvo koji je string manji poredimo prvi i drugi string i
		// duzinu manjeg stringa dodjeljujemo varijabli minLength

		int minLength = 0;

		if (s1.length() < s2.length()) {
			minLength = s1.length();
		} else {
			minLength = s2.length();
		}
		// Petljom prolazimo kroz stringove postavljamo uslov koji vrti petlju
		// sve dok se na istim pozicijama dva stringa nalaze isti karakteri ili
		// do kraja manjeg stringa odnosno do minLenght koji ima vrijednost
		// duzine manjeg stringa
		for (int i = 0; i < minLength; i++) {

			if (s1.charAt(i) == s2.charAt(i)) {
				continue;
			} else {
				return s1.substring(0, i);
			}
		}
		return s1.substring(0, minLength);// vracamo dio stringa koji je isti za
											// oba stringa tj prefix

	}
}
