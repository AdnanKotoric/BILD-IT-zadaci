package zadaci_11_08_2016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Zadatak_1 {

	public static void main(String[] args) {
		/*
		 * program koji pita korisnika da unese imena tri grada te ih ispiše u
		 * abecednom redu. Na primjer, ukoliko korisnik unese Chicago, Los
		 * Angeles i Atlanta kao gradove, program vraća Atlanta, Chicago, Los
		 * Angeles.
		 */
		Scanner input = new Scanner(System.in);
		// Unos korisnika za imena tri grada
		System.out.println("Unesite ime prvog grada: ");
		String town1 = input.nextLine();
		System.out.println("Unesite ime drugog grada: ");
		String town2 = input.nextLine();
		System.out.println("Unesite ime treceg grada: ");
		String town3 = input.nextLine();
		input.close();
		// Pravimo listu i smjestamo imena gradova u listu
		ArrayList<String> towns = new ArrayList<>();

		towns.add(town1);
		towns.add(town2);
		towns.add(town3);
		// pomocu klase collections i metode sort, sortiramo listu, posto slova
		// imaju svoju vrijednost kao karakteri mogu se poredit i sortirati od
		// najmanjeg do najveceg
		Collections.sort(towns);
		// petlja koja ispisuje gradove prema abecednom redu
		for (int i = 0; i < 3; i++) {
			System.out.print(towns.get(i) + " ");

		}
	}

}
