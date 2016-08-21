package zadaci_19_08_2016;

public class Zadatak_4 {

	public static void main(String[] args) {
		/*
		 * *8.16 (Sort two-dimensional array) Write a method to sort a
		 * two-dimensional array using the following header:
		 * 
		 * 
		 * public static void sort(int m[][])
		 * 
		 * The method performs a primary sort on rows and a secondary sort on
		 * columns. For example, the following array {{4, 2},{1, 7},{4, 5},{1,
		 * 2},{1, 1},{4, 1}} will be sorted to {{1, 1},{1, 2},{1, 7},{4, 1},{4,
		 * 2},{4, 5}}.
		 */
		//kreiramo niz sa clanovima
		int array[][] = { { 4, 2 }, { 1, 7 }, { 4, 5 }, { 1, 2 }, { 1, 1 },
				{ 4, 1 } };
		System.out.println("Nesortiran niz: ");
		

		//ispisujemo nesortiran niz
		int broj = 0;
		for (int[] is : array) {
			broj++;
			for (int i : is) {
				System.out.print(i + " ");
			}
			if (broj < array.length)
				System.out.print(", ");
		}
		//pozivamo metodu za sortiranje
		sort(array);

		// ispisujemo sortiran niz
		System.out.println("\nSortiran niz:");
		for (int i = 0; i < array.length; i++) {
			System.out.print( array[i][0] + " " + array[i][1] + " , ");
		}

	}

	public static void sort(int[][] list) {
		for (int i = 0; i < list.length - 1; i++) {
			// trazimo najmanje clanove u nizu
			int currentMinRow = list[i][0];
			int currentMinCol = list[i][1];
			int currentMinIndex = i;

			for (int j = i + 1; j < list.length; j++) {
				// provjeravamo najmanji clan za red
				if (currentMinRow > list[j][0]) {
					currentMinRow = list[j][0];
					currentMinCol = list[j][1];
					currentMinIndex = j;
				} else if (currentMinRow == list[j][0]
						&& currentMinCol > list[j][1]) { // provjeravamo najmanji clan za kolonu
					currentMinCol = list[j][1];
					currentMinIndex = j;
				}
			}

			// zamijenimo elemente na datim pozicijama sa trenutacnim ukoliko je to potrebno
			if (currentMinIndex != i) {
				list[currentMinIndex][0] = list[i][0];
				list[i][0] = currentMinRow;
				list[currentMinIndex][1] = list[i][1];
				list[i][1] = currentMinCol;

			}
		}

	}

}
