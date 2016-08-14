package zadaci_13_08_2016;

public class Zadatak_3 {

	public static void main(String[] args) {
		/*
		 * Emirp brojevi (prime unazad) je nepalindromski prosti broj koji je
		 * prosti broj i kada ispišemo naopako. Na primjer, broj 17 i broj 71 su
		 * prosti brojevi tako da su brojevi i 17 i 71 emirp brojevi. Napisati
		 * program koji ispisuje prvih 100 emirp brojeva, 10 brojeva po liniji.
		 */
		int emirps = 0;// brojac za brojeve koji su i prime unazad
		int counter = 0; // brojac za ispis u liniji

		// petljom provjeravamo sve brojeve koji su prime a nisu palindromi,
		// petlja provjerava sve dok broj emirp-a ne bude 100
		for (int i = 2; emirps < 100; i++) {
			// postavljamo uslov, pozivamo metode za provjeru da li je broj
			// prost, ukoliko je prost da li je prost i kad se ispise unazad, i
			// provjeravamo da li je broj palindrom sto ne smije biti u datom slucaju
			if (isPrime(i) && isPrime(reverse(i)) && !isPalindrome(i)) {
				emirps++;//kada pronadje emirp povecavamo brojac
				System.out.print(i + " ");
				counter++;//ujedno povecamo i brojac za ispis brojeva po liniji
				if (counter == 10) {
					System.out.println();
					counter = 0;//kada brojac za ispis dosegne 10 nastavljamo ispis u novoj liniji, brojac resetujemo na 0
				}
			}

		}

	}

	
	public static boolean isPrime(int number) {
		for (int divisor = 2; divisor <= number / 2; divisor++) {
			if (number % divisor == 0) {
				return false; // ukoliko je djeljiv sa nekim drugim brojem osim
								// 1 i sa samim sobom vracamo false, broj nije
								// prost
			}
		}

		return true; // u suprotnom broj je prost i vracamo true
	}

	public static boolean isPalindrome(int number) {

		return (number == reverse(number));// pozivamo metodu koja nam vraca
											// broj naopako ispisan i
											// provjeravamo da li je Palindrom
											// tj isti i kada se okrene naopako

	}

	public static int reverse(int number) {
		// varaijabla u koju spremamo naopako okrenuti broj
		int reverse = 0;
		int digit;
		// petljom rastavljamo broj koji je korisnik unio
		do {
			digit = number % 10;// kada podijelimo uneseni broj sa 10 kao
								// ostatak nam ostaje zadnji broj
			reverse = reverse * 10 + digit; // zadnji broj koji smo dobili
											// dodajemo na varijablu reverse i
											// sada ce biti na prvom mjestu
			number /= 10;// na kraju broj podijelimo sa 10 da bi nastavili sa
							// ciframa koje su nam ostale kod broja koji je
							// korisnik unio da i njih ispisemo napako
		} while (number != 0);// petlja radi sve dok broj koji je korisnik unio
								// djelivsi ga u petlji ne bude 0

		return reverse;// vracamo naopako okrenut broj

	}

}
