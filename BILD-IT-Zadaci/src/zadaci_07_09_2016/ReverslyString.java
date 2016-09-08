package zadaci_07_09_2016;

public class ReverslyString {
	// prazan string u kojem spremamo kasnije naopaki string
	public static String s = "";
	// za index
	public static int i = 1;

	public static void reverseDisplay(String value) {
		// zaustavlja rekurziju kada je string okrenut naopako
		if (value.length() == s.length()) {
			System.out.println(s);
		} else {
			// dodajemo u string karakteru u obrnutom redoslijedu
			s += value.charAt(value.length() - i);
			i++;
			reverseDisplay(value);
		}

	}

	public static void main(String[] args) {
		try (java.util.Scanner input = new java.util.Scanner(System.in)) {
			// unos korisnika
			System.out.println("Unesite string");
			String s = input.nextLine();
			// poziv metode
			reverseDisplay(s);

		} catch (Exception e) {
			System.out.println("Doslo je do greske");
		}
	}

}