package zadaci_25_08_2016;

public class MyCharacter {
	public static void main(String[] args) {
		// kreiramo instancu klase
		MyCharacter caracter = new MyCharacter('b');
		// pozivamo metode koje smo napravili u klasi
		System.out.println("Karakter = " + caracter.getChar());
		System.out.println("Karakter je slovo = " + MyCharacter.isLetter('E'));
		System.out.println("Malo slovo = " + MyCharacter.isLowerCase('a'));
		System.out.println("Veliko slovo = " + MyCharacter.isUpperCase('a'));
		System.out.println("Equals = " + caracter.equals(new MyCharacter('A')));
		System.out.println("Karakter je broj = " + MyCharacter.isDigit('g'));

	}

	private static char character;

	// konstruktor
	public MyCharacter() {

	}

	// kreiramo konstruktor koji prima karakter
	public MyCharacter(char caracter) {
		MyCharacter.setCaracter(caracter);
	}

	// metoda koja provjerava da li je karakter slovo
	public static boolean isLetter(char caracter) {
		return (caracter >= 'a' && caracter <= 'z')
				|| (caracter >= 'A' && caracter <= 'Z');
	}

	// metoda koja provjerava mala slova
	public static boolean isLowerCase(char caracter) {

		return (caracter >= 'a' && caracter <= 'z');
	}

	// metoda koja provjerava velika slova
	public static boolean isUpperCase(char caracter) {
		return (caracter >= 'A' && caracter <= 'Z');
	}

	// ger metoda za karakter
	public char getChar() {
		return getCaracter();
	}

	// metoda koja provjerava jednakost karaktera
	public boolean equals(MyCharacter caracter) {
		return MyCharacter.getCaracter() == caracter.getChar();
	}

	// metoda koja provjerava da li je karakter broj
	public static boolean isDigit(char caracter) {
		return caracter >= '0' && caracter <= '9';
	}

	public static char getCaracter() {
		return character;
	}

	public static void setCaracter(char caracter) {
		MyCharacter.character = caracter;
	}
}