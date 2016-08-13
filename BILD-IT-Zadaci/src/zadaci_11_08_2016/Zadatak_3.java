package zadaci_11_08_2016;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Zadatak_3 {

	public static void main(String[] args) {
		/*
		 * Program koji ispisuje trenutačni datum i vrijeme u formatu
		 * "Trenutni datum i vrijeme: 22. juli, 2015 19:59:47"
		 */
		
		// Koritimo SimpleDateFromat za postavljanje kako ce nas datum biti
		// ispisan
		SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy HH:mm:ss");

		//postavljamo datum na danasnji pomocu System.currentTimeMillis()
		long milli = System.currentTimeMillis();
		Date date = new Date(milli);

	//string koji ce napraviti nas datum po formatu koji smo odredili
		String currentDate = sdf.format(date);
		//ispisujemo datum i vrijeme
		System.out.println("Trenutni datum i vrijeme:" + currentDate);

	}

}
