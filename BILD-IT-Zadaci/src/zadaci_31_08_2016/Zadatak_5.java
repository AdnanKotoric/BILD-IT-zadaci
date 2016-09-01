package zadaci_31_08_2016;

import java.io.File;
import java.io.FileNotFoundException;

public class Zadatak_5 {

	public static void main(String[] args) {
		// fajl u koji spremamo
				File file = new File("salary.txt");
				// niz za rang
				String[] rank = { "assistant", "associate", "full" };
				double salary = 0;
				try {
					// pravimo printwriter za unos u fajl
					java.io.PrintWriter write = new java.io.PrintWriter(file);
					for (int i = 1; i <= 1000; i++) {
						// nasumicno biranje ranga iz niza
						int r = (int) (Math.random() * 3);
						// izracunavanje zarade
						if (rank[r].equals("assistant")) {
							salary = Math.round(50000 + Math.random() * 30000);
						}
						if (rank[r].equals("associate")) {
							salary = Math.round(60000 + Math.random() * 50000);
						}
						if (rank[r].equals("full")) {
							salary = Math.round(75000 + Math.random() * 50500);
						}
						// unos u fajl
						write.println("Ime " + i + " Prezime " + i + " " + rank[r] + " " + salary);
					}
					write.close();
				} catch (FileNotFoundException e) {
					System.out.println("File not found");
				}

			}

		}