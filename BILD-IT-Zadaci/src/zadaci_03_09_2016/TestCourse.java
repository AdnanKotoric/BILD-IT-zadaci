package zadaci_03_09_2016;

public class TestCourse {

	public static void main(String[] args) throws CloneNotSupportedException {
		// kreiramo novi objekat
		Course c = new Course("Java");
		// petljom dodajemo imena studenata
		for(int i = 0; i < 100; i++){
			c.addStudent("Mirza");
		}
		// kloniramo objekat
		Course clone = (Course) c.clone();
		// ispisujemo prvi objekat
		System.out.println(c.toString());
		// ispisujemo drugi objekat
		System.out.println(clone.toString());

	}

}