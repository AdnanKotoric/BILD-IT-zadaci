package zadaci_07_09_2016;

public class CharOccurances {
	// brojac
	public static int count = 0;
	public static int i = 0;

	public static int count(String str, char a) {
		// uslov za zaustavljanje rekurzije
		if (i == str.length()) {
			return count;
		} else {
			// kada pronadje trazeni karakter
			if (str.charAt(i) == a) {
				// povecavamo brojac
				count++;
			}
			// povecavamo indeks za 1
			i++;
			return count(str, a);
		}
	}

	public static void main(String[] args) {
		try (java.util.Scanner input = new java.util.Scanner(System.in)) {
			// unos korisnika
			System.out.println("Unesite string");
			String s = input.nextLine();
			System.out.println("Unesite karakter koji zelite da prebrojite: ");
			String a = input.next();
			char c = a.charAt(0);
			// ispisujemo vrijednost koju nam vrati metoda
			System.out.println(count(s, c));

		} catch (Exception e) {
			System.out.println("Doslo je do pogreske!");
			main(args);
		}
	}

}