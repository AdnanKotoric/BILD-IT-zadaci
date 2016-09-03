package zadaci_01_09_2016;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak_1 {

	public static void main(String[] args) {
		try {
			int assis = 0;
			int assoc = 0;
			int full = 0;
			double totalSalaryAssis = 0;
			double totalSalaryAssoc = 0;
			double totalSalaryFull = 0;
			// novi objekat
			java.net.URL url = new java.net.URL("http://cs.armstrong.edu/liang/data/Salary.txt");
			// ucitamo ga
			Scanner input = new Scanner(url.openStream());
			String fname = "";
			String lname = "";
			String rank = "";
			String salary = "";
			// spremamo 
			while (input.hasNext()) {
				fname = input.next();
				lname = input.next();
				rank = input.next();
				salary = input.next();
				if (rank.equals("assistant")) {
					// sabiremo iznose
					totalSalaryAssis += Double.parseDouble(salary);
					assis++;
				}
				if (rank.equals("associate")) {
					totalSalaryAssoc += Double.parseDouble(salary);
					assoc++;
				}
				if (rank.equals("full")) {
					totalSalaryFull += Double.parseDouble(salary);
					full++;
				}
			}
			// izracunavamo ukupan iznos
			double totalSalary = totalSalaryAssis + totalSalaryAssoc + totalSalaryFull;
			DecimalFormat f = new DecimalFormat("#.##");
			// ispis iznosi
			System.out.println("Total of assistants salary: " + f.format(totalSalaryAssis));
			System.out.println("Total of associates salary: " + f.format(totalSalaryAssoc));
			System.out.println("Total of full salary: " + f.format(totalSalaryFull));
			System.out.println("Average assistant salary: " + Math.floor(totalSalaryAssis / assis));
			System.out.println("Average associate salary: " + Math.floor(totalSalaryAssoc / assoc));
			System.out.println("Average full salary: " + Math.floor(totalSalaryFull / full));
			System.out.println("Total of all salary: " + f.format(totalSalary));
			System.out.println("Average salary: " + totalSalary / (assis + full + assoc));

			input.close();
		} catch (java.net.MalformedURLException ex) {
			System.out.println("Invalid URL");
		} catch (java.io.IOException ex) {
			System.out.println("I/O Errors: no such file");
		}
	}

}