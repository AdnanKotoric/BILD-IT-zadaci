package zadaci_12_08_2016;

import java.util.Scanner;

public class Zadatak_2 {

	public static void main(String[] args) {
		/*
		 * program koji pita korisnika da unese dva cijela, pozitivna broja te
		 * ispisuje najveći i najmanji zajednički djelilac za ta dva broja.
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite prvi cijeli pozitivan broj: ");
		int numb1 = input.nextInt();
		System.out.println("Unesite drugi cijeli pozitivan broj: ");
		int numb2 = input.nextInt();
		int divmax = 0; // najveci zajednicki djelilac
		int divmin = 0; // najmanji zajednicki djelilac
		int div = 2; // djelilac
		int counter = 0;// brojac da pojednostavimo trazenje najmanjeg
						// zajednickog djelioca
		input.close();
		// u while petlji stavljamo uslov da se izvrsava sve dok je djelilac
		// manji ili jednak od prvog
		// ili drugog broja u zavisnosti koji je od datih brojeva manji
		while (div <= numb1 && div <= numb2) {
			// uslov po kojem trazimo najveci i najmanji zajednicki djelilac
			if (numb1 % div == 0 && numb2 % div == 0) {

				counter++;// ako je broj zajednciki djelilac povecavamo brojac
				divmax = div;// a takodjer dodjeljujemo taj broj najvecem
								// djeliocu

				if (counter == 1) {
					divmin = div;// za prvi broj koji je zajednicki djelilax
									// ujedno je i najmanji stoga kada je brojac
									// na 1 to nam je najmanji zajednicki
									// djelilac
				}

			}
			div++; // sljedeci moguci djelilac
		}
		// ispis u konzoli
		System.out.println("Najmanji zajednicki djelilac za " + numb1 + " i "
				+ numb2 + " je " + divmin);
		System.out.println("Najveci zajednicki djelilac za " + numb1 + " i "
				+ numb2 + " je " + divmax);

	}
}