package zadaci_12_08_2016;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		// kreiramo listu u koju cemo smjestat unesene brojeve
		ArrayList<Integer> list = new ArrayList<>();
		int userIn = 1;// unos korisnika postavljamo na 1 kako bi pokrenuli
						// petlji jer je uslov da unos ne smije biti jednak 0.

		System.out.print("Unesite broj od 1 do 100(nula prekida unos): ");

		while (userIn != 0) {
			userIn = input.nextInt();// unos korisnika za brojeve od 1 do 100
			list.add(userIn);// uneseni broj spremamo u listu
		}
		input.close();
		countNumbers(list);// kada korisnik unese 0 petlja se prekida pozivamo
							// metodu koja broji koliko se koji broj puta
							// ponovio
	}

	public static void countNumbers(ArrayList<Integer> list) {
		int counter = 0;
		// posto korisnik unosi brojeve od 1 do 100 to nam je ujedno i raspon u
		// kojem cemo provjeravati petljom brojeve sve koliko se koji ponovio
		// puta
		for (int i = 1; i <= 100; i++) {
			for (int j = 0; j < list.size() - 1; j++) {
				if (i == list.get(j))
					counter++;
			}
			// postavljamo uslov ukoliko brojac nije jednak nuli da ispise
			// koliko se provjereni broj puta ponovio
			if (counter > 0) {
				System.out.println("Broj " + i + " se ponovio " + counter
						+ " puta");
				counter = 0;// brojac postavljamo na nulu za naredni broj
			}
		}
	}
}