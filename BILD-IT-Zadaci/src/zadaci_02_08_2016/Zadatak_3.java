package zadaci_02_08_2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Zadatak_3 {
	/*
	 * Program za pravljenje file-a i brojanje rijeci, linija i karaktera unutar
	 * istog
	 */

	public static void main(String[] args) throws IOException {
		// postavljamo brojace koji su nam potrebni na 0 i kreiramo novi file

		int lineCounter = 0;
		int charCounter = 0;
		int wordCounter = 0;
		try {
			File fajl = new File("fajl.txt");

			fajl.createNewFile();
			Scanner input = new Scanner(fajl);

			// Pravimo petlju pomocu koje citamo unutar file-a i pomocu brojaca
			// spremamo koliko ima linija, karaktera i rijeci unutar file-a
			while (input.hasNext()) {
				String lineHolder = input.nextLine();
				lineCounter++;
				charCounter += lineHolder.length();
				String[] wordCheck = lineHolder.split(" ");
				wordCounter += wordCheck.length;
			}
			input.close();

			System.out.println("Broj rijeci je> " + wordCounter);
			System.out.println("Broj linije je: " + lineCounter);
			System.out.println("Broj karaktera jr: " + charCounter);

		}// hvatanje greske u slucaju da fajl nije pronadjen
		catch (FileNotFoundException ex) {
			System.out.println("Vas fajl ne postoji");
		}
	}
}
