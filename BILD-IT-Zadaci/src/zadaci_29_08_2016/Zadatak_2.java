package zadaci_29_08_2016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Zadatak_2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		ArrayList<Integer> factors = new ArrayList<>();
		int factor = 0;

		System.out.println("Unesite broj");
		int num = input.nextInt();
		int n = num;
		// petlja za pronalazenje faktora
		for (int i = 2; i <= num; i++) {

			while (num % i == 0) {
				factor = i;
				factors.add(factor);
				num = num / i;
			}
		}
		int[] count = new int[Collections.max(factors) + 1];
		ArrayList<Integer> f = new ArrayList<>();

		// ispis faktora
		for (int i = 0; i < factors.size(); i++) {
			System.out.print(factors.get(i).intValue() + " ");

		}
		// brojac
		for (int i : factors) {
			count[i]++;
		}
		// dodaje brojeve koje računaju neparni broj puta u listu
		for (int i = 0; i < count.length; i++) {
			if (count[i] % 2 != 0) {

				f.add(i);
			}
		}
		int m = 1;
		// racunamo m
		for (int i = 0; i < f.size(); i++) {
			m = m * f.get(i).intValue();
		}
		// ispis m * n
		System.out.println("\n" + m * n);

		input.close();

	}

}
