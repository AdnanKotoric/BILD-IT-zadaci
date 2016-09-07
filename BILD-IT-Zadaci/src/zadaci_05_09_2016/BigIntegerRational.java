package zadaci_05_09_2016;

import java.math.BigInteger;

public class BigIntegerRational extends Number implements
		Comparable<BigIntegerRational> {
	private static final long serialVersionUID = 1L;

	private BigInteger numerator = new BigInteger("0");
	private BigInteger denominator = new BigInteger("1");

	// konstruktori
	public BigIntegerRational() {
		this(new BigInteger("0"), new BigInteger("1"));
	}

	public BigIntegerRational(BigInteger numerator, BigInteger denominator) {
		long gcd = gcd(numerator.longValue(), denominator.longValue());
		String a = ""
				+ (((denominator.longValue() > 0) ? 1 : -1)
						* numerator.longValue() / gcd);
		this.numerator = new BigInteger(a);
		String b = "" + (Math.abs(denominator.longValue()) / gcd);
		this.denominator = new BigInteger(b);
	}

	// metoda za pronalazak najveceg zajednickog djelioca
	private static long gcd(long l, long m) {
		long n1 = Math.abs(l);
		long n2 = Math.abs(m);
		int gcd = 1;

		for (int k = 1; k <= n1 && k <= n2; k++) {
			if (n1 % k == 0 && n2 % k == 0)
				gcd = k;
		}
		return gcd;
	}

	// geteri i seteri
	public BigInteger getNumerator() {
		return numerator;
	}

	public BigInteger getDenominator() {
		return denominator;
	}

	public void setNumerator(BigInteger numerator) {
		this.numerator = numerator;
	}

	public void setDenominator(BigInteger denominator) {
		this.denominator = denominator;
	}

	// sabiranje
	public BigIntegerRational add(BigIntegerRational secondRational) {
		long n = numerator.longValue()
				* secondRational.getDenominator().longValue()
				+ denominator.longValue()
				* secondRational.getNumerator().longValue();
		String a = "" + n;
		long d = denominator.longValue()
				* secondRational.getDenominator().longValue();
		String b = "" + d;
		return new BigIntegerRational(new BigInteger(a), new BigInteger(b));
	}

	// oduzimanje
	public BigIntegerRational subtract(BigIntegerRational secondRational) {
		long n = numerator.longValue()
				* secondRational.getDenominator().longValue()
				- denominator.longValue()
				* secondRational.getNumerator().longValue();
		long d = denominator.longValue()
				* secondRational.getDenominator().longValue();
		return new BigIntegerRational(new BigInteger("" + n), new BigInteger(""
				+ d));
	}

	// mnozenje
	public BigIntegerRational multiply(BigIntegerRational secondRational) {
		long n = numerator.longValue()
				* secondRational.getNumerator().longValue();
		long d = denominator.longValue()
				* secondRational.getDenominator().longValue();
		return new BigIntegerRational(new BigInteger("" + n), new BigInteger(""
				+ d));
	}

	// dijeljenje
	public BigIntegerRational divide(BigIntegerRational secondRational) {
		long n = numerator.longValue()
				* secondRational.getDenominator().longValue();
		long d = denominator.longValue()
				* secondRational.getNumerator().longValue();
		return new BigIntegerRational(new BigInteger("" + n), new BigInteger(""
				+ d));
	}

	@Override
	public String toString() {
		if (denominator.longValue() == 1)
			return numerator + "";
		else
			return numerator + "/" + denominator;
	}

	@Override
	public boolean equals(Object other) {
		if ((this.subtract((BigIntegerRational) (other))).getNumerator()
				.longValue() == 0)
			return true;
		else
			return false;
	}

	@Override
	// Implementiramo intValue metodu
	public int intValue() {
		return (int) doubleValue();
	}

	@Override
	// Implementiramo floatValue metodu
	public float floatValue() {
		return (float) doubleValue();
	}

	@Override
	// Implementiramo doubleValue metodu
	public double doubleValue() {
		return numerator.longValue() * 1.0 / denominator.longValue();
	}

	@Override
	// Implementiramo longValue metodu
	public long longValue() {
		return (long) doubleValue();
	}

	@Override
	// Implementiramo compareTo metodu
	public int compareTo(BigIntegerRational o) {
		if (this.subtract(o).getNumerator().longValue() > 0)
			return 1;
		else if (this.subtract(o).getNumerator().longValue() < 0)
			return -1;
		else
			return 0;
	}

	public static void main(String[] args) {
		// kreiramo novi objekat
		BigIntegerRational a = new BigIntegerRational(new BigInteger("8"),
				new BigInteger("4"));
		// ispis
		System.out.println(a.doubleValue());
	}
}