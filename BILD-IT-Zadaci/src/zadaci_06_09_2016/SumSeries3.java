package zadaci_06_09_2016;

public class SumSeries3 {
	public static double sum;

	public static double m3(double i) {
		// ukoliko je i 0 vracamo sumu
		if (i == 0) {
			return sum;
			// u suprotnom racunamo seriju
		} else {
			sum += i / (i + 1);
			i--;
			return m3(i);
		}
	}

	public static void main(String[] args) {
		// ispis rezultata
		System.out.println(m3(10));

	}

}