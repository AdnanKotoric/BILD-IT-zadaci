package zadaci_31_08_2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_1 {

	public static void main(String[] args) throws FileNotFoundException {
		// Listu u kojju cuvamo linije koda 
		ArrayList<String> lines = new ArrayList<>();
		// citamo fajl i  spremamo linije
		File file = new File("test.txt");
		Scanner input = new Scanner(file);
		while (input.hasNextLine()) {
			lines.add(input.nextLine());
		}
		input.close();

		// spremamo u novi fajl sredjen kod i printamo korisniku
		File file3 = new File(format(lines));
		Scanner input2 = new Scanner(file3);
		while (input2.hasNextLine()) {
			System.out.println(input2.nextLine());
		}
		input2.close();

	}

	public static String format(ArrayList<String> linije)
			throws FileNotFoundException {
		// prolazimo kroz listu i trazimo zagrade
		for (int i = 0; i < linije.size(); i++) {
			String a = linije.get(i);
			char[] characters = a.toCharArray();
			int brojac = 0;
			for (int j = 0; j < characters.length; j++) {
				if (characters[j] == ' ' || characters[j] == '{') {
					brojac++;
				}
			}
			// kada pronadje zagradu prebacujemo je u prethodni red i brisemo red u kojem je bila
			if (brojac == characters.length) {
				linije.set((i - 1), (linije.get(i - 1) + " {"));
				linije.remove(i);
			}
		}
		// ispis u novom fajlu
		String name = "Reformat2.txt";
		File file2 = new File(name);
		try (PrintWriter upisi = new PrintWriter(file2)) {
			for (int i = 0; i < linije.size(); i++) {
				upisi.println(linije.get(i));
			}
		}
		return name;
	}
}
