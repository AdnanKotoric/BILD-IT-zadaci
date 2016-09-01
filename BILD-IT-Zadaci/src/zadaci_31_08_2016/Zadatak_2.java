package zadaci_31_08_2016;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Zadatak_2 {

	public static void main(String[] args) {
				try {
					//unos korisnika
					Scanner input = new Scanner(System.in);
					System.out.println("Unesite izjavu: ");
					String s = input.nextLine();

					//Kreiranje novih fajlova i pisanje u njih
					for (int i = 0; i < 10; i++) {
						File file = new File("chapter" + i + ".txt");
						PrintWriter write = new PrintWriter(file);
						write.println("content");
						write.close();
					}

					//citanje fajlova i pisanje u njih
					String done = null;
					String str = null;
					for (int i = 0; i < 10; i++) {
						File file = new File("chapter" + i + ".txt");
						Scanner read = new Scanner(file);
						while (read.hasNextLine()) {
							done = read.nextLine();

						}
						str = s + "\n" + done;

						read.close();

						PrintWriter write = new PrintWriter(file);
						write.println(str);
						write.close();
					}
					input.close();
				} catch (Exception e) {
					System.out.println("Doslo je do greske.");
				}
			}

		}