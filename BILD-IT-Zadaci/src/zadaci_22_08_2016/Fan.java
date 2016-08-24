package zadaci_22_08_2016;

public class Fan {
	// staticene varijable za brzinu
	public static final int SLOW = 1;
	public static final int MEDIUM = 2;
	public static final int FAST = 3;

	private int speed;
	private boolean on;
	private double radius;
	private String color;

	public Fan() {
		// postavljamo na default vrijednosti
		speed = 1;
		radius = 5;
		color = "plava";
	}

	// deteri i seteri
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// overajdamo to string metodu i ispisujemo u konozlu za vrijednosti za data
	// polja u zavisnosti da li je ventilator ukljucen ili ne
	public String toString() {
		if (isOn()) {
			return "Brzina: " + getSpeed() + ", Boja: " + getColor()
					+ ", Radius: " + getRadius();
		} else {
			return "Ventilator je iskljucen! Boja: " + getColor()
					+ ", Radius: " + getRadius();
		}
	}
}
