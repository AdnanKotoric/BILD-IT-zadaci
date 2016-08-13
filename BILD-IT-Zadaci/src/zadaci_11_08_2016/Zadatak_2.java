package zadaci_11_08_2016;

public class Zadatak_2 {

	public static void main(String[] args) {
		/*
		 * program koji ispisuje sve proste brojeve od 2 do 1000, ukljućujući i
		 * 2 i 1000. Program treba da ispiše 8 brojeva po liniji te razmak
		 * između brojeva treba da bude jedan space.
		 */
		// Brojac za proste brojeve setujemo na 0
		int counter = 0;
		System.out.println("Prosti brojevi u rasponu od 2 do 1000: ");
		// Petljom prvojeravamo brojeve u datom rasponu, u petlji pozivamo
		// metodu koja provjerava da li je broj prost i ukolio jeste ispisuje ga
		for (int numb = 2; numb <= 1000; numb++) {
			if (Prime(numb)) { 
				System.out.print(numb + " ");
				counter++; // za svaki prost broj povecamo brojac
				if (counter == 8) { // kada brojac bude jednak 8 ispisujemo prebacujemo u novu liniju
					System.out.println();
					counter = 0;//brojac resetujemo na 0
				}
			}
		}

	}

	// metoda za provjeru prostih brojeva
	public static boolean Prime(int numb) {

		// petlja koja prolazi sve brojeve do datog broja i koja provejrava da
		// li je broj prost
		for (int n = 2; n < numb; n++) {
			// uslov ukoliko je broj djeljiv sa nekim drugim brojem osim sa 1 i
			// sam sa sobom vracamo false
			if (numb % n == 0) {
				return false;
			}

		}
		// ukoliko uslov nije tacan vracamo true tj da je broj prost
		return true;
	}

}
