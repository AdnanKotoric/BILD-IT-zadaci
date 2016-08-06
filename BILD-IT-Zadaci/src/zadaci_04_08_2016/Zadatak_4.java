package zadaci_04_08_2016;

public class Zadatak_4 {

	public static void main(String[] args) {
		/*
		 * metoda koja printa 100 nasumičnih uppercase karaktera i 100 nasumičnih brojeva, 10 po liniji.
		 */
		Random();
	}

	public static void Random() {
		//postavimo brojace karaktera i brojeva kako bi ispisavali u konzoli samo 10 po liniji
		int counterN = 0;
		int counterL = 0;
		//petlja kojom generisemo 100 random brojeva
		for (int i = 0; i < 100; i++) {
			System.out.print((int) (Math.random() * 10) + " ");
			counterN++;
			//uslov da printamo samo 10 brojeva po liniji i postavljanje brojaca na 0
			if (counterN == 10) {
				System.out.println();
				counterN = 0;
			}
		}
		System.out.println();
		//petlja kojom generisemo 100 random uppercase karaktera 
		for (int i = 0; i < 100; i++) {
			int numb = ((int) (Math.random() * 26) + 65);
			char letter = (char) numb;
			System.out.print(letter + " ");
			counterL++;
			//uslov da printamo samo 10 karaktera po liniji i postavljanje brojaca na 0
			if (counterL == 10) {
				System.out.println();
				counterL = 0;
			}

		}

	}

}
