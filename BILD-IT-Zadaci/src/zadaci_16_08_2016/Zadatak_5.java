package zadaci_16_08_2016;

import java.util.Scanner;

public class Zadatak_5 {

	public static void main(String[] args) {
		/*
		 * program koji pita korisnika da unese cijeli broj te ispisuje piramidu
		 * svih brojeva do tog broja. (Na primjer, ukoliko korisnik unese 7 vrh
		 * piramide je broj 1, red ispod vrha piramide je 2 1 2, red ispod je 3
		 * 2 1 2 3, red ispod 4 3 2 1 2 3 4 itd.)
		 */
		 System.out.print("Unesite cijeli broj za ispis piramide do tog broja: ");
		  Scanner input = new Scanner(System.in);
		   
		  //Unos korisnika za do kojeg broja cemo ispisati piramidu
		  int numb = input.nextInt();
		   
		  //petlja kroz redove od 1 do broja koji je korisnik unio
		  for (int i = 1; i <= numb; i++) {
		   // Ispisujemo razmake, 2 odjednom od j=1 do j= n-i 
		   for (int j = 1; j <= (numb - i); j++) {
		    System.out.print("  ");
		   }
		    
		   //Ispisujemo brojeve padajucim redoslijedom od reda j do reda 1
		   for (int j = i; j >= 1; j--) {
		    System.out.print(j + " ");
		   }
		    
		   //Ispisujemo brojeve u rastucem redoslijedu od reda 2 tdo reda j
		   for (int j = 2; j <= i; j++) {
		    System.out.print(j + " ");
		   }
		   System.out.println();
		 
		  }
		  input.close();
	}

}
