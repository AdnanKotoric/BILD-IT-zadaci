package zadaci_26_08_2016;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListShuffle {
	public static void shuffle(ArrayList<Integer> list) {
		// shuffles liste
		Collections.shuffle(list);
		// ispis liste
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).intValue() + " ");
		}
	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		// lista sa brojevima
		ArrayList<Integer> numbers = new ArrayList<>();

		System.out.println("Unesite brojeve 0 prekida unos");
		int num = input.nextInt();
		// petljom dodajemo unos korisnika u listu sve dok ne bude 0
		while (num != 0) {
			numbers.add(num);
			num = input.nextInt();
		}
		// ispis unesenih brojeva
		for (int i = 0; i < numbers.size(); i++) {
			System.out.print(numbers.get(i).intValue() + " ");
		}
		// poziv metode shuffle
		System.out.println("\nShuffle lista:");
		shuffle(numbers);
		input.close();
	}

}