package zadaci_31_08_2016;

import java.net.URL;
import java.util.Scanner;

public class Zadatak_4 {

	public static void main(String[] args) {
		try {
			// kreairamo URL objekat
			URL url = new URL("http://cs.armstrong.edu/liang/data/Scores.txt");
			// ucitavamo link
			Scanner input = new Scanner(url.openStream());
			int sum = 0;
			int count = 0;
			while (input.hasNext()) {
				// uzimamo vrijednost brojeva
				int score = input.nextInt();
				//sabiremo brojeve
				sum += score;
		
				count++;
				// ispis skora
				System.out.println("Score: " + score);
			}
			// ispis ukupnog i ispis prosjeka
			System.out.println("Ukupna suma : " + sum);
			System.out.println("Prosjek je " + sum / count);
			input.close();
		}
		// hvatamo gresku ukoliko postoji
		catch (java.net.MalformedURLException ex) {
			System.out.println("Invalid URL");
		} catch (java.io.IOException ex) {
			System.out.println("I/O Errors: no such file");
		}

	}

}
