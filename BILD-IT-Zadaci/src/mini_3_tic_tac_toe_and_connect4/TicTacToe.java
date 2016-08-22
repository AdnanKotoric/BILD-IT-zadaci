package mini_3_tic_tac_toe_and_connect4;

import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		// postavljamo varijeble za igru te kreiramo objekat klase Game
		char player = 'O';
		int row, column;
		Scanner input = new Scanner(System.in);
		Game game = new Game();
		// pozivamo metodu startGame koja pravi matricu
		game.startGame();
		System.out.println("Start igre!\n");
		// ispisujemo matricu pomocu metode displayBoard
		game.displayBoard();
		// pokrecemo petlju dok ne dobijemo pobjednika ili se popune sva mjesta
		// tj. nerijeseno
		while (true) {
			// svaku rundu mijenjamo igraca koji postavlja svoj znak
			player = game.changePlayer(player);
			System.out.print("Igrac " + player + ", izaberite lokaciju za "
					+ player + " (red i kolona):");
			// unos korisnika za tu rundu
			row = input.nextInt();
			column = input.nextInt();
			// provjera da li je mjesto zauzeto ili je korisnik uzeo nevazecu
			// poziciju
			while (game.isIlegal(row, column)) {
				System.out
						.println("Pozicija koju ste izabrali vec je zauzeta ili je nepravilan unos, pokusajte ponovo.");
				// ponovo ispis matrice i uzimamo opet unos korisnika
				game.displayBoard();
				row = input.nextInt();
				column = input.nextInt();
			}
			// spremamo novo stanje matrice i unijetih znakova na pozicije
			game.updateBoard(player, row, column);
			game.displayBoard();// opet ispisujemo plocu kako bi vidjeli
								// korisnici
			// provjera da li imamo pobjednika
			if (game.isWinner()) {
				System.out.println("\nPobjednik je " + player + " igrac!");
				break;

			}
			// provjera ukoliko je nerijeseno
			if (game.isTie()) {
				System.out.println("\nNerijeseno!");
				break;
			}
		}

	}

}

class Game {
	// kreiramo matricu i postavljamo prazne karaktere radi naknadne provjere
	// pobjednika odnosno da li je nerijeseno
	char[][] board = new char[3][3];

	public void startGame() {
		for (int i = 0; i < 3; i++) {
			for (int p = 0; p < 3; p++) {
				board[i][p] = ' ';
			}
		}
	}

	public void updateBoard(char player, int row, int column) {
		// plocu osvjezavamo svakim unosom kako bi nam ostalo sve spremljeno od
		// unosa korisnika
		board[row][column] = player;

	}

	public boolean isIlegal(int row, int column) {
		// provjeravamo da li je korisnik unio prave indekse
		if ((row > 2 || column > 2) || (row < 0 || column < 0)) {
			return true;
			// ukoliko je mjesto vec popunjeno
		} else if (board[row][column] == 'X' || board[row][column] == 'O') {
			return true;
		}

		return false;
	}

	public void displayBoard() {
		// ispis ploce za igranje zajedno sa brojevima indeksa radi lakseg
		// snalazenja
		System.out.println("     -------------");
		System.out.println("  0  | " + board[0][0] + " | " + board[0][1]
				+ " | " + board[0][2] + " |");
		System.out.println("     -------------");
		System.out.println("  1  | " + board[1][0] + " | " + board[1][1]
				+ " | " + board[1][2] + " |");
		System.out.println("     -------------");
		System.out.println("  2  | " + board[2][0] + " | " + board[2][1]
				+ " | " + board[2][2] + " |");
		System.out.println("     -------------");
		System.out.println("       0   1   2 ");
	}

	public char changePlayer(char player) {
		// promjena igraca po rundi, pocinjemo od igraca X, zbog toga nam je
		// pocetna vrijednost u main O
		char newTurn = ' ';
		if (player == 'O') {
			newTurn = 'X';
		}
		if (player == 'X') {
			newTurn = 'O';
		}
		return newTurn;// vracamo proslijedjeni karakter nakon ispitivanja koji
						// je igrac vec bio na redu
	}

	public boolean isWinner() {
		// provjera za pobjednika, dati uslovi imaju opcije za mjesta ukoliko su
		// popunjena istim znakom taj znak je pobjednik
		if (board[0][0] == board[1][0] && board[1][0] == board[2][0]
				&& (board[0][0] == 'X' || board[0][0] == 'O')) {
			return true;
		} else if (board[0][1] == board[1][1] && board[1][1] == board[2][1]
				&& (board[0][1] == 'X' || board[0][1] == 'O')) {
			return true;
		} else if (board[0][2] == board[1][2] && board[1][2] == board[2][2]
				&& (board[0][2] == 'X' || board[0][2] == 'O')) {
			return true;
		} else if (board[0][0] == board[0][1] && board[0][1] == board[0][2]
				&& (board[0][0] == 'X' || board[0][0] == 'O')) {
			return true;
		} else if (board[1][0] == board[1][1] && board[1][1] == board[1][2]
				&& (board[1][0] == 'X' || board[1][0] == 'O')) {
			return true;
		} else if (board[2][0] == board[2][1] && board[2][1] == board[2][2]
				&& (board[2][0] == 'X' || board[2][0] == 'O')) {
			return true;
		} else if (board[0][0] == board[1][1] && board[1][1] == board[2][2]
				&& (board[0][0] == 'X' || board[0][0] == 'O')) {
			return true;
		} else if (board[2][0] == board[1][1] && board[1][1] == board[0][2]
				&& (board[2][0] == 'X' || board[2][0] == 'O')) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isTie() {
		// provjeravamo da li su sve pozicije popunjene tj. nisu prazne a nemamo
		// pobjednika vracamo true
		for (int i = 0; i < 3; i++) {
			for (int p = 0; p < 3; p++) {
				if (board[i][p] == ' ') {
					return false;
				}
			}
		}

		return true;
	}

}
