package zadaci_02_09_2016;

public class TestComparableCircle {

	public static void main(String[] args) {
		// kreiramo novi objekat 
		Circle c = new ComparableCircle();
		//postavimo radius
		c.setRadius(2);
		Circle cc = new ComparableCircle();
		cc.setRadius(3);
		//trazimo max
		ComparableCircle max = ComparableCircle.max((ComparableCircle) c, (ComparableCircle) cc);
		// ispis
		System.out.println("Max circle has area of: "+ max);
	}

}