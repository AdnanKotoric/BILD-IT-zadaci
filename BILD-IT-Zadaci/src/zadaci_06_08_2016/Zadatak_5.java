package zadaci_06_08_2016;

import java.util.Scanner;

public class Zadatak_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//izracunati minimalnu duzinu avionske piste
				Scanner unos = new Scanner(System.in);
				//unijeti brzinu i ubrzanje
				System.out.println("Unesite brzinu i ubrzanje: ");
				double v = unos.nextDouble();
				double a = unos.nextDouble();
				double duzina = (v * v) / (2 * a);
				System.out.println("Minimalna duzina piste za ovaj avion iznosi: " +Math.round(duzina));

	}

}
