package zadaci_31_08_2016;

import java.net.URL;
import java.util.Scanner;

public class Zadatak_3 {

	public static void main(String[] args) {
		try {
			int word = 0;
			// kreiramo objekat za URL
			URL url = new URL("http://cs.armstrong.edu/liang/data/Lincoln.txt");
			// citamo ga
			Scanner input = new Scanner(url.openStream());
			while (input.hasNext()) {
				String line = input.next();
				// brojimo rijeci sa stranice
				word++;
				// ispisujemo svaku rijec
				System.out.println(line);
			}
			// ispisujemo ukupan broj rijeci
			System.out.println("Fajl sadrzi " + word + " rijeci");
			input.close();
		} catch (java.net.MalformedURLException ex) {
			System.out.println("Invalid URL");
		} catch (java.io.IOException ex) {
			System.out.println("I/O Errors: no such file");
		}
	}
}
