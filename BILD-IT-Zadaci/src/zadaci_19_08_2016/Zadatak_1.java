package zadaci_19_08_2016;

public class Zadatak_1 {

	public static void main(String[] args) {
		/*
		 * **8.4 (Compute the weekly hours for each employee) Suppose the weekly hours for all employees are stored in a two-dimensional array. Each row records an employee’s seven-day work hours with seven columns. For example, the following array stores the work hours for eight employees. Write a program that displays employees and their total hours in decreasing order of the total hours.
               Su M T W Th F Sa
       Employee 0 2 4 3 4 5 8 8
       Employee 1 7 3 4 3 3 4 4
       Employee 2 3 3 4 3 3 2 2
       Employee 3 9 3 4 7 3 4 1
       Employee 4 3 5 4 3 6 3 8
       Employee 5 3 4 4 6 3 4 4
       Employee 6 3 7 4 8 3 8 4
       Employee 7 6 3 5 9 2 7 9

		 */
		// pravimo niz sa sedmicnim satima radnika
		int[][] employeeHours = new int[][] 
				{ { 2, 4, 3, 4, 5, 8, 8 },
				{ 7, 3, 4, 3, 3, 4, 4 }, 
				{ 3, 3, 4, 3, 3, 2, 2 },
				{ 9, 3, 4, 7, 3, 4, 1 }, 
				{ 3, 5, 4, 3, 6, 3, 8 },
				{ 3, 4, 4, 6, 3, 4, 4 }, 
				{ 3, 7, 4, 8, 3, 8, 4 },
				{ 6, 3, 5, 9, 2, 7, 9 } };

		// u novom nizu sabiremo ukupan broj sati za svakog radnika i pozivamo
		// metodu koja sabire sate prosljedjujemo joj niz sa svim satima radnika
		int[][] totalHoursChart = calcTotalHours(employeeHours);

		// pozivamo metodu sto sortira novi niz sa ukupnim brojem sati svakog
		// radnika u padajucem redoslijedu od radnika sa najvise sati do radnika
		// sa najmanje sati
		descendingSort(totalHoursChart);
		// ispsiujemo niz sa ukupnim brojem sati za svakog radnika sortiran
		for (int i = 0; i < totalHoursChart.length; i++) {

			System.out.println("Radnik broj " + totalHoursChart[i][0]
					+ " ima ukupno sati = " + totalHoursChart[i][1]);
		}

	}

	public static int[][] calcTotalHours(int[][] m) {
		// pravimo novi niz za ukupan broj sati
		int[][] totalHoursChart = new int[m.length][2];
		// petljom prolazimo kroz redove niza
		for (int i = 0; i < m.length; i++) {
			totalHoursChart[i][1] = getRowTotalHour(m, i); // u drugu kolonu
															// spremamo ukupan
															// broj sati.
															// pozivom metode
															// sto sabira ukupan
															// broj sati po redu
															// spremamo na to
															// mjesto
			totalHoursChart[i][0] = i;// u prvu kolonu spremamo za kojeg smo
										// radnika sabirali sate
		}

		return totalHoursChart;// vracamo niz
	}

	public static int getRowTotalHour(int[][] m, int row) {

		int total = 0;
		// petljom sabiremo za dati red sve sate
		for (int column = 0; column < m[row].length; column++) {
			total += m[row][column];
		}
		return total;// vracamo ukupan broj sati za dati red
	}

	public static void descendingSort(int[][] m) {
		// za novi niz koji cuva koliko koji radnik ima ukupan broj sati
		// sortiramo ga prema tome koji radnik ima najvise radnih sati
		for (int i = 0; i < m.length - 1; i++) {
			// moramo paziti da broj sati prati i od kojeg radnika su sati tako
			// da prebacujemo citav red
			int currentIndex = i;
			int currentMax = m[i][1];
			int empNum = m[i][0];
			for (int k = i + 1; k < m.length; k++) {

				if (currentMax < m[k][1]) {
					currentMax = m[k][1];
					currentIndex = k;
					empNum = m[k][0];
				}
			}
			// zamijenimo elemente na datim pozicijama sa trenutacnim ukoliko je to potrebno
			if (currentIndex != i) {
				m[currentIndex][0] = m[i][0];
				m[currentIndex][1] = m[i][1];
				m[i][0] = empNum;
				m[i][1] = currentMax;
			}

		}
	}
}