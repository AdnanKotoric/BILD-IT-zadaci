package zadaci_06_09_2016;

import java.util.InputMismatchException;

public class FibonacciNumbers {
	public static long fib(long index) {
		long f0 = 0;
		long f1 = 1;
		long currentFib = 0;
	
		if (index == 0) {
			return 0;
		} else if (index == 1) {
			return 1;
		} else {
			// petljom izracunavamo broj
			for (int i = 1; i < index; i++) {
				currentFib = f0 + f1;
				f0 = f1;
				f1 = currentFib;
			}
		}
		return currentFib;

	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		try {
			// unos korisnika
			System.out.print("Unesite indeks za koji zelite znati Fibonaccijev broj: ");
			int index = input.nextInt();

			// ispis broja
			System.out.println("Fibonaccijev broj na indeksu " + index + " je " + fib(index));
			input.close();
		} catch (InputMismatchException e) {
			System.out.println("Pogresan unos");
		}
	}

}