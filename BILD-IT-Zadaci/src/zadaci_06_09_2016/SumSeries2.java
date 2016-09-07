package zadaci_06_09_2016;

public class SumSeries2 {
	public static double sum;

	public static double m2(double i) {
		if (i == 0) {
			return sum;
			//racunamo seriju
		} else {
			sum += i / ((2 * i) + 1);
			i--;
			return m2(i);
		}
	}

	public static void main(String[] args) {
		//ispis rezultata
		System.out.println(m2(10));
	}

}