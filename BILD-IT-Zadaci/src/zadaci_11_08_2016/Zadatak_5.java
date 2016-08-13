package zadaci_11_08_2016;

import java.util.Scanner;

public class Zadatak_5 {

	public static void main(String[] args) {
		/*
		 * program koji učitava neodređen broj cijelih brojeva, određuje koliko
		 * je pozitivnih brojeva korisnik unijeo, koliko negativnih te
		 * izračunava ukupnu sumu i prosjek svih unesenih brojeva. (Korisnik
		 * prekida unos tako što unese nulu)
		 */
		Scanner input = new Scanner(System.in);
		// unos korisnika
		System.out.println("Unesite brojeve (0 prekida unos): ");
		int numb = input.nextInt();
		double sum = 0;
		double average = 0;
		int positiv = 0;
		int negativ = 0;
		int counter = 0;
		// petlja kojom provjeravamo unesene brojeve da li su negativni ili
		// pozitivni, racunamo sumu i prosjek datih brojeva sve dok korisnik ne
		// unese 0
		while (numb != 0) {
			sum += numb;
			numb = input.nextInt();
			// uslov kojem provjeravamo da li je broj pozitivan ili negativan i
			// shodno tome povecavamo adekvatan brojac
			if (numb < 0) {
				negativ++;
			} else {
				positiv++;

			}
			counter++;// brojac za ukupan broj unijetih brojeva
			average = sum / counter;// prosjek racunamo tako sto podijelimo sumu
									// sa brojem unijetih brojeva
		}
		input.close();
		// ispis sume prosjeka broja pozitivnih i negativnih brojeva
		System.out.println("Zbir svih unesenih brojeva " + sum
				+ " prosjek njihov je " + average + ", negativnih brojeva ima "
				+ negativ + " pozitvnih ima " + positiv);

	}
}
