package zadaci_27_08_2016;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_3 {

	public static double sum(ArrayList<Double> list) {
		double sumList = 0;
		// sabiremo brojeve u listi
		for (int i = 0; i < list.size(); i++) {
			sumList += list.get(i).intValue();
		}
		// vraca sumu sabranih brojeva
		return sumList;

	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		// kreiramo listu za spremanje brojeva
		ArrayList<Double> numbers = new ArrayList<>();
		int count = 0;
		System.out.println("Unesite 5 brojeva");
		// unosimo brojeve u listu
		while (count < 5) {
			double num = input.nextDouble();
			numbers.add(num);
			count++;
		}
		// poziv metode
		System.out.println("Suma elemenata:" + sum(numbers));
		input.close();
	}
}
