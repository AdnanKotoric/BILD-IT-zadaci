package zadaci_27_08_2016;

import java.util.ArrayList;
import java.util.Collections;

public class Zadatak_4 {

	public static void removeDuplicate(ArrayList<Integer> list) {
		int max = Collections.max(list);
		ArrayList<Integer> l = new ArrayList<>();
		for (int i = 0; i <= max; i++) {
			// broji ucestalost elementa
			int counter = Collections.frequency(list, i);
			// ukoliko je veci od 0 dodaje u listu
			if (counter >= 1) {
				l.add(i);
			}
		}
		// ispis liste
		System.out.println(l.toString());
	}

	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);
		// kreiramo listu
		ArrayList<Integer> list = new ArrayList<>();
		int count = 0;
		System.out.println("Enter 10 numbers");
		// dodajemo u listu 10 brojeva
		while (count < 10) {
			int num = input.nextInt();
			list.add(num);
			count++;
		}
		// poziv metode
		removeDuplicate(list);
		input.close();
	}

}
