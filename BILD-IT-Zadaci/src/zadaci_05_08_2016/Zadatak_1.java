package zadaci_05_08_2016;

import java.util.Scanner;

public class Zadatak_1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		// Korisnikov unos iznosa koji odlaze na stedni racun i broj mjeseci
		// stednje
		System.out.println("Unesite mjesecni iznos stednje: ");
		double save = input.nextInt();
		System.out.println("Unesite broj mjeseci za stednju: ");
		int numberOfMonths = input.nextInt();
		// Monthly Interest Rate (mjesecna interesna stopa)
		double MIR = 0.05 / 12;
input.close();
		// pozivamo metodu i printamo rezultat
		System.out.printf("Nakon " + numberOfMonths
				+ " mjeseci na stednom racunu cete imati %.3f ",
				account(save, MIR, numberOfMonths));
	}

	public static double account(double save, double MIR, double numberOfMonths) {
		// stanje racuna postavljamo na 0 i na njega dodajemo stednju
		double amountOnAccount = 0;
		// Petljljom racunamo koliko novca se nalazi na racunu po datoj formuli
		for (int i = 0; i < numberOfMonths; i++) {
			amountOnAccount = ((save + amountOnAccount) * (1 + MIR));

		}
		return amountOnAccount;// vracamo iznos stednje nakon odredjenog broja
								// mjeseci sa mjesecnom interesnom stopomS

	}
}
