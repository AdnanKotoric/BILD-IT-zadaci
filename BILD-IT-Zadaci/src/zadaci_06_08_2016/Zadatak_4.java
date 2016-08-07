package zadaci_06_08_2016;

import java.util.Scanner;

public class Zadatak_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite recenicu: ");
		String s = input.nextLine();
		input.close();

		for (int i = 0; i < s.length(); i+=2) {
			if (Character.isLetter(s.charAt(i))) {
					System.out.print(s.charAt(i));
				}

			}
		}

	}


