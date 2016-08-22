package zadaci_20_08_2016;

import java.util.Scanner;

public class Zadatak_5 {

	public static void main(String[] args) {
		/*
		 * The Location class) Design a class named Location for locating a
		 * maximal value and its location in a two-dimensional array. The class
		 * contains public data fields row , column , and maxValue that store
		 * the maximal value and its indices in a two-dimensional array with row
		 * and column as int types and maxValue as a double type. Write the
		 * following method that returns the location of the largest element in
		 * a two-dimensional array: public static Location
		 * locateLargest(double[][] a)
		 */
		Scanner input = new Scanner(System.in);
		//unos korisnika za broj redova i kolona, te unos elemenata niza
		System.out.print("Unesite broj redova i kolona koliko zelite: ");
		int row = input.nextInt();
		int column = input.nextInt();
		double[][] array = new double[row][column];

		System.out.println("Unesite elemente niza:");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = input.nextDouble();
			}
		}
//pravimo objekat klase Location prosljedjujemo mu niz
		Location location = Location.locateLargest(array);

		System.out.println("The location of the largest element is "
				+ location.maxValue + " at (" + location.row + ", "
				+ location.column + ")");//ispis za najveci clan niza te njegovu poziciju u nizu
		input.close();
	}

}

class Location {
//data field-ovi Location klase 
	public int row;
	public int column;
	public double maxValue;
//konstruktor koji prima argumente
	public Location(int row, int column, double maxValue) {
		this.row = row;
		this.column = column;
		this.maxValue = maxValue;
	}
//metoda klase koja trazi najveci element niza i sprema njegovu poziciju u nizu
	public static Location locateLargest(double[][] a) {

		int row = 0;
		int column = 0;
		double maxValue = a[row][column];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (maxValue < a[i][j]) {
					maxValue = a[i][j];
					row = i;
					column = j;
				}
			}
		}

		return new Location(row, column, maxValue);
	}

}