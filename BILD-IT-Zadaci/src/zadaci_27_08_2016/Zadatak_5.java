package zadaci_27_08_2016;

import java.util.ArrayList;

public class Zadatak_5 {

	public static ArrayList<Integer> combine(ArrayList<Integer> list1,
			ArrayList<Integer> list2) {
		// dodajemo jednu listu drugoj
		list1.addAll(list2);
		// ispis liste
		for (int i = 0; i < list1.size(); i++) {
			System.out.print(list1.get(i).intValue() + " ");
		}
		return list1;
	}

	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		int count = 0;
		System.out.println("Unesite 5 brojeva u listu");
		// unos brojeva u prvu listu
		while (count < 5) {
			int num = input.nextInt();
			list1.add(num);
			count++;
		}
		// resetujemo brojac
		count = 0;

		System.out.println("Unesite 5 brojeva za drugu listu");
		// unos brojeva u drugu listu
		while (count < 5) {
			int num = input.nextInt();
			list2.add(num);
			count++;
		}
		// poziv metode
		combine(list1, list2);
		input.close();
	}

}
