package zadaci_08_08_2016;

import java.util.Scanner;

public class zadatak_3 {

	public static void main(String[] args) {
		/*
		 * program koji pita korisnika da unese godinu i prva tri slova imena
		 * mjeseca (prvo slovo uppercase) te mu ispiše broj dana u tom mjesecu.
		 */
		Scanner input = new Scanner(System.in);

		// Korisnikov unos za godinu
		System.out.println("Unesite godinu: ");

		int year = input.nextInt();

		// Trazimo od korisnika unos prva tri slova mjeseca s tim da prvo slovo
		// mora biti veliko (uppercase)
		System.out
				.println("Unesite mjesec (prvo slovo mora biti veliko (uppercase)): ");
		String month = input.next();
		input.close();
		// sa switchom trazimo mjesec koji je korisnik unio i ispisujemo koliko
		// ima dana
		if (null != month)
			switch (month) {
			case "Jan":
			case "Mar":
			case "Maj":
			case "Jul":
			case "Aug":
			case "Okt":
			case "Dec":
				System.out.println(month + " " + year + " ima 31 dana.");
				break;
			case "Apr":
			case "Jun":
			case "Sep":
			case "Nov":
				System.out.println(month + " " + year + " ima 30 dana.");
				break;
			case "Feb":
				// uslov ukoliko je godina prestupna da ispise za februar 29
				// dana u suprotnom ispisuje 28 dana za februar
				if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
					System.out.println(month + " " + year + " ima 29 dana.");
				} else {
					System.out.println(month + " " + year + " ima 28 dana.");

				}

			}
	}
}
