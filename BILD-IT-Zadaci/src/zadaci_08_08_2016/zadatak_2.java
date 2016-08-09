package zadaci_08_08_2016;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class zadatak_2 {

	public static void main(String[] args) {
		/*
		 * Program koji pita korisnika da unese mjesec i godinu te mu ispiše
		 * broj dana u datom mjesecu.
		 */
		Scanner input = new Scanner(System.in);
		GregorianCalendar calendar = new GregorianCalendar();
		// Unos za mjesec i godinu od strane korisnika
		System.out.println("Unesite mjesec: ");
		int month = input.nextInt();
		System.out.print("Unesite godinu: ");
		int year = input.nextInt();
		// (Mogli smo pomocu metode iz klase GreogrianCalendar napraviti ispis
		// mjeseca, ali da bude na naski) niz koji ima imena mjeseci, na prvu
		// poziciju stavili smo 0 da bi broj koji je unio korisnik poklopilo se
		// sa indeksom na kojem se nalazi odgovarajuci mjesec
		String array[] = { "0", "Januar", "Februar", "Mart", "April", "Maj",
				"Juni", "Juli", "August", "Septembar", "Oktobar", "Novembar",
				"Decembar" };
		input.close();
		// resetujemo kalendar na mjesec i godinu koje je unio korisnik
		calendar.clear();
		calendar.set(year, month - 1, 1);
		int date = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

		// Ispis mjesec, godinu koju je korisniki unio i broj dana za taj mjesec
		System.out.println(array[month] + " " + year + " ima " + date
				+ " dana.");

	}

}
