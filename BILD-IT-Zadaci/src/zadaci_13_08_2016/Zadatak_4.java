package zadaci_13_08_2016;

public class Zadatak_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pPrimes = 0;// brojac za palindrom primes brojeve
		int counter = 0;// brojac za ispis po liniji
		// petljom provjeravamo sve brojeve od 2 pa sve dok ne pronadje 100-ti
		// palindrom prime broj
		for (int i = 2; pPrimes < 100; i++) {
			// postavljamo uslov i pozivamo metode unutar njega, provjeravamo da
			// li je broj prost i ujedno mora biti i palindrom
			if (isPrime(i) && isPalindrom(i)) {
				System.out.print(i + " ");
				counter++;// povecavamo brojac za ispis po liniji
				pPrimes++;// povecavamo brojac palindrom prime brojeva
				if (counter == 10) {
					System.out.println();
					counter = 0; // kada brojac za ispis brojeva po liniji
									// desegne 10 nastavljamo printat u novoj
									// liniji i brojac resetujemo na 0
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

	public static boolean isPalindrom(int number) {

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
