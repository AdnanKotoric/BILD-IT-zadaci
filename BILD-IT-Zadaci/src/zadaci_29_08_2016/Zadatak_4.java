package zadaci_29_08_2016;

import java.util.InputMismatchException;

public class Zadatak_4 {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		try {
			// unos korisnika
			System.out.println("Enter wanted index");
			int a = input.nextInt();
			// niz u koji spremamo 1000 brojeva
			int[] array = new int[1000];
			for (int i = 1; i < array.length; i++) {
				array[i] = (int) (Math.random() * 100);
			}
			// ispis broja na zeljenom indexu
			System.out.println(array[a]);
			input.close();
			// catches exceptions
		} catch (IndexOutOfBoundsException b) {
			System.out.println("Ne postoji indeks, pokusajte ponovo!");
			main(args);
		} catch (InputMismatchException e) {
			System.out.println("Pogresan unos, unesite broj!");
			main(args);
		}

	}

}
