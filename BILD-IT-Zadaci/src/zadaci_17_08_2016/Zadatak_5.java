package zadaci_17_08_2016;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_5 {

	public static void main(String[] args) {
		/*
		 * program koji učitava 10 brojeva te ispisuje koilko je jedinstvenih
		 * brojeva unijeto te sve jedinstvene brojeve koji su unijeti,
		 * razmaknute jednim spaceom. Ukoliko se neki broj pojavljuje više puta,
		 * broj treba ispisati samo jednom.
		 */
		Scanner input = new Scanner(System.in);
		// unos 10 brojeva od strane korisnika
		System.out.println("Unesite 10 brojeva: ");
		int numb = 0;
		// kreiramo listu u koju cemo unositi jedinstvene brojeve
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) { // petlja radi dok korisnik ne unese 10
										// brojeva
			numb = input.nextInt();
			// uslov ukoliko lista ne sadrzi uneseni broj dodajemo ga u listu
			if (!list.contains(numb)) {
				list.add(numb);
			}
		}
		input.close();
		System.out.println("Jedinstveni brojevi od onih koje ste unijeli su: ");
		// ispis jedinstvenih brojeva koje smo spremili u listu
		for (int number : list) {
			System.out.print(number + " ");
		}
		// ispisujemo koliko ima jedinstvenih brojeva, jednostavno ispisemo
		// velicinu liste jer smo samo spremali jedinstvene brojeve u nju
		System.out.println("\nI ima ih " + list.size());

	}

}
