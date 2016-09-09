package zadaci_08_09_2016;

public class MaxElArrayE {
	public static <E extends Comparable<E>> E max(E[] list) {
		E currentMax = null;
		for (int i = 0; i < list.length; i++) {
			// dodjeljujemo vrijednost elemnta u listi
			currentMax = list[i];
			for (int j = 0; j < list.length; j++) {
				// usporedjujemo i provjeravamo koji broj je veci
				if (currentMax.compareTo(list[i]) > 0) {
					// dodjeljujemo novu vrijednost
					currentMax = list[j];
				}
			}
		}
		// vraca najveci broj
		return currentMax;

	}

	public static void main(String[] args) {
		// lista cijelih brojeva
		Integer[] list = new Integer[10];
		// spremamo nasumicne brojeve u listu
		for (int i = 0; i < list.length; i++) {
			list[i] = (int) (Math.random() * 10);
		}
		// ispis najveceg broja
		System.out.println("Najveci broj u listi je : " + max(list));
	}

}