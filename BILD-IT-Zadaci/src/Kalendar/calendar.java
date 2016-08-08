package Kalendar;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

public class calendar {

	public static void main(String[] args) throws IOException {
		/*
		 * Mini projekat - kalendar. Pri unosu mjeseca i godine od strane
		 * korisnika u konzoli se ispisuje kalendar za dati mjesec i godinu,
		 * korisnik ima opciju da postavi podsjetnik i da kasnije pregleda sve
		 * podsjetnike koje je unio
		 */
		Scanner input = new Scanner(System.in);
		Calendar calendar = new GregorianCalendar();
		
		// Mjesec koji korisnik izabere(1-12)
				int month = 0;

		// Godina koju korisnik unese
		int year = 0;

		// ask month and year from user

		// kreiramo datoteku koja čuva napomene
		java.io.File reminder = new java.io.File("podsjetnik.txt");
		reminder.createNewFile();
		// kreiramo listu stringova koja uzima datume i podsjetnike
		ArrayList<String> lista = new ArrayList<>();
		// Ako datoteka sa napomenama postoji pročitamo je i smjestimo u niz
		if (reminder.exists()) {
			Scanner read = new Scanner(reminder);
			while (read.hasNextLine()) {
				String s = read.nextLine();
				lista.add(s);

			}
		}

		// Ispis izbornika

		boolean quit = false;
		do {
			System.out.println("1: Prikaz mjeseca u kalendaru");
			System.out
					.println("2: Napraviti podsjetnik za određeni dan u prikazanom mjesecu");
			System.out.println("3: Pregledati postojeće podsjetnike");
			System.out.println("0. Izlaz");

			// Izbornik sa opcijama pomocu switch i case metode

			int menuItem;

			System.out.print("Izaberite: ");

			menuItem = input.nextInt();

			switch (menuItem) {

			case 1:

				System.out
						.println("\nIspis kalendara za dati mjesec i godinu koju unesete");

				Scanner in = new Scanner(System.in);
				// Unos godine i mjeseca kao string od strane korisnika.
				System.out.print("Unesite godinu: ");
				String yearT = in.next();
				System.out.println("Unesite mjesec: ");
				String monthT = in.next();
				try {

					// Pretvaramo godinu i mjesec iz stringa u integer
					// javljamo NumberFormatException ako nije tacan unos.
					month = Integer.parseInt(monthT);
					year = Integer.parseInt(yearT);

					// Provjeravamo da li je broj za mjesec validan
					while (month < 1 || month > 12)
						throw new Exception("Unijeli ste nepostojeci mjesec: "
								+ month);

					// Pozivamo metodu za ispis kalendara
					printCalendarMonthYear(month, year);

				} catch (NumberFormatException e) {
					// Ukoliko korisnik unese nevazec broj ispisujemo error
					System.err.println("Unijeli ste nepostojeci mjesec: "
							+ e.getMessage());
				} catch (Exception e) {
					// Za sve ostale greske
					System.err.println(e.getMessage());
				}

				break;

			case 2:

				System.out.println("\nPostavite podsjetnik na dan");
				// postavljamo calendar na mjesec i godinu koju je korisnik unio
				calendar.clear();
				calendar.set(year, month - 1, 1);
				// Uzimamo broj dana u datom mjesecu
				int numberOfMonthDays = calendar
						.getActualMaximum(Calendar.DAY_OF_MONTH);

				Scanner sc = new Scanner(System.in);
				// Unos korisnika za dan koji zeli podsjetnik
				int day;

				do {
					System.out.println("Unesite dan za podsjetnik: ");
					day = input.nextInt();
					// Ako unesemo pogrešan broj za dan u mjesecu
					// odnosno u datom mjesecu nema toliko dana (zbog toga smo
					// spremili broj dana za dati mjesec) program javlja
					// nepostojeći datum. U suprotnom dodaje u listu datum i
					// podsjetnik
					if (day > numberOfMonthDays || (day < 1))
						System.out.println("Nepostojeći datum!");
				} while (day > numberOfMonthDays || (day < 1));
				System.out.println("Text: ");
				String text = sc.nextLine();
				lista.add(day + "-" + month + "-" + year);
				lista.add(text);

				break;

			case 3:

				System.out
						.println("\nIspis svih podsjetnika koje ste napravili");
				if (lista.size() == 0)
					System.out.println("Nemate podsjetnika!");
				for (int i = 0; i < lista.size(); i++) {
					System.out.print(lista.get(i));
				}
				// Ako file postoji ispisujemo u njeg niz
				if (reminder.exists()) {
					// Kreiramo printer za ispisivanje podsjetnika
					java.io.PrintWriter printer = new java.io.PrintWriter(
							reminder);
					for (int i = 0; i < lista.size(); i++)
						printer.println(lista.get(i));// Ispisujemo sve
														// podsjetnike koje je
														// korisnik unio
					printer.close();
					System.out.println();
				}
				
				break;

			case 0:
				// odabirom opcije 0 quit postavljamo na true i zavrsavamo
				// program
				quit = true;

				break;

			default:
				// Ukoliko korisnik unese nevazecu opciju
				System.out.println("Pogresan unos.");

			}

		} while (!quit);// Petlja se vrti sve dok korisnik ne izabere 0(izlaz)
						// iz
						// izbornika i quit postane true

		System.out.println("Izlaz!");

	}

	/*
	 * Metoda koja postavlja mjesec, godinu, dane i prvi dan sedmice kalendara
	 * za dati mjesec i godinu i printa ga
	 */

	public static void printCalendarMonthYear(int month, int year) {
		// pravimo novi GregorianCalendar object
		Calendar cal = new GregorianCalendar();

		// Setujemo mu datum na prvi dan za mjesec i godinu koju je korisnik
		// unio
		cal.clear();
		cal.set(year, month - 1, 1);

		// Ispis zaglavlja kalendara mjesec i godina koju je korisnik unio
		System.out.println("            "
				+ cal.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.US)
				+ " " + cal.get(Calendar.YEAR));

		// Pomocu metodu getActualMaximum uzimamo broj dana u mjesecu koji je
		// korisnik unio
		int numberOfMonthDays = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

		// Pronalazimo koji je dan u sedmici prvi dan za taj mjesec
		int firstWeekdayOfMonth = cal.get(Calendar.DAY_OF_WEEK);

		// Pozivamo metodu koja ce nam printati kalendar za dati mjesec sa
		// brojem dana i danom u sedmici
		printCalendar(numberOfMonthDays, firstWeekdayOfMonth);
	}

	/*
	 * Metoda za printanje kalendara sa brojem dana tog mjeseca i postavljenim
	 * prvim danom na danom kojim pocinje taj mjesec
	 */
	private static void printCalendar(int numberOfMonthDays,
			int firstWeekdayOfMonth) {

		// Postavljamo brojac dana u sedmici na 0
		int weekdayIndex = 0;

		// print calendar weekday header
		System.out.println("_____________________________________");
		System.out.println(" Ned  Pon  Uto  Sri  Cet  Pet  Sub ");

		// Pomocu petlje izostavljamo dane koji su prazni do prvog dana u tom
		// mjesecu
		for (int day = 1; day < firstWeekdayOfMonth; day++) {
			System.out.print("     ");
			weekdayIndex++;
		}

		// Ispis dana u tabelarnoj formi za dati mjesec
		for (int day = 1; day <= numberOfMonthDays; day++) {
			// Ispis dana
			System.out.printf("%3d", day);

			// Brojac za sedmicu
			weekdayIndex++;
			// Uslov da brojac ide do posljednjed dana u sedmici
			if (weekdayIndex == 7) {
				// Kada dodje do sedmog dana resetujemo brojac
				weekdayIndex = 0;
				// i prebacujemo u novu liniju
				System.out.println();
			} else { // u suprotnom
				// ispisujemo razmak
				System.out.print("  ");
			}
		}

		System.out.println();
	}
}
