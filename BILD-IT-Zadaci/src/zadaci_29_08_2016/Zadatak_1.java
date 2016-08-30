package zadaci_29_08_2016;

import java.util.Scanner;

public class Zadatak_1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Unesite koliko tacaka zelite:");
		int points = input.nextInt();
		double[] xs = new double[points];
		double[] ys = new double[points];
		// takes input from user
		for (int i = 0; i < xs.length; i++) {
			System.out.println("Unesite tacku x:");
			xs[i] = input.nextDouble();
			System.out.println("Unesite tacku y:");
			ys[i] = input.nextDouble();
		}

		double area = 0;
		// izracunavamo povrsinu poligona
		int i = 0;
		do {
			double first = (xs[i] * (ys[i + 1]));
			double second = (ys[i] * (xs[i + 1]));
			area += (first - second);

			i++;
		} while (i != points - 1);

		double first = (xs[i] * (ys[0]));
		double second = (ys[i] * (xs[0]));
		area += (first - second);

		area = (Math.abs(area / 2));
		// ispis
		System.out.println(area);
		input.close();
	}

}
