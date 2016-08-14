package zadaci_12_08_2016;

public class Zadatak_3 {

	public static void main(String[] args) {
		/*
		 * rogram koji poziva ovu metodu i ispisuje sve proste brojeve u rasponu
		 * od 0 do 100000.
		 */
		// petljom prolazimo brojeve u datom rasponu
		for (int i = 2; i < 100000; i++) {
			if (isPrime(i) > 0) { // postavili smo uslov u metodu da ukoliko
									// nije broj prost da nam metoda vrati 0
									// tako da sve dok je broj veci od 0 petlja
									// nam printa proste brojeve
				System.out.println(isPrime(i));
			}
		}
	}

	// metoda za provjeru prostih brojeva
	public static int isPrime(int numb) {

		// petlja koja prolazi sve brojeve do datog broja i koja provejrava da
		// li je broj prost
		for (int i = 2; i < numb; i++) {
			if (numb % i == 0) { // ako je broj djeljiv sa i, nije prost i
									// vracamo 0
				return 0;
			}
		}
		return numb;// ukoliko je broj koji provjeravamo prost vracamo ga
	}
}
