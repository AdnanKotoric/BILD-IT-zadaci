package zadaci_07_09_2016;

import java.util.InputMismatchException;

public class ReverslyInteger {
	public static int reverse = 0;

	public static void reverseDisplay(int value) {
		// zaustavlja rekurziju kada je vrijednost value = 0
		if (value == 0) {
			// ispis brojeva
			System.out.println(reverse);
		} else {
			// okrece u obrnutom redoslijedu brojeve
			reverse = reverse * 10;
			reverse += value % 10;
			// poziv metode
			reverseDisplay(value / 10);
		}
	}

	public static void main(String[] args) {
		try (java.util.Scanner input = new java.util.Scanner(System.in)) {
			// unos korisnika
			System.out.println("Unesite broj");
			int num = input.nextInt();
			// poziv metode
			reverseDisplay(num);

		} catch (InputMismatchException e) {
			System.out.println("Pogresan unos, pokusajte ponovo: ");
			main(args);
		}
	}

}