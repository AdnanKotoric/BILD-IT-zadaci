package zadaci_26_08_2016;

import java.util.ArrayList;
import java.util.Collections;


public class MaxElementInArrayList {
	public static Integer max(ArrayList<Integer> list) {
		// ako je lista prazna vracamo null
		if (list.isEmpty()) {
			return null;
		}
		else{
		// trazimo najvecu vrijednost pomocu Collections
		int max = Collections.max(list);
		return max;
	}
	}
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		// lista za spremanje brojeva
		ArrayList<Integer> numbers = new ArrayList<>();

			System.out.println("Unesite brojeve 0 prekida unos");
			int num = input.nextInt();
			// petljom unosimo brojeve, 0 prekida petlju
			while (num != 0) {
				numbers.add(num);
				num = input.nextInt();
			}
			// ispis najvece vrijednosti
			System.out.println("Najveci broj je: " + max(numbers));
			input.close();
		
		}
	}
