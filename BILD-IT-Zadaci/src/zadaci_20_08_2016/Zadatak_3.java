package zadaci_20_08_2016;

public class Zadatak_3 {

	public static void main(String[] args) {
		/*
		 * (Stopwatch) Design a class named StopWatch . The class contains: ■ ■
		 * ■ ■ ■ 9.7 Private data fields startTime and endTime with getter
		 * methods. A no-arg constructor that initializes startTime with the
		 * current time. A method named start() that resets the startTime to the
		 * current time. A method named stop() that sets the endTime to the
		 * current time. A method named getElapsedTime() that returns the
		 * elapsed time for the stopwatch in milliseconds. Draw the UML diagram
		 * for the class and then implement the class. Write a test program that
		 * measures the execution time of sorting 100,000 numbers using
		 * selection sort.
		 */
		// kreiramo niz
		int[] niz = new int[100000];

		System.out.println("Pravljenje niza od 100.000 brojeva");
		// petljom popunjavamo niz random brojevima
		for (int i = 0; i < niz.length; i++) {
			niz[i] = (int) (Math.random() * 10);
		}
		System.out.println("Sada mjerimo vrijeme za srotiranje niza!");
		StopWatch stopwatch = new StopWatch(); // pravimo objekat klase
												// StopWatch
		stopwatch.start();// koristimo metodu klase koju smo napravili za
							// pocetak mjerenja vremena
		selectionSort(niz);// pozivamo metodu za sortiranje
		stopwatch.stop();// nakon izvrsetka sortiranja pozivamo metodu koja
							// uzima vrijeme za kraj sortiranja iz klase koju
							// smo napravili
		System.out.println("Vrijeme za sortiranje niza iznosi: "
				+ stopwatch.getElapsedTime() + " millisekundi.");// ispisujemo
																	// proteklo
																	// vrijeme
																	// takodjer
																	// pozivajuci
																	// metodu iz
																	// nase
																	// klase
																	// stopwatch

	}

	// metoda za sortiranje niza
	public static void selectionSort(int[] niz) {

		for (int i = 0; i < niz.length - 1; i++) {

			int treMin = niz[i];
			int treIndex = i;

			for (int j = i + 1; j < niz.length; j++) {

				if (treMin > niz[j]) {
					treMin = niz[j];
					treIndex = j;
				}
			}

			if (treIndex != i) {
				niz[treIndex] = niz[i];
				niz[i] = treMin;
			}
		}

	}

}

// klasa za mjerenje vremena stoperica
class StopWatch {
	// data fieldovi klase StopWatch
	private long startTime = 0;
	private long endTime = 0;

	// konstruktor za nasu klasu
	public StopWatch() {
	}

	// metoda za postavljanje pocetka mjerenja
	public void start() {
		startTime = System.currentTimeMillis();
	}

	// metoda za postavljanje kraja mjerenja
	public void stop() {
		endTime = System.currentTimeMillis();
	}

	// metoda za izracunavanje proteklog vremena od poceetka mjerenja pa do
	// kraja
	public long getElapsedTime() {

		return endTime - startTime;
	}
}
