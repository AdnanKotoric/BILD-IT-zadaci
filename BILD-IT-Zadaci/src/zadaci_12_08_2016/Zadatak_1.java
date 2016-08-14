package zadaci_12_08_2016;

public class Zadatak_1 {

	public static void main(String[] args) {
		/*
		 * Program koji nasumično generiše tablicu. Pretpostavimo da se
		 * registarska tablica za auto sastoji od tri uppercase karaktera i 4
		 * broja u sljedećem formatu AAA-1234.
		 */

		// petlja kojom generisemo 3 random uppercase karaktera za prvi dio
		// tablica
		for (int i = 0; i < 3; i++) {
			char letter = (char)((int) (Math.random() * 26) + 65);
			System.out.print(letter);

		}
		// ispisujemo crtu kojom razdvajamo slova i brojeve
		System.out.print("-");
		// petlja kojom generisemo 4 random broja
		for (int i = 0; i < 4; i++) {
			System.out.print((int) (Math.random() * 10));

		}

	}
}
