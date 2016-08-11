package zadaci_10_08_2016;

import java.util.Scanner;

public class Zadatak_5 {

	public static void main(String[] args) {
		/*
		 * Program koji pita korisnika da unese dva stringa te provjerava i
		 * ispisuje da li je drugi string substring prvog stringa. Na primjer,
		 * ukoliko korisnik unese ABCD kao prvi string a BC kao drugi string
		 * program mu ispisuje da je BC substring ABCD stringa.
		 */
		Scanner input = new Scanner(System.in);
		// unos korisika dva stringa koja cemo provjeravati
		System.out.println("Unesite prvi string ");
		String s1 = input.nextLine();
		System.out.println("Unesite drugi string ");
		String s2 = input.nextLine();
		input.close();
		// postavljamo uslov, ukoliko prvi string sadrzi drugi string ispisujemo
		// da je drugi string substring prvog
		if (s1.contains(s2)) {
			System.out.println(s2 + " jest substring " + s1 + " stringa");
		} else {
			// u suprotnom ispisujemo da nije drugi string subrstring prvog stringa
			System.out.println(s2 + " nije substring " + s1 + " stringa");
		}

	}

}
