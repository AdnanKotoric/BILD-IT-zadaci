package zadaci_05_09_2016;

public class TestRational {

	public static void main(String[] args) {
		// kreiramo objekat klase rational
		Rational r = new Rational();

		r.setNumerator(4);
		r.setDenominator(8);
		// ispis
		System.out.println((double) r.getR()[0] / r.getR()[1]);
		System.out.println(r.doubleValue());
	}

}