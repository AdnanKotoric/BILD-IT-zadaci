package zadaci_06_08_2016;

import java.util.Scanner;

public class Zadatak_5 {

	public static void main(String[] args) {
		/*
		 * Program koji trazi od korisnika da unese brzinu aviona u m/s i i
		 * njegovo ubrzanje u m/s² te ispisuje korisniku minimalnu dužinu piste.
		 */
		Scanner input = new Scanner(System.in);
		// Unos korisnika za brzinu i ubrzanje aviona
		System.out.println("Unesite brzinu aviona pri kojoj uzlijece: ");
		double v = input.nextDouble();
		System.out.println("Unesite ubrzanje aviona: ");
		double a = input.nextDouble();
		input.close();
		
		// formula po kojoj racunamo minimalnu duzinu piste
		double length = (v * v) / (2 * a);
		// ispis u konzoli
		System.out.printf("Minimalna duzina piste za ovaj avion iznosi %.3f ",
				length);

	}

}
