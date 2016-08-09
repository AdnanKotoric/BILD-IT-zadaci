package zadaci_08_08_2016;

import java.util.Scanner;

public class zadatak_5 {

	public static void main(String[] args) {
		/*
		 * Program koji pita korisnika da unese password te mu ispisuje
		 * "password je validan" ukoliko su sva pravila ispoštovana ili
		 * "password nije validan" ukoliko pravila nisu ispoštovana. Pravila: 1.
		 * Password mora biti sačinjen od najmanje 8 karaktera. 2. Password
		 * smije da se sastoji samo od slova i brojeva. 3. Password mora
		 * sadržati najmanje 2 broja.
		 */
		Scanner input = new Scanner(System.in);
		// Trazimo od korisnika da unese pasword
		System.out
				.print("Password mora biti sačinjen od najmanje 8 karaktera,\nsmije da se sastoji samo od slova i brojeva,\nmora sadržati najmanje 2 broja.\nUnesite password postujuci navedena pravila: ");
		String password = input.next();
		input.close();
		// postavljamo uslov u kojem pozivamo metodu kojju provjerava password,
		// i shodno tome da li korisnik ispostuje pravila ispisujemo poruku
		// korisniku
		if (passwordValidation(password) == true) {
			System.out.println("Vas password je validan!");
		} else {
			System.out.println("Password koji ste unijeli nije validan!");
		}

	}

	// metoda za provjeru passworda
	public static boolean passwordValidation(String password) {
		// varijablu valid postavljamo na valid
		boolean valid = true;
		// brojac za brojeve unutar passworda
		int countNumbers = 0;
		// petljom prolazimo kroz string tj password
		for (int i = 0; i < password.length(); i++) {

			if (password.length() >= 8)
				valid = true;
			// provjera, ukoliko jedan od karaktera unijetih u psswordu nije
			// slovo ili broj vracamo false
			if (!Character.isLetterOrDigit(password.charAt(i)))
				valid = false;

			// provjeravamo karaktere da li su brojevi i za svaki broj
			// povecavamo brojac
			if (Character.isDigit(password.charAt(i)))
				countNumbers++;
			// ukoliko je brojac manji od dva vracamo false, password je validan
			// ukoliko ima 2 ili vise broja u njemu
			if (countNumbers < 2)
				valid = false;

		}
		return valid;// vracamo varijablu valid

	}

}
