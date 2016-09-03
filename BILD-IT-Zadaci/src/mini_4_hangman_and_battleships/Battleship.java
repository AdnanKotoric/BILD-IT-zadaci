package mini_4_hangman_and_battleships;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Battleship {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// pravimo nizove za plocu i brodove
		int[][] board = new int[5][5];
		int[][] ships = new int[3][2];
		int[] shoot = new int[2];
		int attempts = 0, shotHit = 0;
		// pozivamo metode
		initBoard(board);
		initShips(ships);

		System.out.println();
		// petljom igramo, mijenjamo plocu nakon svakog pokusaja i ispis
		// korisniku da li je pogodio
		do {
			showBoard(board);
			shoot(shoot);
			// brojac pokusaja
			attempts++;
			// brojac pogodaka
			if (hit(shoot, ships)) {
				hint(shoot, ships, attempts);
				shotHit++;
			} else
				hint(shoot, ships, attempts);
			// mijenjamo plocu i spremamo stanje pogodaka i
			changeboard(shoot, ships, board);
		} while (shotHit != 3);

		System.out.println("\n\n\nKraj igre! Potopili ste 3 broda u "
				+ attempts + " pokusaja");
		showBoard(board);
	}

	// kreiramo plocu
	public static void initBoard(int[][] board) {
		for (int row = 0; row < 5; row++)
			for (int column = 0; column < 5; column++)
				board[row][column] = -1;
	}

	// ispis ploce
	public static void showBoard(int[][] board) {
		System.out.println("\t1 \t2 \t3 \t4 \t5");
		System.out.println();

		for (int row = 0; row < 5; row++) {
			System.out.print((row + 1) + "");
			for (int column = 0; column < 5; column++) {
				if (board[row][column] == -1) {
					System.out.print("\t" + "~");
				} else if (board[row][column] == 0) {
					System.out.print("\t" + "*");
				} else if (board[row][column] == 1) {
					System.out.print("\t" + "X");
				}
			}
			System.out.println();
		}
	}

	// nasuimcno postavljanje brodica
	public static void initShips(int[][] ships) {
		Random random = new Random();

		for (int ship = 0; ship < 3; ship++) {
			ships[ship][0] = random.nextInt(5);
			ships[ship][1] = random.nextInt(5);

			for (int last = 0; last < ship; last++) {
				if ((ships[ship][0] == ships[last][0])
						&& (ships[ship][1] == ships[last][1]))
					do {
						ships[ship][0] = random.nextInt(5);
						ships[ship][1] = random.nextInt(5);
					} while ((ships[ship][0] == ships[last][0])
							&& (ships[ship][1] == ships[last][1]));
			}
		}
	}

	// metoda za pokusaj korisnika i potop brodica
	public static void shoot(int[] shoot) {
		System.out.print("Red: ");
		shoot[0] = checkInput();
		shoot[0]--;

		System.out.print("Kolona: ");
		shoot[1] = checkInput();
		shoot[1]--;
	}

	// provjeravamo da li na unesenoj lokaciji brodic
	public static boolean hit(int[] shoot, int[][] ships) {

		for (int ship = 0; ship < ships.length; ship++) {
			if (shoot[0] == ships[ship][0] && shoot[1] == ships[ship][1]) {
				System.out.printf("Potopili ste brodic na lokaciji (%d, %d)\n",
						shoot[0] + 1, shoot[1] + 1);
				return true;
			}
		}
		return false;
	}

	public static void hint(int[] shoot, int[][] ships, int attempt) {
		int row = 0, column = 0;

		for (int line = 0; line < ships.length; line++) {
			if (ships[line][0] == shoot[0])
				row++;
			if (ships[line][1] == shoot[1])
				column++;
		}

		System.out.printf("\nHint %d: \nred %d -> %d brod\n"
				+ "kolona %d -> %d brod\n", attempt, shoot[0] + 1, row,
				shoot[1] + 1, column);
	}

	// spremanje ploce nakon svakog pokusaja
	public static void changeboard(int[] shoot, int[][] ships, int[][] board) {
		if (hit(shoot, ships))
			board[shoot[0]][shoot[1]] = 1;
		else
			board[shoot[0]][shoot[1]] = 0;
	}

	// provjera unosa za lokaciju brodica
	public static int checkInput() {

		int num = 0;
		boolean error = true; // postavljamo da greska postoji

		do {
			try {
				num = input.nextInt();
				if (num < 1 || num > 5)// provjera duzine broja kartice
					throw new InputMismatchException();
				// ako je unos korektan petlja staje
				error = false;// error postaje false, greske nema
			} catch (InputMismatchException e) {
				System.out.print("Pogresan unos, unsite ponovo:  ");
				input.nextLine();
			}
		} while (error);// sve dok greska postoji ponavlja se unos

		return num;// vracamo unijeti broj
	}

}
