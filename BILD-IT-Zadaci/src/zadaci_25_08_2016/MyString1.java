package zadaci_25_08_2016;

public class MyString1 {
	public char[] chars;

	public static void main(String[] args) {
		// kreiramo dva niza karaktera

		char[] ch1 = { 'A', 'd', 'n', 'a', 'n', 'K', 'o', 't', 'o', 'r', 'i',
				'c' };
		char[] ch2 = { '9', '0', '8', '7', '6', '5', '4', '3', '2', '1' };
		// i dvije instance MyString1 klase koje cemo testirati
		MyString1 str1 = new MyString1(ch1);
		MyString1 str2 = new MyString1(ch2);
		// pozivamo metode iz MyString1 klase i
		// ispisujemo rezultate

		System.out.println(" Provjera stringova:");

		System.out.println(" Karakter na poziciji 4: " + str1.charAt(4));
		System.out.println("Duzina stringa 1: " + str1.length());
		System.out.println(" Substring stringa 1 od 1 do 3 indeksa: "
				+ str1.substring(1, 3));
		System.out.println(" Sve mala slova: " + str1.toLowerCase());
		System.out.println(" Provjera da li su stringovi jednaki"
				+ str1.equals(str2));
		System.out
				.println(" Provjera vrijednosti: " + MyString1.valueOf(12345));

	}

	// konstruktor
	public MyString1() {

	}

	// kreiramo konstruktor sa parametrom niza karaktera
	public MyString1(char[] chars) {
		this.chars = new char[chars.length];
		for (int i = 0; i < chars.length; i++) { // prolazimo petljom kroz sve
													// karaktere u nizu
			this.chars[i] = chars[i];
		}
	}

	// pronalazak indexa na kojem se karakter nalazi
	public char charAt(int index) {

		return this.chars[index];
	}

	// duzina niza
	public int length() {
		return this.chars.length;
	}

	// pocetni karaket substringa i krajnji
	public MyString1 substring(int start, int end) {
		char[] result = new char[end - start];
		for (int i = start; i < end; i++) {
			result[i - start] = this.chars[i];

		}
		return new MyString1(result);
	}

	// mala slova u stringu
	public MyString1 toLowerCase() {
		char[] lowerCase = new char[this.chars.length];
		for (int i = 0; i < this.chars.length; i++) {
			lowerCase[i] = Character.toLowerCase(this.chars[i]);
		}
		return new MyString1(lowerCase);
	}

	// provjera da li su stringovi jednaki
	public boolean equals(MyString1 string) {
		if (string.length() != this.chars.length) {
			return false;
		} else {
			for (int i = 0; i < string.length(); i++) {
				if (string.charAt(i) != this.chars[i]) {
					return false;
				}
			}
			return true;
		}
	}

	// metoda koja spaja vrijednosti stringova
	public static MyString1 valueOf(int i) {
		int length = 0;
		int numb = i;
		while (numb > 0) {
			numb /= 10;
			length++;
		}
		char[] valeu = new char[length];
		for (int j = valeu.length - 1; j >= 0; j--) {
			valeu[j] = (char) ('0' + (i % 10));
			i /= 10;
		}
		return new MyString1(valeu);
	}

	// ispis svih vrijednosti stringa
	@Override
	public String toString() {
		String result = " ";
		for (int i = 0; i < this.chars.length; i++) {
			result += this.chars[i];
		}
		return result;

	}

}
