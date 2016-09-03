package zadaci_01_09_2016;

import java.util.ArrayList;
import java.util.Collections;

public class Zadatak_5 {

	
		public static void sort(ArrayList<Number> list) {
			// pravimo dvije liste
			ArrayList<Integer> list1 = new ArrayList<>();
			ArrayList<Number> list2 = new ArrayList<>();
			// dodajemo vrijednosti iz liste1 u drugu privremenu listu
			for (int i = 0; i < list.size(); i++) {
				list1.add(list.get(i).intValue());
				// sortiramo listu
				Collections.sort(list1);
			}
			//dodajemo sortiranu listu drugoj listi
			list2.addAll(list1);
			// ispis listi
			System.out.println(list2.toString());
		}

		public static void main(String[] args) {
			ArrayList<Number> list = new ArrayList<>();
			int count = 0;
			// dodajemo 20 nasumicnih karaktera u listu pomoccu petlje
			while (count < 20) {
				list.add((int) (Math.random() * 100));
				// brojac za brojeve
				count++;
			}
			// ispis
			System.out.println(list.toString());
			// pozivamo metodu
			sort(list);
	}
}
