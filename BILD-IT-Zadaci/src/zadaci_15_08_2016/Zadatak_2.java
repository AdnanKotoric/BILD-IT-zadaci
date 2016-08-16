package zadaci_15_08_2016;

import java.util.Scanner;

public class Zadatak_2 {

	public static void main(String[] args) {
		/*
		 * program koji igra sa protivnikom rock-paper-scissors.
		 * (papir-bunar-makaze ili tako nekako po naški) Program nasumično
		 * generiše brojeve 0, 1 i 2 koji predstavljaju papir, bunar i makaze.
		 * Program pita korisnika da unese 0, 1 ili 2 te mu ispisuje poruku da
		 * li je korisnik pobijedio, da li je računar pobijedio ili je bilo
		 * neriješeno.
		 */
		Scanner input = new Scanner(System.in);
		// ispis poruke za unos korisnika
		System.out.print("Unesite za: papir (0), bunar (1), makaze (2):");
		int userChoice = input.nextInt();
		// pravimo niz i po brojevima koje smo ponudili korisniku na tim
		// indeksima spremamo opcije
		String[] choices = { "papir", "bunar", "makaze" };
		input.close();
		// uslovom ispisujemo ukoliko korisnik unese pogresan broj, u suprotnom
		// ispisujemo sta je izabrao
		if (userChoice < 0 || userChoice > 2) {
			System.out.println("Pogresan unos: ");
		} else {
			System.out.print("Izabrali ste " + choices[userChoice]);
		}

		// generisemo nasumicno broj za racunar i ispisujemo sta je to racunar
		// dobio
		int computerChoice = (int) (Math.random() * 3);
		System.out.print(", a racunar je izabrao " + choices[computerChoice]
				+ ".");

		// uslovom odredujemo u kojim slucajevima korisnik pobjedjuje i
		// ispisujemo da je korisnik pobijedio
		if (userChoice == 0 && computerChoice == 1 || userChoice == 1
				&& computerChoice == 2 || userChoice == 2
				&& computerChoice == 0) {
			System.out.print(" Pobijedili ste! Cestitamo!");
			// ukoliko je izbor korisnika i racunara isti ispisujemo nerijeseno
		} else if (userChoice == computerChoice) {
			System.out.print(" Nerijeseno!");
			// i za sve ostale slucajeve pobjedjuje racunar i ispisujemo to
		} else {
			System.out.print(" Racunar je pobijedio!");

		}
	}
}
