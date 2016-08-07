package zadaci_05_08_2016;

public class Zadatak_2 {

	public static void main(String[] args) {
		/*
		 * Program koji simulira nasumično izvlačenje karte iz špila od 52
		 * karte. Program ispisuje koja karta je izvucena
		 */
		// U prvi niz spremimo oznake karata koje imamo
		String[] karta = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10",
				"J", "Q", "K" };
		// U drugi niz spremamo znakove karata
		String[] znak = { "Srce", "Pik", "Djetelina", "Kocka" };
		
		// indekse nizova cemo iskoristit tako sto cemo nasumicno dobivati ih i
		// na indeksu koji dobijemo printamo broj odnsono znak znak karte
		int index1 = (int) (Math.random() * karta.length);// indeks za brojeve
															// karata
		int index2 = (int) (Math.random() * znak.length);// indeks za znakove
															// karata
		System.out.println("Karta koju ste izvukli je " + karta[index1]
				+ " u znaku " + znak[index2]);

	}

}
