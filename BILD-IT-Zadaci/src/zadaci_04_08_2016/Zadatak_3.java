package zadaci_04_08_2016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Zadatak_3 {

	public static void main(String[] args) {
		/*
		 * program koji pita korisnika da unese tri broja te ispiše ta tri broja
		 * u rastućem redosljedu
		 */
		Scanner input = new Scanner(System.in);
		// unos korisnika
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();
		// pozivamo metodu
		displaySortedNumbers(num1, num2, num3);
	}

	public static void displaySortedNumbers(double num1, double num2,
			double num3) {
		// napravimo listu u koju dodamo 3 broja koje korisnik unio
		ArrayList<Double> list = new ArrayList<>();
		list.add(num1);
		list.add(num2);
		list.add(num3);
		// pomocu klase collections sortiramo listu i ispisujemo tri broja u
		// rastućem redoslijedu
		Collections.sort(list);
		System.out.println(list);

	}
}
