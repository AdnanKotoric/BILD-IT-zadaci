package zadaci_23_08_2016;

public class TestInteger {

	public static void main(String[] args) {
		// kreiramo novi objekat
		MyInteger m = new MyInteger(12);
		// isis metoda iz MyInteger klase
		System.out.println(m.isEven());
		System.out.println(m.isOdd());
		System.out.println(m.isPrime());
		System.out.println(MyInteger.isEven(9));
		System.out.println(MyInteger.isPrime(93));
		System.out.println(MyInteger.issOdd(21));
		System.out.println(MyInteger.equals(90));
		System.out.println(MyInteger.equals(m));
		// niz karaktera koji vracamo kao int
		char[] c = { '6', '7', '8' };
		System.out.println(MyInteger.parseInt(c));
		// string koji vracamo kao int
		String s = "321";
		System.out.println(MyInteger.parseInt(s));
	}

}
