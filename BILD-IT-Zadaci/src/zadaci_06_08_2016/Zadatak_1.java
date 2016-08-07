package zadaci_06_08_2016;

import java.util.Scanner;

public class Zadatak_1 {

	public static void main(String[] args) {
		/*
		 * Program koji učitava iznos investicije, godišnju interesnu stopu i
		 * broj godina te vraća buduću vrijednost investicije
		 */

		Scanner input = new Scanner(System.in);
		// Korisnikov unos iznosa investicije godisnje interesne stope i broj
		// godina
		System.out.println("Unesite iznos investicije: ");
		double investment = input.nextInt();
		System.out.println("Unesite broj godina: ");
		int numberOfYears = input.nextInt();
		System.out.println("Unesite godisnju procentnu stopu: ");
		double YIR = input.nextDouble();// Years Interest rate( godisnja
										// interesna stopa koju korisnik odredi

		input.close();
		// pozivamo metodu i printamo rezultat
		System.out.printf("Nakon " + numberOfYears
				+ " godine na stednom racunu cete imati %.2f ",
				account(investment, YIR, numberOfYears));
	}

	public static double account(double investment, double YIR,
			int numberOfYears) {
		// Monthly Interest Rate odmah racunamo
		// koliko iznosi mjesecna interesna
		// stopa po datoj formuli
		double MIR = (YIR / 12) / 100;
		
		// pravimo varijablu u koju cemo spremiti buduce stanje investicije
		double investmentValue = 0;
		
		// Po formuli racunamo buduce stanje investicije koristimo Math klasu
		// i pow metodu jer nam je potrebno eksponenciranje
		// (1 +mjesecnaInteresnaStopa)^brojGodina*12.

		investmentValue = (investment * Math.pow(1 + MIR, numberOfYears * 12));

		return investmentValue;// vracamo buducu vrijednost investicije nakon
								// odredjenog broja
								// godina sa godisnjom interesnom stopom koju
								// korisnik zeli

	}

}
