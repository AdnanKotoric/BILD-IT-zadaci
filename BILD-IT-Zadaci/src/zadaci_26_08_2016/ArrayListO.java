package zadaci_26_08_2016;

import java.util.ArrayList;
import java.util.Date;

public class ArrayListO {

	public static void main(String[] args) {
		// lista s objektima
		ArrayList<Object> list = new ArrayList<>();
		// kreiramo novi objekat za person u zadaci nismo imali loan pa sam
		// zamijenio
		Person p = new Person();

		list.add(p);
		// objekat za datum
		Date date = new Date();
		list.add(date);
		// novi string
		String s = "Neki string";

		list.add(s);
		// isto tako umjesto circle pravimo triangle objekat
		Triangle t = new Triangle();

		list.add(t);

		// ispis objekata u listi
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
	}

}