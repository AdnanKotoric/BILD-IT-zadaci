package zadaci_08_08_2016;

public class zadatak_4 {

	public static void main(String[] args) {
		/*
		 * Pozitivni cijeli broj je savršen broj ukoliko je jednak zbiru svih
		 * svojih pozitivnih djelilaca, isključujući sebe.Samo 4 savršena broja
		 * postoje u rasponu od 0 do 10.000. Program koji ispisuje sva 4.
		 */
		// postavljamo varijablu number na 10.000 jer do tog broja trazimo
		// savrsene brojeve
		int number = 10000;

		int sum = 0;
		// petljom provjeravamo sve brojeve u datom rasponu, i spremamo zbir
		// svih djelilaca broja kojeg trenutno provjeravamo(i), i ukoliko
		// suma svih djelilaca je jednaka broju koeg provjerava petlja(i)
		// ispisuje ga
		System.out.println("Savrseni brojevi u rasponu od 0 do 10.000 su: ");
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j < i; j++) {

				if (i % j == 0)

					sum += j;
			}

			if (sum == i) {

				System.out.print(i + " ");
			}

			sum = 0;// nakon provjere sum postavljamo ponovo na 0 kako bi
					// provjerili naredni broj
		}
	}

}
