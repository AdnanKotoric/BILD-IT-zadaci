package zadaci_01_08_2016;

import java.util.Scanner;

public class Zadatak_3 {

	public static void main(String[] args) {
		// Izracunavanje najveceg zajednickod djelioca
		Scanner input = new Scanner(System.in);
		// unos varijabli od strane korisnika
		System.out.println("Unesite prvi broj:");
		int x = input.nextInt();
		System.out.println("Unesite drugi broj:");
		int y = input.nextInt();

		input.close();
		System.out.println("Najveci zajednicki djelilac za " + x + " i " + y
				+ " je " + getDivisor(x, y) + ".");
	}

	// metoda za izracunavanje najveceg zajednickog djelioca

	public static int getDivisor(int a, int b) {
		// d(djeliocu dodajemo privremenu vrijednost)
		int d = 1;

		// petlja u slucaju da je prvi broj veci od drugog
		if (a > b) {
			for (int i = b; i >= 1; i--) {
				if (a % i == 0 && b % i == 0) {
					return i;
				}
			}

		} else {
			// petlja ukoliko je drugi broj veci od prvog
			for (int j = a; j >= 1; j--) {
				if (a % j == 0 && b % j == 0) {
					return j;
				}
			}
		}
		return d;

	}
}
