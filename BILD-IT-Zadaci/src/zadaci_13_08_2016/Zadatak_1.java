package zadaci_13_08_2016;

import java.util.Scanner;

public class Zadatak_1 {

	public static void main(String[] args) {
		/*
		 * program koji učitava ukupan iznos računa koji treba uplatiti kao i
		 * procenat tog računa kojeg želimo platiti kao napojnicu te izračunava
		 * ukupan račun i napojnicu. Na primjer, ukoliko korisnik unese 10 kao
		 * račun i 15 % kao procenat za napojnicu program treba da ispiše da je
		 * ukupan račun za uplatiti 11.5 a napojnica 1.5.
		 */
		Scanner input = new Scanner(System.in);
		//unos korisnika za iznos racuna i procenat napojnice
		System.out.println("Unesite iznos racuna: ");
		double bill = input.nextDouble();
		System.out.println("Unesite procenat računa kojeg želite platiti kao napojnicu: ");
		double tipPro = input.nextDouble();
		input.close();
		//racunamo napojnicu po sljedecoj formuli
		double tip = bill * tipPro / 100; 
		//izracunavamo iznos racuna sa najpojnicom 
		double billTip = tip + bill;
		//ispis iznosa racuna sa napojnicom i koliko iznosi napojnica
		System.out.println("Ukupan račun za uplatiti iznosi " + billTip + " a napojnica " + tip);
		

	}

}
