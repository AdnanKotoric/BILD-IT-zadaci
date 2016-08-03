package zadaci_02_08_2016;

import java.util.Scanner;

public class Zadatak_2 {

	public static void main(String[] args) {
		/*
		 * 
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite broj pitanja koliko zelite: ");
		int numQ = input.nextInt();
		pitanja(numQ);

	}

	public static void pitanja(int n) {
		java.util.Scanner input = new Scanner(System.in);
		int counterT = 0;
		int counterF = 0;

		for (int i = 0; i < n; i++) {
			int broj1 = (int) (Math.random() * 10);
			int broj2 = (int) (Math.random() * 10);
			System.out.println("Koliko je " + broj1 + " - " + broj2 + " ?");
			int rezultat = input.nextInt();
			if (rezultat == (broj1 - broj2)) {
				counterT++;
			} else
				counterF++;

		}
		System.out.println("Broj tacnih odgovora je " + counterT);
		System.out.println("Broj netacnih odgovora je " + counterF);
	}

}
