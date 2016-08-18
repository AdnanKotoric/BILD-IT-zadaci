package zadaci_16_08_2016;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Zadatak_4 {

	public static void main(String[] args) {
		/*
		 * metodu koja vraća datum i trenutačno vrijeme.
		 */
		// pozivamo metodu
		getDate();

	}

	// metoda koja vraca datum i trenutacno vrijeme
	public static void getDate() {
		// pozviamo klasu GregorianCalendar
		GregorianCalendar cal = new GregorianCalendar();
		// formatiramo po zelji kako ce izgledati ispis datuma i vremena pomocu
		// SimpleDateFormat
		SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy HH:mm:ss");
		// ispis trenutacnog datuma i vremena po datom formatu
		System.out.println(sdf.format(cal.getTime()));

	}

}
