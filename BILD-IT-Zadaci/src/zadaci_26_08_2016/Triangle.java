package zadaci_26_08_2016;

import java.util.Scanner;

public class Triangle extends GeometricObject {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Unesite tri strane trougla:");
		// user inputs
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		// pravimo objekat trougla
		Triangle t = new Triangle(a, b, c);
		System.out.println("Unesite boju trougla:");
		String color = input.next();
		// setujemo boju
		t.setColor(color);
		System.out.println("Unesite true ili false za popunjenost trougla");
		String colorTriangle = input.next();
		// setujemo bolijan vrijednost za filled
		if (colorTriangle.equals("true")) {
			boolean bool = true;
			t.setFilled(bool);
		}
		if (colorTriangle.equals("false")) {
			boolean bool = false;
			t.setFilled(bool);
		}
		// ispis
		System.out.println(t.toString() + " =>> Area: " + t.getArea()
				+ ", Perimetar: " + t.getPerimetar() + ", Color: "
				+ t.getColor() + ", Filled: " + t.isFilled());
		input.close();

	}

	// default data fields
	private double side1 = 0.1;
	private double side2 = 0.1;
	private double side3 = 0.1;

	// constructors
	public Triangle() {

	}

	public Triangle(double side1, double side2, double side3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	// getters
	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;

	}

	public double getSide3() {
		return side3;
	}

	// calculates area
	public double getArea() {
		double s = (side1 + side2 + side3) / 2;
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}

	// calculates perimetar
	public double getPerimetar() {
		return side1 + side2 + side3;

	}

	@Override
	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = "
				+ side3;
	}

}
