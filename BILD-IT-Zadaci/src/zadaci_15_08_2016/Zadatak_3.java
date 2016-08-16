package zadaci_15_08_2016;

public class Zadatak_3 {

	public static void main(String[] args) {
		/*
		 * program koji sabira sljedeću seriju 1/3 + 3/5 + 5/7 + 7/9 + 9/11 +
		 * 11/13 ..... + 95/97 + 97/99.
		 */
		
		//varijabla u koju cemo spremati sumu za datu seriju
		double sum = 0;
		//petljom prolazimo kroz datu seriju i svaki naredni broj poevacavamo za 2  kako bi ostali neparni brojevi
		for (double i = 1; i < 98; i += 2) {
			//sabiremo razlomke i dodajemo na sumu svaki put 
			sum += i / (i + 2);

		}
		//ispis rezultata
		System.out.println("Suma serije neparnih razlomaka je: " + sum);
	}

}
