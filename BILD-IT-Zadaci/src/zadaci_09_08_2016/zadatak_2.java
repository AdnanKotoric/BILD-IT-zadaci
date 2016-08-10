package zadaci_09_08_2016;

import java.util.Scanner;

public class zadatak_2 {

	public static void main(String[] args) {
		/*
		 * Great circle distance predstavlja udaljenost između dvije tačke na
		 * površine sfere. Neka nam (x1, y1) i (x2, y2) predstavljaju geografsku
		 * širinu i dužinu dvije tačke. Great circle distance između ove dvije
		 * tačke može biti izračunata koristeći se sljedećom formulom: d =
		 * radius * arccos (sin(x1) X sin(x2) + cos(x1) * cos(x2) * cos(y1 -
		 * y2)). program pita korisnika da unese geografsku širinu i dužinu u
		 * stepenima dvije tačke na površini zemlje te mu ispisuje great circle
		 * distance. Prosječni radius zemlje je 6.371.01 km. Stepene koje
		 * korisnik unese trebamo promijeniti u radianse koristeći se
		 * Math.toRadians metodom jer Java trigonometrijske metode koriste
		 * radianse. Širina i dužina u ovoj formuli se odnose na zapad i sjever.
		 * Koristimo negativne vrijednosti da označimo istok i jug.
		 */
		Scanner input = new Scanner(System.in);
		// trazimo unos korisnika i odmah ga pretvaramo u radianse za date tacke
		System.out.print("Unesite geografsku sirinu u stepenima prve tacke: ");
		double x1 = Math.toRadians(input.nextDouble());
		System.out
				.println("Unesite geografsku duzinu u stepenima prve tacke: ");
		double y1 = Math.toRadians(input.nextDouble());

		System.out.print("Unesite geografsku sirinu u stepenima druge tacke: ");
		double x2 = Math.toRadians(input.nextDouble());
		System.out
				.println("Unesite geografsku duzinu u stepenima druge tacke: ");
		double y2 = Math.toRadians(input.nextDouble());
		// pozivamo metodu i prosljedjujemo joj duzine i sirine datih tacaka
		getDistance(x1, y1, x2, y2);
	}

	public static void getDistance(double x1, double y1, double x2, double y2) {
		// varijabla za udaljenost dvije tacke
		double distance;
		// postavljamo radius zemlje kao finalnu varijablu koja se ne mijenja
		final double radius = 6371.01;
		// racunamo razdaljinu po datoj formuli
		distance = radius
				* Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1)
						* Math.cos(x2) * Math.cos(y1 - y2));
		// ispisujemo razdaljinu za tacke koje je korisnik unio
		System.out.println("The distance between the two points is " + distance
				+ " km");

	}

}
