package zadaci_25_08_2016;

public class MyStringBiulder1 {
	public String string;

	// konstruktor
	public MyStringBiulder1() {

	}

	// kreiramo konstruktor sa parametrom
	MyStringBiulder1(String s) {
		this.string = s;
	}

	// metoda koja spaja stingove
	public MyStringBiulder1 append(MyStringBiulder1 s) {

		String result = this.string + s.string;

		return new MyStringBiulder1(result);
	}

	// metoda koja dodaje broj
	public MyStringBiulder1 append(int i) {

		String result = this.string + i;

		return new MyStringBiulder1(result);
	}

	// duzina stringa
	public int length() {

		return this.string.length();
	}

	// metoda za pronalazak indexa i karaktera koji se na njemu nalazi
	public char charAt(int index) {

		return this.string.charAt(index);
	}

	// metoda koja vraca mala slova stringa
	public MyStringBiulder1 toLowerCase() {

		String result = " ";

		for (int i = 0; i < this.string.length(); i++) {
			result += Character.toUpperCase(this.string.charAt(i));
		}
		return new MyStringBiulder1(result);
	}

	// pocetni karaket substringa i krajnji karakter
	public MyStringBiulder1 substring(int start, int end) {

		String result = "";

		for (int i = start; i <= end; i++) {
			result += this.string.charAt(i);
		}
		return new MyStringBiulder1(result);
	}

	// ispis
	public String toString() {

		return this.string;

	}

	public static void main(String[] args) {

		// kreiramo dva objekta nase klase
		MyStringBiulder1 object1 = new MyStringBiulder1("Meni nema bolje kole");
		MyStringBiulder1 object2 = new MyStringBiulder1("1234.54.211");

		// poziv metoda klase
		System.out.println(" Append (MyStringBuilder1 string) is: "
				+ object1.append(object2));
		System.out.println(" Append(int i) is: " + object2.append(2222));
		System.out.println(" ToLowerCase()is: " + object1.toLowerCase());
		System.out.println(" Length() is: " + object1.length());
		System.out.println(" CharAt is: " + object1.charAt(4));
		System.out.println(" Substring is: " + object1.substring(2, 4));

	}
}