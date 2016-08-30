package zadaci_25_08_2016;

public class SplitMethodForStirng {

	public static String[] split(String str, String regex) {
		String[] orig = str.split(regex);
		String[] array = new String[(orig.length * 2) - 1];

		// setujemo sve elemente do regexa
		for (int i = 0; i < array.length; i++) {
			array[i] = regex;
		}
		// na svakom parnom indeksu postavljamo split

		for (int i = 0; i < orig.length; i++) {
			array[i * 2] = orig[i];
		}
		return array;
	}

	public static void main(String[] args) {
		// pozvi metode za split
		String[] result = split("ab#12#453", "#");
		// ispis
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}

	}
}