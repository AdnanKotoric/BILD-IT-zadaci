package zadaci_09_08_2016;

import java.util.Scanner;

public class zadatak_1 {

	public static void main(String[] args) {
		/*
		 * program koji pita korisnika da unese cijeli broj za današnji dan u
		 * sedmici (0 za ponedjeljak, 1 za utorak...) i da unese broj dana nakon
		 * današnjeg dana te mu ispiše koji je to dan u budućnosti. (Primjer:
		 * ako korisnik unese 1 kao današnji dan a 3 kao dan u budućnosti
		 * program mu ispisuje da je danas utorak a dan u budućnosti je petak.)
		 */
		Scanner input = new Scanner(System.in);
		// unos korisnika za danasnji dan
		System.out
				.println("Unesite cijeli broj za danasnji dan u sedmici (0 za ponedjeljak, 1 za utorak...) ");
		int index = input.nextInt();
		// unos korisnika za dan u buducnosti
		System.out.println("Unesite broj dana za dan u buducnosti: ");
		int indexNext = input.nextInt();
		input.close();
		// napravimo niz u koji sacuvamo sve dane u sedmici
		String[] dani = { "ponedjeljak", "utorak", "srijeda", "cetvrtak",
				"petak", "subota", "nedjelja" };
		// printamo danasnji dan po indexu na kojem se nalazi u nizu, a buduci
		// trazimo po formuli danasnji dan + broj danan za buduci dan,
		// postavljamo uslov ukoliko je zbir veci od 7 dijelimo zbir sa 7 i
		// ostatak uzimamo kao indeks za dan koji trazimo
		int buduciDan = index + indexNext;
		if (buduciDan > 7) {
			buduciDan %= 7;
		}
		// Ispisujemo u konzoli danasnji dan i buduci dan
		System.out.println("Danas je " + dani[index]
				+ " a dan u buducnosti je " + dani[buduciDan]);

	}

}
