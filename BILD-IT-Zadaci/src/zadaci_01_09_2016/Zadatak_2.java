package zadaci_01_09_2016;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Zadatak_2 {

	
		public static void searchFile(File file) throws IOException {
			// pravimo skener
			Scanner input = new Scanner(file);
			String a = "";
			// citamo fajl i spremamo ga
			while (input.hasNext()) {
				String chars = input.next();
				a += chars;
				a.toCharArray();
			}
			char[] array = new char[a.toCharArray().length];
			// prebrojavamo ponavljanje karaktera
			for (char b = 'a'; b <= 'z'; b++) {
				for (int i = 0; i < a.toCharArray().length; i++) {
					if (a.toCharArray()[i] == b) {
						array[b]++;
					}
				}
				//ispisujemo karaktere i broj ponavljanja
				System.out.println(b + " " + (int) array[b]);
			}
			input.close();
		}

		public static void main(String[] args) throws IOException {
			java.util.Scanner input = new java.util.Scanner(System.in);
			System.out.println("Enter the file name: ");
			// Linkoln.txt
			String filename = input.nextLine();
			java.io.File file = new java.io.File(filename);
			// poziv metode
			searchFile(file);
			input.close();
		}
	}