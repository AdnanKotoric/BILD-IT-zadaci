package zadaci_13_08_2016;

import java.util.Scanner;

public class Zadatak_5 {

	public static void main(String[] args) {
		/*
		 * Program koji upoređuje cijene dva pakovanja. Program pita
		 * korisnika da unese težinu i cijenu oba pakovanja te ispisuje koje
		 * pakovanje ima bolju cijenu.
		 */
		Scanner input = new Scanner(System.in);
		//Unos korisnika za tezinu i cijenu prvog i drugog paketa
		System.out.println("Unesite tezinu i cijenu prvog paketa: ");
		double weight1 = input.nextDouble();
		double price1 = input.nextDouble();
		System.out.println("Unesite tezinu i cijenu drugog paketa: ");
		double weight2 = input.nextDouble();
		double price2 = input.nextDouble();
		input.close();
		//racunamo vrijednost prvog i drugog paketa
		double value1 = price1 / weight1;
		double value2 = price2 / weight2;
		
		//pomocu uslova poredimo vrijednosti paketa i ispisujemo koji ima bolju cijenu ili su im cijene jednake
		if (value1 < value2){
			System.out.println("Bolju cijenu ima prvi paket.");
			
		}
		else if (value1 > value2){
			System.out.println("Bolju cijenu ima drugi paket.");
		}
		else {
			System.out.println("Cijene paketa su jednake.");
		}
		
	}

}
