package zadaci_06_09_2016;

public class SumSeries1 {
	public static double sum;

	public static double m(double i) {
	
		if (i == 1) {
			return 1 + sum;
			// racunamo seriju
		} else {
			sum += 1 / i;
			i--;
			return m(i);
		}
	}

	public static void main(String[] args) {
		// ispis rezultata
		System.out.println(m(10));

	}
}