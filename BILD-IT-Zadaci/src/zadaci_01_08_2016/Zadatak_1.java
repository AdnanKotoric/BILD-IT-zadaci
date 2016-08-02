package zadaci_01_08_2016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Zadatak_1 {

	public static void main(String[] args) {
		// Metoda koja vraca najvecu vrijednost u listi
		Scanner input = new Scanner(System.in);
		System.out.println("Koliko zelite brojeva da se nalazi u listi?");
		int size = input.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			list.add((int) (Math.random() * 1000));

		}
		input.close();
		System.out.println(max(list));
	}

	public static Integer max(ArrayList<Integer> list) {
		// Provjera da li je lista prazna, ukoliko jeste vracamo null
		if (list.isEmpty() || list == null) {
			return null;
			// Ako lista nije prazna vracamo najveci element u listi pomocu
			// klase collections
		} else
			return Collections.max(list);
	}
}
