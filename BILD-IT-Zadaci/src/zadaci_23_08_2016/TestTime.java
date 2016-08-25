package zadaci_23_08_2016;

public class TestTime {

	public static void main(String[] args) {
		// kreiramo novi objekat
		Time t = new Time(555550000);
		Time t1 = new Time();
		// ispsi vremenea za dati objekat
		System.out.println("Elapsed time in 5555500000 millieseconds is: "
				+ t.toString() + "\nCurrent time: " + t1.toString());

	}

}
