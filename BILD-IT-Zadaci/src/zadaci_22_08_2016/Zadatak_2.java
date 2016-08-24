package zadaci_22_08_2016;

public class Zadatak_2 {

	public static void main(String[] args) {
		// pravimo objekat prosljedjujemo vrijednosti
		RegularPolygon rp = new RegularPolygon(8, 6, 6.3, 7.8);
		// unutar ispisa pozivamo metode koje nam racunaju povrsinu u perimetar
		System.out.printf("Polygon  area = %.3f perimeter = %.3f\n",
				rp.getArea(), rp.getPerimeter());
	}

}
