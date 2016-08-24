package zadaci_22_08_2016;

public class Zadatak_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// objekat pravimo za ukljucen ventilator
		Fan fan = new Fan();
		fan.setOn(true);
		fan.setSpeed(Fan.MEDIUM);
		fan.setRadius(8);
		fan.setColor("crvena");
		// pravimo objekat za iskljucen ventilator
		Fan fan2 = new Fan();
		fan2.setOn(false);
		// ispis u konzoli
		System.out.println("Status ventilatora: " + fan.toString());
		System.out.println("Status drugog ventilatora: " + fan2.toString());

	}

}
