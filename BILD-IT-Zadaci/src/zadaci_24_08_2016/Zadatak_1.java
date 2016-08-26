package zadaci_24_08_2016;

import java.math.BigInteger;

public class Zadatak_1 {

	public static void main(String[] args) {
	
		// Postavljamo na prvi 50 cifreni broj
				BigInteger numb = new BigInteger(
						"10000000000000000000000000000000000000000000000000");

				// Brojac setujemo na 0
				int counter = 0;

				// Petlja radi dok brojac ne bude jednak 10
				while (counter < 10) {

					// Ispitujemo da li je svaki sljedeci broj djeljiv sa 2 ili 3
					if (numb.mod(new BigInteger("2")).equals(new BigInteger("0"))
							|| numb.mod(new BigInteger("3"))
									.equals(new BigInteger("0"))) {

						// Povecava se brojac ukolikoj e uslov tacan
						counter++;

						// Ispis
						System.out.println(numb);
					}
					// Povecavamo broj 
					numb = numb.add(new BigInteger("1"));
		}
	}

}
