package zadaci_06_08_2016;

import java.util.Scanner;

public class Zadatak_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Ispis prestupnih godina od 101. do 2100.
		 */
		// Varijable pocetne i krajnje godine, brojac prestupnih godina i brojac
		// za ispis godina 10 po redu
		Scanner input = new Scanner(System.in);
		int beginYear = input.nextInt();
		int endYear = input.nextInt();
		lapYear(beginYear, endYear);
	}

	public static void lapYear(int beginYear, int endYear) {
		int year = 0;
		int counter = 0;
		int counterYear = 0;

		// Petlja koja ce proci od 101. do 2100. godine
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
		System.out.println("Ukupan broj pestupnih godina od " + beginYear
				+ " godine do " + endYear + " godine je: " + counterYear);

	}

}
