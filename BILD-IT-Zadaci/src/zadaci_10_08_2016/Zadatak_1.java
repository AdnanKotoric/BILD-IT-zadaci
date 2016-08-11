package zadaci_10_08_2016;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Zadatak_1 {

	public static void main(String[] args) {
		/*
		 * Program koji pita korisnika da unese početnu godinu, krajnju godinu
		 * te ispisuje broj dana za svaku godinu u rasponu.
		 */
		Scanner input = new Scanner(System.in);
		// Unos korisnika za pocetnu i krajnju godinu za koju zeli znati broj
		// dana
		int beginYear = input.nextInt();
		int lastYear = input.nextInt();
		// petlja koja ide od pocetne do zadnje godine koju je korisnik unio
		for (int i = beginYear; i <= lastYear; i++) {
			// ispisujemo koliko koja godina ima dana, unutar ispisa pozivamo
			// metodu
			System.out.println(i + ". godina ima " + numberOfDayInAYear(i)
					+ " dana.");

		}
		input.close();
	}

	// metoda koja nam vraca broj dana za datu godinu
	public static int numberOfDayInAYear(int year) {

		GregorianCalendar cal = new GregorianCalendar();
		// setujemo kalendar koji smo napravili pomocu GregorianCalendar klase
		// na godinu koju smo proslijedili metodi i na prvi januar
		cal.set(year, 1, 1);
		// varijabli numOfDays dodajemo vrijednost koliko dana ima ta godina
		// pomocu metoda getActualMaximum za DAY_OF_YEAR koja nam vraca zadnji
		// dan u toj godini, 365 za normalnu i 366 za prestupnu godinu
		int numOfDays = cal.getActualMaximum(Calendar.DAY_OF_YEAR);

		return numOfDays;// vracamo koliko dana ima ta godina
	}

}
