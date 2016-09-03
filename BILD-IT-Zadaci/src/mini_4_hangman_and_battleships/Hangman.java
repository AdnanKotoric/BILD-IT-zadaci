package mini_4_hangman_and_battleships;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Hangman {

	// Kraj igre je sa 6 gresaka
	private static final int LOSE_CONDITION = 6;

	public static void main(String[] args) {
		// U strinng spremamo sve rijeci iz fajla.
		String text = "";
		try {
			// pravimo novi fajl u kojeg spremamo rijeci za pogoditi

			java.io.File words = new java.io.File("hangman.txt");
			words.createNewFile();

			FileReader reader = new FileReader("hangman.txt");

			// kreiramo buffered reader za citanje fajla
			BufferedReader bReader = new BufferedReader(reader);
			// citamo svako liniju fajla dok ne naidje na praznu linije tj null

			String line = bReader.readLine();

			while (line != null) {
				text += line + ",";

				line = bReader.readLine();
			}
			bReader.close();
		} catch (Exception e) {
			System.out.println("ERROR: There was a problem reading the file.\n"
					+ e.getMessage());
			System.exit(1);
		}

		// Splitamo rijeci iz fajla tj razdvajamo ih na mjestima gdje su zarezi
		// i spremamo u niz
		String[] words = text.split(",");
		// generisemo random rijec iz niza
		Random rand = new Random();

		int randNum = rand.nextInt(words.length - 1);
		// uzimamo nasumicnu rijec za pogadjati
		String wordToGuess = words[randNum];

		// pravimo niz sa 26 elemenata za slova koja smo vec koristili
		String[] lettersGuessed = new String[26];

		int lettersIndex = 0;

		// brojac za greske
		int mistakes = 0;

		Scanner input = new Scanner(System.in);

		// boolean ukoliko korisnik pobijedi
		boolean youWon = false;

		// u privremenu varijablu spremamo unos korisnika za slovo
		CharSequence guess = "";

		/*
		 * petlja kojom korisnik unosi slova i kojom pratimo je li pobijedio ili
		 * ne
		 */
		while (mistakes < LOSE_CONDITION && !youWon) {
			// ispis vjesala
			displayHangman(mistakes);
			// ispis rijeci za pogoditi
			displayWord(wordToGuess, lettersGuessed);
			// ispisujemo slova koja su iskoristena
			System.out.println("Koristena slova:"
					+ Arrays.toString(lettersGuessed));

			guess = input.next().toUpperCase();
			// dodajemo slova u niz za iskoristenim slovima
			lettersGuessed[lettersIndex] = guess.toString();
			lettersIndex += 1;
			// povecavamo brojac za greske ukoliko nije pogodjeno slovo
			if (!wordToGuess.contains(guess)) {
				mistakes = mistakes + 1;
				System.out.println("Zao nam je. slovo " + guess.toString()
						+ " nije sadrzano u rijeci.");
			}
			// provjeravamo da li je korisnik pobijedio
			youWon = gameWon(wordToGuess, lettersGuessed);
		}

		if (youWon) {
			System.out.println("Cestitamo, pobijedili ste!! Rijec je "
					+ wordToGuess);
		} else {
			displayHangman(mistakes);
			System.out.println("Zao nam je, izgubili ste! Rijec je "
					+ wordToGuess);
		}
	}

	// ispis vjesala za broj gresaka napravljenih
	public static void displayHangman(int mistakes) {
		String line1 = "  O   |    \n";
		if (mistakes == 0) {
			line1 = "      |    \n";
		}

		String line2 = "      |    \n";
		if (mistakes >= 4) {
			line2 = " \\|/  |    \n";
		} else if (mistakes == 3) {
			line2 = " \\|   |    \n";
		} else if (mistakes == 2) {
			line2 = "  |   |    \n";
		}

		String line3 = "      |    \n";
		if (mistakes >= 5) {
			line3 = "  |   |    \n";
		}

		String line4 = "      |    \n";
		if (mistakes >= 6) {
			line4 = "  ^   |    \n";
		}

		System.out.println("  -----    \n" + "  |   |    \n" + line1 + // "  O   |    \n"+
				line2 + // " \\|/  |    \n"+
				line3 + // "  |   |    \n"+
				line4 + // "  ^   |    \n"+
				"      |    \n" + "  -------- \n");
	}

	public static void displayWord(String wordToGuess, String[] lettersGuessed) {
		System.out.print("Rijec za pogoditi: ");
		// petljom prolazimo kroz rijec
		for (int i = 0; i < wordToGuess.length(); i++) {
			// ukoliko pogodimo slovo ispisujemo ga u suprotnom ispis donje crte
			char temp = wordToGuess.charAt(i);
			if (stringArrayContains(lettersGuessed, temp)) {
				System.out.print(wordToGuess.charAt(i) + " ");
			} else {
				System.out.print("_ ");
			}
		}
		System.out.println("\n");
	}

	public static boolean gameWon(String wordToGuess, String[] lettersGuessed) {
		// petljom provjeravamo pogodjena slova
		for (int i = 0; i < wordToGuess.length(); i++) {

			char temp = wordToGuess.charAt(i);
			if (!stringArrayContains(lettersGuessed, temp)) {
				return false;
			}
		}
		return true;
	}

	public static boolean stringArrayContains(String[] strArray, char letter) {
		for (int i = 0; i < strArray.length; i++) {
			if (strArray[i] != null
					&& strArray[i].equalsIgnoreCase(String.valueOf(letter))) {
				return true;
			}
		}
		return false;
	}

	// dodavanje djelova tijela za vjesala i ispis za napravljene greske
	public static void testHangman() {
		int i = 0;
		displayHangman(i++);
		displayHangman(i++);
		displayHangman(i++);
		displayHangman(i++);
		displayHangman(i++);
		displayHangman(i++);
		displayHangman(i++);
		displayHangman(i++);
	}
}