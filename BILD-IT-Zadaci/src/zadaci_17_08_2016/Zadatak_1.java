package zadaci_17_08_2016;

import java.util.Scanner;

public class Zadatak_1 {

	public static void main(String[] args) {
		/*
		 * program koji prima ASCII kod (cijeli broj između 0 i 127) te ispisuje
		 * koji je to karakter. Na primjer, ukoliko korisnik unese 69 kao ASCII
		 * kod, program mu ispisuje da je karakter sa tim brojem karakter E.
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite broj za koji zelite vidjeti ASCII kod: ");
		// unos korisnika za broj
		int numb = input.nextInt();
		// kastujemo dati int(cjelobrojnu vrijednost) u karakter
		char kod = (char) numb;
		// ispis karaktera za dati broj
		System.out.println("Karakter sa tim brojem je: " + kod);
		input.close();
	}

}
