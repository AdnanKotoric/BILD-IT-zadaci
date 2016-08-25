package zadaci_23_08_2016;

public class MyInteger {
	static int value;

	// konstruktor
	public MyInteger(int value) {
		super();
		MyInteger.value = value;
	}

	public int getValue() {
		return value;
	}

	// metoda za parne brojeve
	public boolean isEven() {
		if (value % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	// metoda za neparne brojeve
	public boolean isOdd() {
		if (value % 2 != 0) {
			return true;
		} else {
			return false;
		}
	}

	// metoda za proste brojeve
	public boolean isPrime() {
		int c = 0;
		for (int i = value; i >= 1; i--) {
			if (value % i == 0) {
				c++;
			}
		}
		if (c == 2) {
			return true;
		}
		return false;
	}

	// parni brojevi(odredjena vrijednost)
	public static boolean isEven(int value) {
		if (value % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	// neparni brojevi(odredjena vrijednost)
	public static boolean issOdd(int value) {
		if (value % 2 != 0) {
			return true;
		} else {
			return false;
		}

	}

	// prosti brojevi(oderedjena vrijednsot)
	public static boolean isPrime(int value) {
		int c = 0;
		for (int i = value; i >= 1; i--) {
			if (value % i == 0) {
				c++;
			}
		}
		if (c == 2) {
			return true;
		}
		return false;
	}

	// provjera da li su vrijednosti jednake
	public static boolean equals(int value) {
		if (MyInteger.value == value) {
			return true;
		} else {
			return false;
		}
	}

	// provjera je li objekat jednak vriejdnosti
	public static boolean equals(MyInteger a) {
		if (MyInteger.equals(value)) {
			return true;
		} else {
			return false;
		}
	}

	// pretvaramo karakter u integer
	public static int parseInt(char[] a) {
		return parseInt(new String(a));

	}

	// pretvaranje stringa u integer
	public static int parseInt(String a) {
		return Integer.parseInt(a);
	}

}
