package hotel;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Korisnik {

	public String userName;
	public String password;
	public int roomNumb;

	public Korisnik() {

	}

	public String getUsername() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public int getRoomNumb() {
		return roomNumb;
	}
/*
 provjerava da li je username i password validan
 */
	public boolean checkUser(String userName, String password) {

		String databaseUsername = "";
		String databasePassword = "";

		try {
			Connection con = Hotel.getConnection();
			PreparedStatement statement = con
					.prepareStatement("SELECT korisnickoIme FROM hotel.gost WHERE korisnickoIme='"
							+ userName + "' AND password='" + password + "';");
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				databaseUsername = rs.getString("korisnickoIme");
				databasePassword = rs.getString("password");
			}

			if (userName.equals(databaseUsername)
					&& password.equals(databasePassword))
				return true;
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}
//rezervise kod admina uslgu koju zeli i pise u fajl
	public static void reservation(String userName) {
		Scanner input = new Scanner(System.in);
		String[] kolona = { "0", "teretana", "kino", "bazen", "sauna",
				"teniski teren", "koktel bar", "nocni klub" };
		int choice = input.nextInt();
		System.out
				.println("Izaberite koju uslugu hotela zelite da koristite \n1. Teretana.\n2. Kino.\n3. Bazen.\n4. Sauna.\n5. Teniski teren.\n6. Koktel bar.\n7. Nocni klub.");

		String rezervacija = "Gost " + userName + " zeli rezervisati uslugu"
				+ kolona[choice];
		Korisnik.writeToFile(rezervacija);
		System.out.println("Uspjesno ste rezervisali uslugu");
		input.close();
	}
//ukoliko korisnik zeli da promijeni sobu pise notifikaciju korisniku
	public static void updateRoom(String userName) throws Exception {
		Scanner input = new Scanner(System.in);
		Admin admin = new Admin();

		System.out.println("Unesite broj za sobu u koju se zelite premjestiti");
		int roomNumb = input.nextInt();

		try {
			if (admin.izdata(roomNumb) == false) {
				String izmjenaSobe = "Gost " + userName
						+ " se zeli premjestiti u sobu broj " + roomNumb;
				Korisnik.writeToFile(izmjenaSobe);
				System.out.println("Uspjesno ste izvrsili izmjenu sobe!");
			}
		} catch (Exception e) {
			System.out.println("Soba je izdata, unesite drugi broj sobe!");
		}
	}
//ukoliko se gost zeli odjaviti iz hotela salje notifikaciju u fajl
	public static void checkOutUser(String userName) throws IOException {
		String odjava = "Gost " + userName + " zeli odjaviti usluge";
		Korisnik.writeToFile(odjava);
		System.out.println("Uspjesno ste naznacili odjavu usluga");
	}
//metoda za pisanje u fajl
	public static void writeToFile(String notifikacija) {
		BufferedWriter bw = null;
		try {
			File file = new File("rezervacija.txt");

			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			bw.write(notifikacija);

		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				if (bw != null)
					bw.close();
			} catch (Exception ex) {
				System.out.println("Error in closing the BufferedWriter" + ex);
			}
		}
	}
}
