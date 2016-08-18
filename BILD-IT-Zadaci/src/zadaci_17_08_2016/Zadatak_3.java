package zadaci_17_08_2016;

public class Zadatak_3 {

	public static void main(String[] args) {
		/*
		 * U javi, short vrijednost se sprema u samo 16 bita. Napisati program
		 * koji pita korisnika da unese short broj te mu ispiše svih 16 bita za
		 * dati cijeli broj. Na primjer, ukoliko korisnik unese broj 5 - program
		 * mu ispisuje 0000000000000101
		 */
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Molimo unesite vas broj short tipa: ");
		short num = input.nextShort();
		// unijeti broj pretvaramo u binarni string koji nam vraca broj po bazi
		// 2
		String bin = Integer.toBinaryString(num);
		System.out.println("Binarni kod unesenog broja je: ");

		int br = 0;
		// posto nam je trenutno broj u stringu pretvaramo ga u int da bi ga
		// koristili u petlji
		int b = Integer.parseInt(bin);
		// Pravimo niz sa 16 clanova
		int[] array = new int[16];
		// petljom unosimo brojeve od zadnje do prve cifre, na preostala mjesta
		// nakon unosenja broja bit ce 0 kao standardne vrijednosti
		for (int i = array.length - 1; i >= 0; i--) {
			br = b % 10;
			array[i] = br;
			b = b / 10;
		}
		// ispis brojeva u nizu
		for (int i : array) {
			System.out.print(i);

		}

	}

}
