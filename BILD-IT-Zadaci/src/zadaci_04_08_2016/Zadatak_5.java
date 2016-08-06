package zadaci_04_08_2016;

import java.util.Scanner;

public class Zadatak_5 {

	public static void main(String[] args) {
		/*
		 * program koji učitava neodređeni broj cijelih brojeva (nula prekida
		 * unos) te ispisuje koliko je brojeva bilo iznad ili jednako prosjeku
		 * svih unešenih brojeva a koliko je bilo brojeva ispod prosjeka.
		 * Pretpostavimo da je maksimalan niz brojeva koje korisnik može unijeti
		 * 100.
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite niz cijelih brojeva (0 prekida unos): ");

		// Kreiranje niza u koji ce se pohraniti svi brojevi max 100
		int[] array = new int[100];
		int sum = 0;
		int average = 0;
		int counter = 0;
		int below = 0;
		int over = 0;
		// Petja za dodavanje brojeva u listu sa uslovom gdje ako korisnik unese
		// 0 prekidamo unos
		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
			if (array[i] == 0) {
				break;
			}
			// racunamo sumu kako dodajemo elemente u niz i povecavamo brojac
			// koji broji koliko smo unijeli elemenata
			sum += array[i];
			counter++;
		}

		// Racunamo prosjek zbira svih brojeva podjeljen sa brojem elemenata
		average = sum / counter;

		// Drugom petljom brojimo elemente koji su bili ispod, iznad ili jednaki
		// prosjeku
		for (int i = 0; i < counter; i++) {
			if (array[i] >= average) {
				over++;
			} else {
				below++;
			}
		}

		System.out.println("Prosjek brojeva iznosi: " + average);
		System.out.println("Kolicina brojeva iznad ili jednaki prosjeku: "
				+ over);
		System.out.println("Kolicina brojeva ispod prosjeka iznosi: " + below);
	}
}