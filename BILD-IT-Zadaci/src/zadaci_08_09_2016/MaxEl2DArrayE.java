package zadaci_08_09_2016;

public class MaxEl2DArrayE {
	public static <E extends Comparable<E>> E max(E[][] list) {
		E currentMax = null;
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[i].length; j++) {
				// dodajemo vrijednost broja u listi
				currentMax = list[i][j];
			}
		}
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[i].length; j++) {
				// poredimo brojeve
				if (currentMax.compareTo(list[i][j]) < 0) {
					// dodjeljujemo vrijednost veceg broja
					currentMax = list[i][j];
				}
			}
		}
		// vracamo najveci broj
		return currentMax;

	}

	public static void main(String[] args) {
		// 2d niz sa nasumicnim vrijednostima
		Integer[][] m1 = new Integer[][] { { 1, 2, 3, 8 }, { 4, 5, 6, 2 },
				{ 1, 1, 1, 6 } };
		// ispis vrijednosti koju nam vrati metoda
		System.out.println("Najveci element u 2d nizu je : " + max(m1));
	}

}