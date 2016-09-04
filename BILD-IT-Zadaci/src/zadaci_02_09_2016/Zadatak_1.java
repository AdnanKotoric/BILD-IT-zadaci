package zadaci_02_09_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {

			// Unos korisnika za godinu
			System.out.print("Unesite godinu: ");
			int year = input.nextInt();

			// Unos korisnika za mjesec
			System.out.print("Unesite mjesec, koristite brojeve od 1 do 12: ");
			int month = input.nextInt();

			// ispis kalendara za uneseni mjesec i godinu
			printMonth(year, month);
			input.close();
		} catch (InputMismatchException e) {
			System.out.println("Wrong input");
			main(args);
		}
	}

	
	public static void printMonth(int year, int month) {
		// ispis headera kalendara
		printMonthTitle(year, month);

		// ispis tijela kalendara
		printMonthBody(year, month);
	}

	
	public static void printMonthTitle(int year, int month) {
		System.out.println(" " + getMonthName(month) + " " + year);
		System.out.println("-----------------------------");
		System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
	}


	public static String getMonthName(int month) {
		String monthName = "";
		switch (month) {
		case 1:
			monthName = "January";
			break;
		case 2:
			monthName = "February";
			break;
		case 3:
			monthName = "March";
			break;
		case 4:
			monthName = "April";
			break;
		case 5:
			monthName = "May";
			break;
		case 6:
			monthName = "June";
			break;
		case 7:
			monthName = "July";
			break;
		case 8:
			monthName = "August";
			break;
		case 9:
			monthName = "September";
			break;
		case 10:
			monthName = "October";
			break;
		case 11:
			monthName = "November";
			break;
		case 12:
			monthName = "December";
		}

		return monthName;
	}

	
	public static void printMonthBody(int year, int month) {
		//trazimo početni dan u sedmici za prvi dan u mjesecu
		int startDay = getStartDay(year, month);

		// trazimo broj dana u mjesecu
		int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);

		//dodajemo prazna mjesta do prvog dana u mjesecu
		int i = 0;
		for (i = 0; i < startDay; i++)
			System.out.print(" ");

		for (i = 1; i <= numberOfDaysInMonth; i++) {
			System.out.printf("%4d", i);

			if ((i + startDay) % 7 == 0)
				System.out.println();
		}

		System.out.println();
	}

	
	public static int getStartDay(int year, int month) {
		final int START_DAY_FOR_JAN_1_1800 = 3;
		// trazimo ukuan broj dana od 1/1/1800 do month/1/year
		int totalNumberOfDays = getTotalNumberOfDays(year, month);

		// vracamo dan kojim zapocinjene uneseni mjesec 
		return (totalNumberOfDays + START_DAY_FOR_JAN_1_1800) % 7;
	}

	
	public static int getTotalNumberOfDays(int year, int month) {
		int total = 0;

		// racuna ukupan broj dana od 1800 do 1/1/year unesene godine
		for (int i = 1800; i < year; i++)
			if (isLeapYear(i))
				total = total + 366;
			else
				total = total + 365;

		// dodaje dane od Januara do mjeseca prije kalendarskog mjeseca
		for (int i = 1; i < month; i++)
			total = total + getNumberOfDaysInMonth(year, i);

		return total;
	}


	public static int getNumberOfDaysInMonth(int year, int month) {
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
			return 31;

		if (month == 4 || month == 6 || month == 9 || month == 11)
			return 30;
		if (month == 2)
			return isLeapYear(year) ? 29 : 28;
		return 0; // ukoliko unos je netacan
	}


	public static boolean isLeapYear(int year) {
		return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	}
}