package zadaci_27_08_2016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Zadatak_2 {


		public static void sort(ArrayList<Integer> list) {
			// sortiramo listu pomocu Collections
			Collections.sort(list);
			// printamo listu kao string
			System.out.print(list.toString());

		}

		public static void main(String[] args) {
		

			Scanner input = new Scanner(System.in);
				ArrayList<Integer> list = new ArrayList<>();
				int count = 0;
				System.out.println("Unesite 5 brojeva");
				// dodajemo u listu brojeve dok ne korisnik ne unese 5
				while (count < 5) {
					int num = input.nextInt();
					list.add(num);
					count++;
				}
				input.close();
				// poziv metode
				sort(list);
			} 
		

	}