package zadaci_03_09_2016;

public class TestOctagon {

	public static void main(String[] args) throws CloneNotSupportedException {
		// kreiramo nove objekte
		Octagon o1 = new Octagon(8);
		Octagon o2 = (Octagon) o1.clone();
		Octagon o3 = new Octagon(9);
		// ispis pomocu toString metoda
		System.out.println(o1.toString());
		System.out.println(o2.toString());
		System.out.println(o3.toString());
		// uporedjujemo prvi i drugi obje
		System.out.println(o1.compareTo(o2));
		// uporedjujemo prvi i treci objekat
		System.out.println(o1.compareTo(o3));

	}

}
