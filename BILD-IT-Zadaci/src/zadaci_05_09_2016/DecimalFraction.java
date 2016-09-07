package zadaci_05_09_2016;

import java.math.BigInteger;

public class DecimalFraction {
	public static int maxDivisor(int a, int b) {
		int maxDiv = 0;
		// petlja kojom trazimo najveceg djelioca
		for (int i = 1; i <= b; i++) {
			if (b % i == 0 && a % i == 0) {
				maxDiv = i;
			}
		}
		return maxDiv;
	}

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		try {
			System.out.println("Enter a decimal number: ");
			String dec = input.nextLine();

			int num = Integer.parseInt(dec.split("\\.")[0]);
			int rest = Integer.parseInt(dec.split("\\.")[1]);
			BigIntegerRational r = new BigIntegerRational();
			int denominator = 0;
			// ako je ostatak dvocifren broj
			if (!(rest >= 10)) {
				// racunamo numerator i denominator
				denominator = 10 / rest;
				rest = rest / maxDivisor(rest, 10);
				if (num > 0) {
					num = num * denominator;
					rest = num + rest;
				}

				r.setNumerator(new BigInteger("" + rest));
				r.setDenominator(new BigInteger("" + denominator));
				// ukoliko je ostatak trocifrena vrijednost
			} else if (!(rest >= 100)) {
				// racunamo numerator i denominator
				denominator = 100 / maxDivisor(rest, 100);
				rest = rest / maxDivisor(rest, 100);
				if (num > 0) {
					num = num * denominator;
					rest = num + rest;
				}
				// ispis
				r.setNumerator(new BigInteger("" + rest));
				r.setDenominator(new BigInteger("" + denominator));
				// aok ostatak je cetverocifren broj
			} else if (!(rest >= 1000)) {
				// racunamo
				denominator = 1000 / maxDivisor(rest, 1000);
				rest = rest / maxDivisor(rest, 1000);
				if (num > 0) {
					num = num * denominator;
					rest = num + rest;
				}
				r.setNumerator(new BigInteger("" + rest));
				r.setDenominator(new BigInteger("" + denominator));
				// ukoliko je petocifren broj
			} else if (!(rest >= 10000)) {
				// raunamo
				denominator = 10000 / maxDivisor(rest, 10000);
				rest = rest / maxDivisor(rest, 10000);
				if (num > 0) {
					num = num * denominator;
					rest = num + rest;
				}
				r.setNumerator(new BigInteger("" + rest));
				r.setDenominator(new BigInteger("" + denominator));
			}
			// ispis
			System.out.println("The fraction number is: " + r.toString());

		} catch (NumberFormatException e) {
			System.out.println("Wrong input, try again: ");
			main(args);
		} finally {
			input.close();
		}
	}
}