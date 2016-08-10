package zadaci_09_08_2016;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class zadatak_5 {

	public static void main(String[] args) {
		/*
		 * metodu koja pretavara milisekunde u sate, minute i sekunde. Metoda
		 * treba da koristi sljedeći header: public static String
		 * convertMillis(long millis). Metoda treba da vraća vrijeme kao string
		 * u formatu sati:minute:sekunde. Na primjer convertMillis(100000) treba
		 * da vrati 0:1:40.
		 */
		Scanner input = new Scanner(System.in);
		// unos korisnika u milisekundama
		long millis = input.nextLong();
		// pozivamo metodu koja pretvara milisekunde u sate, minute i sekunde i
		// vraca ih kao string i ispisujemo 
		System.out.println(convertMillis(millis));

		input.close();
	}

	// metoda za pretvaranje milisekundi u sate, minute i sekunde
	private static String convertMillis(long millis) {
		// pomocu TimeUnit postavimo da je vrijednost u milisekundama metodama
		// toHours, toMinutes, i toSeconds pretvaramo u sate, minute i sekunde
		long hrs = TimeUnit.MILLISECONDS.toHours(millis) % 24;
		long min = TimeUnit.MILLISECONDS.toMinutes(millis) % 60;
		long sec = TimeUnit.MILLISECONDS.toSeconds(millis) % 60;
		
		// vracamo dobivene sate minute i sekunde u formatu koji treba
		return String.format("%02d:%02d:%02d", hrs, min, sec);

	}

}
