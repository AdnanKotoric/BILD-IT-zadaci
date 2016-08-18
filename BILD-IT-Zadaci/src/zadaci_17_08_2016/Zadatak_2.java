package zadaci_17_08_2016;

import java.util.Scanner;

public class Zadatak_2 {

	public static void main(String[] args) {
		/*
		 * program koji prima karakter te vraća njegov Unicode. Primjer: ukoliko
		 * korisnik unese karakter E program mu vraća 69 kao unicode za taj
		 * karakter.
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite karakter za koji zelite ASCII kod");
		// unos karaktera od strane korisnika
		char c = input.nextLine().charAt(0);
		// kastujemo dati karakter u cjelobrojnu vrijednost i dobijemo njegov
		// unicode
		int numb = (int) c;
		System.out.println("Karakter se nalazi na mjestu " + numb);
		input.close();

	}

}
