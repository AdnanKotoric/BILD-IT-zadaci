package zadaci_29_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			// unos korisnika
			System.out.println("Unesite 2 brja");
			int num1 = input.nextInt();
			int num2 = input.nextInt();
			// izracunavanje zbira
			int sum = num1 + num2;
			System.out.println("Sum: " + sum);
			input.close();
			// hvatamo input exception
		} catch (InputMismatchException e) {

			System.out.println("Pogresan unos, pokusajte ponovo!");
			main(args);
		}

	}

}