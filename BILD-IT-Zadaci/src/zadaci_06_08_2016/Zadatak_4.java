package zadaci_06_08_2016;

import java.util.Scanner;

public class Zadatak_4 {

	public static void main(String[] args) {
		/*
		 * Program koji ispisuje sve karaktere koji se nalaze na neparnim
		 * pozicijama stringa unesenog od strane korisnika.
		 */
		Scanner input = new Scanner(System.in);
		// unos stringa od strane korisnika
		System.out.println("Unesite rijec ili recenicu: ");
		String s = input.nextLine();
		input.close();

		// petlja kojom prolazimo kroz string, te ispisujemo svaki drugi
		// karakter
		// posto indeksi pocinju od nule na nultom i na svakom parnom
		// indeksu se nalazi neparni karakter stringa
		for (int i = 0; i < s.length(); i += 2) {
			System.out.print(s.charAt(i));
		}
	}

}
