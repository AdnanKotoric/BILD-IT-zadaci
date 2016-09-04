package zadaci_02_09_2016;

public class ComparableGeoObject {
	public static void main(String[] args) {
		// kreiramo objekte klase Circle
		GeometricObject c = new Circle2(3);
		GeometricObject cc = new Circle2(5.5);
		// trazimo vecu vrijednost
		GeometricObject max1 = GeometricObject.max(c, cc);
		// ispis
		System.out.println("Max circle: "+max1);
		// kreiramo nove obekte Rectangle klase
		GeometricObject r = new Rectangle(2, 4);
		GeometricObject rr = new Rectangle(1, 6);
		GeometricObject max2 = GeometricObject.max(r, rr);
		// ispisujemo najvecu vrijednost
		System.out.println("Max rectangle: "+max2);
	}

}