package zadaci_25_08_2016;

public class MyString2 {

	public static void main(String[] args) {

		// kreiramo dva objekta za klasu koju smo napravili
		MyString2 object1 = new MyString2("Nesto nesto nesto");
		MyString2 object2 = new MyString2("Nesto sto NIje bitno");
		// poziv metoda klase
		System.out.println(" Substring metoda : " + object1.substring(3));
		System.out.println(" ToUpperCase metoda  : " + object2.toUpperCase());
		System.out.println(" ValueOf metoda  : " + MyString2.valueOf(true));
		System.out.println(" Compare strings metoda "
				+ object1.compare("nasa mala klinika"));
		System.out.println(" Compare metoda : "
				+ object1.compare("Previse zadace odjednom"));

	}

	private String s;

	// konstruktor
	public MyString2() {

	}

	// kreiramo konstruktor sa stringom kao parametar
	public MyString2(String s) {
		this.s = s;
	}

	// metoda poredjenje stringova
	public int compare(String s) {
		int result = 0;
		if (this.s.length() < s.length()) {
			result = -1;
		} else if (s.length() < this.s.length()) {
			result = 1;
		} else {
			for (int i = 0; i < this.s.length(); i++) {
				if (this.s.charAt(i) < s.charAt(i)) {
					result = -1;
				}
				if (this.s.charAt(i) > s.charAt(i)) {
					result = 1;
				}
			}
		}
		return result;
	}

	// metoda koja vraca vrijednost objekta
	public static MyString2 valueOf(boolean b) {
		if (b == true) {
			return new MyString2("true");
		} else {
			return new MyString2("false");
		}
	}

	public String toString() {
		return this.s;
	}

	// metoda koja vraca pocetni karakter substringa
	public MyString2 substring(int start) {
		String result = " ";
		for (int i = start, j = 0; i < s.length(); i++, j++) {
			result += this.s.charAt(i);
		}
		return new MyString2(result);
	}

	// metoda koja vraca velika slova objektu

	public MyString2 toUpperCase() {
		String upperCase = "";
		for (int i = 0; i < this.s.length(); i++) {
			upperCase += this.s.toUpperCase().charAt(i);
		}
		return new MyString2(upperCase);
	}

	// metoda koja vraca string kao niz karaktera
	public char[] toChars() {
		char[] chars = new char[this.s.length()];
		for (int i = 0; i < chars.length; i++) {
			chars[i] = this.s.charAt(i);
		}
		return chars;
	}

}
