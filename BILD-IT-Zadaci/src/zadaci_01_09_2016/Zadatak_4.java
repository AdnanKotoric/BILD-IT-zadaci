package zadaci_01_09_2016;

import java.util.ArrayList;
import java.util.Collections;

public class Zadatak_4 {

	
		public static void shuffle(ArrayList<Number> list) {
			//shuffle liste
			Collections.shuffle(list);
			//ispis liste
			System.out.println(list.toString());
		}

		public static void main(String[] args) {
			//pravimo listu za brojeve
			ArrayList<Number> list = new ArrayList<>();
			int count = 0;
			//spremamo 20 brojeva u listu
			while (count < 20) {
				list.add(count);
				count++;
			}
			//ispis liste
			System.out.println(list.toString());
			shuffle(list);//pozivamo metodu
		}

		}
