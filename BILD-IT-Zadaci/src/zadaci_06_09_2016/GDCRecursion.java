package zadaci_06_09_2016;

public class GDCRecursion {
	public static int gdc(int m, int n) {
		// racunamo najveci zajednicki djelilac koristeci rekurziju
		if (m % n == 0) {
			return n;
		} else {
			return gdc(n, m % n);
		}

	}

	public static void main(String[] args) {

		try (java.util.Scanner input = new java.util.Scanner(System.in)) {
			// unos korisnika
			System.out.println("Unesite dva cijela broja");
			int a = input.nextInt();
			int b = input.nextInt();
			// ispis rezultata
			System.out.println("Najveci zajednicki djelilac je: " + gdc(a, b));

		} catch (Exception e) {
			System.out.println("Pogresan unos, pokusajte ponovo: ");
			main(args);
		}
	}

}