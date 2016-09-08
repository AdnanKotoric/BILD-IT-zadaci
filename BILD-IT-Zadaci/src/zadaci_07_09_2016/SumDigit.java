package zadaci_07_09_2016;

import java.util.InputMismatchException;

public class SumDigit {

	public static int sum = 0;

	public static int sumDigits(long n) {
		// zaustavlja rekurziju
		if (n == 0) {
			return sum;
		} else {
			// racunamo sumu brojeva
			sum += n % 10;
			return sumDigits(n / 10);
		}
	}

	public static void main(String[] args) {
		try (java.util.Scanner input = new java.util.Scanner(System.in)) {
			// unos korisnika
			System.out.println("Unesite broj");
			long num = input.nextLong();
			// ispisujemo sumu
			System.out.println(sumDigits(num));
		} catch (InputMismatchException e) {
			System.out.println("Pogresan unos");
			main(args);

		}
	}
}