package zadaci_15_08_2016;

public class Zadatak_1 {

	public static void main(String[] args) {
		/*
		 * Program koji nasumično generiše cijeli broj između 1 i 12 te ispisuje
		 * ime mjeseca za taj broj. (Januar za 1, Ferbruar za 2....)
		 */
		
		// generisemo nasumican broj i dodjeljujemo ga varijabli num, posto
		// Math.random generise od 0 dodajemo +1 na dobiveni broj kako bi
		// generisali brojeve od 1 do 12
		int num = (int) (Math.random() * 12 + 1);
		// u niz spremamo imena mjeseci, na nulti indeks smo stavili nulu radi
		// lakseg pronalazenja tacnog mjeseca
		String[] months = { "0", "Januar", "Februar", "Mart", "April", "Maj",
				"Juni", "Juli", "August", "Septembar", "Oktobar", "Novembar",
				"Decembar" };
		// ispis za nasumican broj i mjesec koji je pod tim rednim brojem
		System.out.println("Nasumicno generisan broj je " + num
				+ ", a to je mjesec " + months[num]);
	}

}
