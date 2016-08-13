package zadaci_11_08_2016;

import java.util.Scanner;

public class Zadatak_4 {

	public static void main(String[] args) {
		/*
		 * program koji pita korisnika da unese broj minuta (npr. 1 milijardu)
		 * te ispiše korisniku koliko je to u godinama i danima. Zbog
		 * jednostavnosti, pretpostavimo da godina ima 365 dana.
		 */
		Scanner input = new Scanner(System.in);
		// unos korisnika za koliko minuta zeli provjeriti koliko je to godina i
		// dana
		System.out.println("Unesite broj minuta ");
		long minutes = input.nextLong();

		// Racunamo godine prema datoj formuli jer sat ima 60 minuta u danu ima
		// 24 sata a 365 dana u godini
		long year = minutes / (365 * 24 * 60);
		// Racunamo koliko nam je ostalo minuta
		long leftMinutes = minutes % (365 * 24 * 60);
		// i konacno ostatak minuta pretvaramo u dane
		long day = leftMinutes / (24 * 60);
		// Ispisujemo godine i dane za unesene minute
		System.out.println(minutes + " minuta je: " + year + " godina i " + day
				+ " dana");
		input.close();
	}

}
