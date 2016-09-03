package zadaci_01_09_2016;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Zadatak_3 {

	public static void main(String[] args) {
		java.util.Scanner inp = new java.util.Scanner(System.in);
		// liste u koje spremamo
		ArrayList<String> babynames = new ArrayList<>();
		ArrayList<String> g = new ArrayList<>();
		ArrayList<String> number = new ArrayList<>();

		try {
			// unos korisnika
			System.out.println("Unesite godinu 2010 i 2016: ");
			String year = inp.nextLine();
			System.out.println("Unesite pol: ");
			String gender = inp.next();
			System.out.println("Unesite ime: ");
			String name = inp.next();
			String line = "";
			String names = "";

			// kreairamo fajl
			java.io.File file = new java.io.File("babynameranking" + year + ".txt");
			file.createNewFile();
			// pravimo skener
			Scanner input = new Scanner(file);
			//petljom spremamo u liste koje smo napravili
			while (input.hasNext()) {
				names = input.next();
				gender = input.next();
				line = input.next();
				babynames.add(names);
				g.add(gender);
				number.add(line);
			}
			System.out.println("Total of that baby names in " + year + " is:");
			for (int i = 0; i < babynames.size(); i++) {
				//provjeravamo da li ime postoji
				if (babynames.get(i).contains(name)) {
					if (babynames.get(i).equals(name)) {
						// ispisujemo ime i broj koliko je puta to ime bilo u toj godini
						System.out.println(babynames.get(i) + ": " + number.get(i));
						break;
					} else {
						System.out.println("Can't find in file");
						break;
					}
				}
			}
			input.close();
			inp.close();
		} catch (java.io.IOException ex) {
			System.out.println("I/O Errors: no such file");
		} catch (NoSuchElementException e) {
			System.out.println("No such element");
		}
	}
}