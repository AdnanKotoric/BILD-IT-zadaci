package zadaci_06_08_2016;

import java.util.Scanner;

public class Zadatak_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite broj: ");
		int broj = unos.nextInt();
		System.out.println(reverse(broj));
		System.out.println(isPalindrom(broj));

	}

	public static int reverse(int number) {
		String obrnut = "";
		int reverse = 0;
		int broj = number;
		while (broj != 0) {
			obrnut += broj % 10;
			broj = broj / 10;
		}
		reverse = Integer.valueOf(obrnut);
		return reverse;
	}

	public static boolean isPalindrom(int number) {
		boolean isPalindrom = true;
		String obrnut = "";
		int reverse = 0;
		int broj = number;
		while (broj != 0) {
			obrnut += broj % 10;
			broj = broj / 10;
		}
		reverse = Integer.valueOf(obrnut);
		if (number == reverse) {
			return true;

		}
		return false;
	}

}
