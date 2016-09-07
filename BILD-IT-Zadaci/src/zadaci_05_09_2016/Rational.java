package zadaci_05_09_2016;

public class Rational extends Number implements Comparable<Rational> {
	private static final long serialVersionUID = 1L;
	// data fildovi
	private long numerator = 0;
	private long denominator = 1;
	private long[] r = new long[2];

	// konstruktor sa default vrijednostima
	public Rational() {
		this(0, 1);
	}

	// konstruktor sa specificiranim vrijednostima
	public Rational(long numerator, long denominator) {
		long gcd = gcd(numerator, denominator);
		this.numerator = ((denominator > 0) ? 1 : -1) * numerator / gcd;
		this.denominator = Math.abs(denominator) / gcd;
	}

	// geteri i seteri
	public void setNumerator(long numerator) {
		this.numerator = numerator;
	}

	public void setDenominator(long denominator) {
		this.denominator = denominator;
	}

	public long[] getR() {
		this.r[0] = this.numerator;
		this.r[1] = this.denominator;
		return r;
	}

	public void setR(long[] r) {
		this.r = r;
	}

	// trazimo najveci zajednicki djelilac
	private static long gcd(long n, long d) {
		long n1 = Math.abs(n);
		long n2 = Math.abs(d);
		int gcd = 1;

		for (int k = 1; k <= n1 && k <= n2; k++) {
			if (n1 % k == 0 && n2 % k == 0)
				gcd = k;
		}
		return gcd;
	}

	public long getNumerator() {
		return numerator;
	}

	public long getDenominator() {
		return denominator;
	}

	public Rational add(Rational secondRational) {
		long n = numerator * secondRational.getDenominator() + denominator
				* secondRational.getNumerator();
		long d = denominator * secondRational.getDenominator();
		return new Rational(n, d);
	}

	public Rational subtract(Rational secondRational) {
		long n = numerator * secondRational.getDenominator() - denominator
				* secondRational.getNumerator();
		long d = denominator * secondRational.getDenominator();
		return new Rational(n, d);
	}

	public Rational multiply(Rational secondRational) {
		long n = numerator * secondRational.getNumerator();
		long d = denominator * secondRational.getDenominator();
		return new Rational(n, d);
	}

	public Rational divide(Rational secondRational) {
		long n = numerator * secondRational.getDenominator();
		long d = denominator * secondRational.numerator;
		return new Rational(n, d);
	}

	@Override
	public String toString() {
		if (denominator == 1)
			return numerator + "";
		else
			return numerator + "/" + denominator;
	}

	@Override
	// Overajdamo equals metodu iz Object klase
	public boolean equals(Object other) {
		if ((this.subtract((Rational) (other))).getNumerator() == 0)
			return true;
		else
			return false;
	}

	@Override
	// Implementiramo abstraktnu intValue metodu
	public int intValue() {
		return (int) doubleValue();
	}

	@Override
	// Implementiramo abstraktnu metodu floatValue
	public float floatValue() {
		return (float) doubleValue();
	}

	@Override
	// Implementiramo doubleValue metodu
	public double doubleValue() {
		return numerator * 1.0 / denominator;
	}

	@Override
	// Implementiramo abstraktnu longValue metodua
	public long longValue() {
		return (long) doubleValue();
	}

	@Override
	// Implementiramo compareTo metodu
	public int compareTo(Rational o) {
		if (this.subtract(o).getNumerator() > 0)
			return 1;
		else if (this.subtract(o).getNumerator() < 0)
			return -1;
		else
			return 0;
	}
}