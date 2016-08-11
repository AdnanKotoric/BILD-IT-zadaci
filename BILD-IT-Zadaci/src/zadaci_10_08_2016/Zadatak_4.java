package zadaci_10_08_2016;

import java.util.Scanner;

public class Zadatak_4 {

	public static void main(String[] args) {
		/*
		 * Program koji pita korisnika da unese string i koji karakter želi da
		 * prebroji u datom stringu te mu ispiše koliko se puta određeni
		 * karakter ponovio u zadatom stringu
		 */
		Scanner input = new Scanner(System.in);
		// unos od strane korisnika, unosi string i krakter za kojeg zeli znati
		// koliko se puta ponovioda
		System.out.println("Unesite string: ");
		// unos stringa od strane korisnika, pretvaramo odmah sve u mala slova
		// radi lakseg prebrojavanja jer je Java case sensitive
		String s = input.nextLine().toLowerCase();
		System.out.println("Unesite slovo koje zelite prebrojati: ");
		// korisnik unosi slovo, stavili smo da unese kao string kasnije
		// varijablu letter uzimamo karakter na nultom indeksu drugog stringa(u
		// svakom slucaju korisnkik unosi jedno slovo)
		String s2 = input.next().toLowerCase();
		char letter = s2.charAt(0);
		// pozivamo metodu 9prosljedujemo joj string i karakter koji je korisnik
		// unio) koja broji koliko se karakter puta ponovio i printamo
		System.out.println(count(s, letter));
		input.close();
	}

	// metoda za prebrrojavanje ponavljanja karaktera
	public static int count(String str, char a) {
		// brojac setujemo na 0
		int counter = 0;
		// petljom prolazimo kros citav string koji korisnik unese
		for (int i = 0; i < str.length(); i++) {
			// postavljamo uslov ukoliko je karakter na datom indeksu stringa
			// jednak karakteru koji korisnik zeli prebrojati povecavamo brojac
			if (str.charAt(i) == a) {
				counter++;
			}

		}
		// vracamo brojac koliko se puta dati karakter ponovio
		return counter;

	}

}
