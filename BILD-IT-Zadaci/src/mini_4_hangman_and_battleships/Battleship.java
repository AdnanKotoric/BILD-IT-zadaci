package mini_4_hangman_and_battleships;

import java.util.*;

public class Battleship {

	static Scanner ulaz = new Scanner(System.in);

	// Dimenzije table su 5x5
	static int[][] dimenzije = new int[5][5];

	public static void main(String[] args) {

		// Ovaj niz se koristi za lokacije brodica
		int[][] brodovi = new int[3][2];

		//Niz koji pamti pokusaje
		int[] potez = new int[2];

		int pokusaj = 0;
		int pogodio = 0;

		header();
		brodovi(brodovi);
		printTabla(dimenzije);
		tabla(dimenzije);

		//Petlja koja vrti igru
		do {

			pucaj(potez);
			pokusaj++;

			if (pogodak(potez, brodovi)) {

				pogodio++;
			} else {
				System.out.print("Pokusajte ponovo:");
			}

			update(potez, brodovi, dimenzije);

			printTabla(dimenzije);

		} while (pogodio != 3);

		System.out.println("Pogodili ste 3 broda u " + pokusaj + " poteza.");
		tabla(dimenzije);
	}

	//Metoda uzima koordinate od korisnika
	public static void pucaj(int[] potez) {

		try{
		System.out.print("Red: ");
		potez[0] = ulaz.nextInt() - 1;
		
		System.out.print("Kolona: ");
		potez[1] = ulaz.nextInt() - 1;
		
		
		}catch (ArrayIndexOutOfBoundsException ex){
			System.err.println("Unesite brojeve 1-5!");
			System.exit(0);
			//Ako korisnik unese prevelik ili premal broj
		}
		catch (Exception e){
			System.err.println("Unesite brojeve 1-5!");
			System.exit(0);
			//Ako unese nesto drugo
		}
	}

	//Metoda provjerava je li brod pogodjen
	public static boolean pogodak(int[] potez, int[][] ships) {

		for (int ship = 0; ship < ships.length; ship++) {
			if (potez[0] == ships[ship][0] && potez[1] == ships[ship][1]) {
				System.out.print("Pogodili ste brod!");
				return true;

			}
		}
		return false;
	}

	//Metoda apdejta tabelu
	public static void update(int[] potez, int[][] brodovi, int[][] tabla) {
		if (pogodak(potez, brodovi))
			dimenzije[potez[0]][potez[1]] = 1;
		else
			dimenzije[potez[0]][potez[1]] = 2;
	}

	//Metoda kreira tabelu
	public static void tabla(int[][] dimenzije) {

		for (int i = 0; i < dimenzije.length; i++) {
			for (int j = 0; j < dimenzije[i].length; j++) {
				dimenzije[i][j] = 0;
			}
		}

	}

	//Metoda stampa tabelu
	public static void printTabla(int[][] tabla) {

		System.out
				.print("\n*******************************************************\n");
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				if (tabla[i][j] == 0) {
					System.out.print("     -     ");
				} else if (tabla[i][j] == 1) {
					System.out.print("     X     ");
				} else
					System.out.print("     F     ");
			}
			System.out.println();
		}
		System.out
				.print("\n*******************************************************\n");
	}

	//Metoda kreira brodove
	public static void brodovi(int[][] brodovi) {

		Random rand = new Random();

		for (int i = 0; i < 3; i++) {
			brodovi[i][0] = rand.nextInt(5);
			brodovi[i][1] = rand.nextInt(5);

			for (int j = 0; j < i; j++) {
				if ((brodovi[i][0] == brodovi[j][0])
						&& (brodovi[i][1] == brodovi[j][1]))
					do {
						brodovi[i][0] = rand.nextInt(5);
						brodovi[i][1] = rand.nextInt(5);
					} while ((brodovi[i][0] == brodovi[j][0])
							&& (brodovi[i][1] == brodovi[j][1]));
			}

		}
	}

	//Metoda ispisuje header
	public static void header() {

		// ASCII art
		// http://patorjk.com/software/taag/#p=display&f=Graffiti&t=Type%20Something%20

		System.out
				.println("__________         __    __  .__                .__    .__ "
						+ "\n\\______   \\_____ _/  |__/  |_|  |   ____   _____|  |__ |__|_____  ______ "
						+ "\n |    |  _/\\__  \\    __\\   __\\  | _/ __ \\ /  ___/  |  \\|  \\____ \\/  ___/ "
						+ "\n |    |   \\ / __ \\|  |  |  | |  |_\\  ___/ \\___ \\|   Y  \\  |  |_> >___ \\  "
						+ "\n |______  /(____  /__|  |__| |____/\\___  >____  >___|  /__|   __/____  >      "
						+ "\n       \\/      \\/                     \\/     \\/     \\/   |__|       \\/ ");

		System.out.println();
		System.out.println();
	}
}