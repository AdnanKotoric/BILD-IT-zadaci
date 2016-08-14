package zadaci_12_08_2016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Zadatak_4 {

	public static void main(String[] args) {
		/*
		 * program koji pita korisnika da unese 3 cijela broja te mu ispiše ta
		 * ista tri broja u rastućem redosljedu. Bonus: Napisati metodu koja
		 * prima tri cijela broja kao argumente te vraća brojeve u rastućem
		 * redosljedu.
		 */
		Scanner input = new Scanner(System.in);
		// unos korisnika
		System.out.print("Unesite prvi broj: ");
		int num1 = input.nextInt();
		System.out.print("Unesite drugi broj: ");
		int num2 = input.nextInt();
		System.out.print("Unesite treci broj: ");
		int num3 = input.nextInt();
		input.close();
		// pozivamo metodu za sortiranje i prosljedjujemo brojeve
		sortNumbers(num1, num2, num3);
	}

	// Metoda koja sortira brojeve
	public static void sortNumbers(int num1, int num2, int num3) {
		// kreiramo listu i u nju smjestamo unesene brojeve
		ArrayList<Integer> list = new ArrayList<>();
		list.add(num1);
		list.add(num2);
		list.add(num3);
		// pomocu klase Collections sortiramo brojeve u listi u rastucem
		// redoslijedu
		Collections.sort(list);
		// ispisujemo brojeve na datim indeksima nakon sortiranja
		System.out.println("Brojevi u rastucemo redoslijedu: " + list.get(0)
				+ " " + list.get(1) + " " + list.get(2));

	}

}
