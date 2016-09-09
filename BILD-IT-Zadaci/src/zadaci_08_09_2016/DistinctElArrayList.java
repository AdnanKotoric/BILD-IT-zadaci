package zadaci_08_09_2016;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class DistinctElArrayList {
	public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
		// kreiramo novu listu
		ArrayList<E> list1 = new ArrayList<E>();
		// niz za prebrojavanje
		int[] count = new int[list.size()];
		int j = 0;
		for (int i = 0; i < list.size(); i++) {
			for (j = 0; j < list.size(); j++) {
				// ukoliko pronadje isti broj
				if (list.get(i).equals(list.get(j))) {
					// povecavamo brojac
					count[j]++;
				}
			}
			// dodajemo u novu listu
			if (count[i] == 1) {
				list1.add(list.get(i));
			}
		}
		// vraca novu listu
		return list1;

	}

	public static void main(String[] args) {
		try (java.util.Scanner input = new java.util.Scanner(System.in)) {
			System.out.println("Unesite 10 brojeva u listu ");
			ArrayList<Integer> list1 = new ArrayList<>();
			int count = 0;
			//petljom dodajemo brojeve u listu
			while (count < 10) {
				list1.add(input.nextInt());
				count++;
			}
			// ispis liste
			System.out.println(removeDuplicates(list1).toString());
		} catch (InputMismatchException e) {
			System.out.println("Pogresan unos");
			main(args);
		}
	}

}