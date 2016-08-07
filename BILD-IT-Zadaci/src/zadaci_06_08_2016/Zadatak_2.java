package zadaci_06_08_2016;

import java.util.Scanner;

public class Zadatak_2 {

	public static void main(String[] args) {
		/*
		 * Ispis prestupnih godina program koji ispisuje sve prijestupne godine,
		 * 10 po liniji, u rasponu godina koje korisnik unese. Program pita
		 * korisnika da unese početnu godinu, krajnju godinu te ispisuje sve
		 * godine u tom rasponu.
		 */
		// Varijable pocetne i krajnje godine, brojac prestupnih godina i brojac
		// za ispis godina 10 po redu
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite pocetnu godinu: ");
		int beginYear = input.nextInt();
		System.out.println("Unesite krajnju godinu: ");
		int endYear = input.nextInt();

		input.close();
		// pozovemo metodu i proslijedimo joj pocetnu i krajnju godinu
		lapYear(beginYear, endYear);
	}

	public static void lapYear(int beginYear, int endYear) {
		// metoda kojom provjeravamo da li je godina prestupna ili ne
		int year = 0;
		int counter = 0;
		int counterYear = 0;

		// Petlja koja ce proci od pocetne do krajnje godine godine
		System.out.println("Sve prestupne godine od " + beginYear
				+ ". godine do " + endYear + ". godine su: ");

		while (beginYear <= endYear) {

			year = beginYear;

			// Uslov po kojem trazimo prestupnu godinu pocevsi od pocetne godine
			if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
				System.out.print(year + " ");
				counter++;
				counterYear++;
			}
			// Povecavamo pocetnu godinu svaki puta nakon sto provjerimo kako bi
			// nam petlja dosla do krajnje godine
			beginYear++;
			// Uslov kako bi printali samo 10 godina po liniji
			if (counter == 10) {
				System.out.println();
				counter = 0;
			}
		}
		System.out.println();
		System.out.println("Ukupan broj prestupnih godina u datom rasponu je: "
				+ counterYear);

	}

}
