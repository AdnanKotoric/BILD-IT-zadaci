package mini_3_tic_tac_toe_and_connect4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Connect_4 {
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// kreiramo odmah plocu(visedimenzionalni niz) i objekat za klasu
		// Connect kako bi koristili njene metode
		Connect game = new Connect();
		int[][] board = new int[6][7];
		// postavljamo brojac diskova
		int counterDisk = 0;
		// string u koji cemo spremat naziv boje
		String collor;
		// disk koji trenutno igra
		int disk;
		// i kolona za unos korisnika
		int column;
		// ispisujemo plocu
		game.displayBoard(board);
		// petlja se vrti sve dok nemamo pobjednika ili je ploca popunjena
		do {
			// svakim ulaskom povecavamo brojac
			counterDisk++;
			// uslovom regulisemo koji je igrac na redu za igru i shodno tome
			// mijenjamo boju
			if (counterDisk % 2 == 0) {
				collor = "crveni";
				disk = 1;
			} else {
				collor = "zuti";
				disk = 2;
			}
			// unos korisnika za kolonu u koju zeli ubaciti disk
			System.out.println("Postavite " + collor
					+ " disk u zeljenu kolonu (0–6):");
			column = checkInput();// provjera za ispravan unos
			// postavljamo disk ukoliko kolona nije puna
			for (int i = board.length - 1; i >= 0; i--) {

				if (board[i][column] == 0) {
					board[i][column] = disk;
					break;
				}
				if (i == 0)
					System.out.println("Kolona je puna, pokusajte ponovo.");
			}
			game.displayBoard(board);// ponovni ispis ploce

		} while (game.checkBoard(board) == false && counterDisk != 6 * 7);
		// provjeravamo da li imamo pobjednika ili je nerijeseno
		if (game.checkBoard(board)) {
			System.out.println(collor + " igrac je pobijedio");

		} else {
			System.out.println("Nerijeseno je.");
		}
	}

	public static int checkInput() {

		int num = 0;
		boolean error = true; // postavljamo da greska postoji

		do {
			try {
				num = input.nextInt();
				if (num > 6 || num < 0)// provjera za indeks kolone
					throw new InputMismatchException(
							"niste unijeli ispravan broj kolone!");
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

class Connect {

	public void displayBoard(int[][] board) {
		// ispis ploce te diskova na unesenim pozicijama
		for (int i = 0; i < board.length; i++) {
			System.out.print("|");
			for (int j = 0; j < board[i].length; j++) {
				char player;
				if (board[i][j] == 1) {
					player = 'C';
				} else if (board[i][j] == 2) {
					player = 'Z';
				} else {
					player = ' ';
				}

				System.out.print(player + "|");
			}
			System.out.println();
		}

		System.out.print("---------------");

		System.out.println();

	}

	public boolean checkBoard(int[][] board) {
		// provjeravamo da li imamo pobjednika trazimo 4 istobojna diska
		// vodoravno uspravno ili dijagonalno
		return checkVer(board) || checkHor(board) || checkDia(board);

	}

	public boolean checkVer(int[][] board) {
		// provjeravamo vertikalno da li imaju 4 ista diska
		// petljom prolazimo redove
		for (int i = 0; i < board[0].length; i++) {
			int start = board[0][i];
			int count = 1;
			for (int j = 1; j < board.length; j++) {
				if (start == board[j][i] && start != 0) {
					count++;
				} else {
					start = board[j][i];
					count = 1;
				}

				if (count == 4) {
					return true;
				}
			}
		}

		return false;

	}

	public boolean checkHor(int[][] board) {

		// provjeravamo horizontalno za pobjednika
		// petljom prolazimo kolone
		for (int i = 1; i < board.length; i++) {
			int start = board[i][0];
			int count = 1;
			for (int j = 1; j < board[i].length; j++) {
				if (start == board[i][j] && start != 0) {
					count++;
				} else {
					start = board[i][j];
					count = 1;
				}

				if (count == 4) {
					return true;
				}
			}
		}

		return false;

	}

	public boolean checkDia(int[][] board) {
		// provjeravamo dijagonalno u nizu sa po dvije petlje

		// od gornjeg prvog lijevog do donjeg zadnjeg desnog indeksa
		// prolazimo kroz redove

		for (int i = 0; i < board.length; i++) {
			int start = board[i][0];
			int count = 1;
			for (int j = i + 1, k = 1; j < board.length && k < board[0].length; j++, k++) {
				if (start == board[j][k] && start != 0) {
					count++;
				} else {
					start = board[j][k];
					count = 1;
				}
				if (count == 4) {
					return true;
				}
			}
		}

		// drugom petljom prolazimo kroz kolone

		for (int i = 0; i < board[0].length; i++) {
			int start = board[0][i];
			int count = 1;
			for (int j = i + 1, k = 1; j < board[0].length && k < board.length; j++, k++) {
				if (start == board[k][j] && start != 0) {
					count++;
				} else {
					start = board[k][j];
					count = 1;
				}

				if (count == 4) {
					return true;
				}
			}
		}

		// od gorenjg desnog do donjeg lijevog indeksa
		// prolazimo kolone

		for (int i = 0; i < board[0].length; i++) {
			int start = board[0][i];
			int count = 1;
			for (int j = 1, k = i - 1; j < board.length && k >= 0; j++, k--) {
				if (start == board[j][k] && start != 0) {
					count++;
				} else {
					start = board[j][k];
					count = 1;
				}
				if (count == 4) {
					return true;
				}
			}
		}

		// drugom prolazimo redove za te indekse

		for (int i = 0; i < board.length; i++) {
			int start = board[i][board[i].length - 1];
			int count = 1;
			for (int j = i + 1, k = board[0].length - 2; j < board.length
					&& k >= 0; j++, k--) {
				if (start == board[j][k] && start != 0) {
					count++;
				} else {
					start = board[j][k];
					count = 1;
				}
				if (count == 4) {
					return true;
				}
			}
		}

		return false;

	}
}
