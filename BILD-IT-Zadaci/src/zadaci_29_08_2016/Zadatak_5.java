package zadaci_29_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_5 {

	public static void main(String[] args) throws IllegalArgumentException {
		Scanner input = new Scanner(System.in);
		try {
			// unos korisnika
			System.out.println("Unesite interesnu stopu");
			double annualInterestRate = input.nextDouble();
			System.out.println("Unesite na koliko godinazelite pozajmicu");
			int numberOfYears = input.nextInt();
			System.out.println("Unesite iznos pozajmice");
			double loanAmount = input.nextDouble();
			// kreiramo objekat
			Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);
			System.out.println(loan.toString());
			input.close();
			// exceptions
		} catch (IllegalArgumentException a) {
			System.out.println("Unos mora biti veci od 0");
		} catch (InputMismatchException e) {
			System.out.println("Pogresan unos");
		}
	}

}