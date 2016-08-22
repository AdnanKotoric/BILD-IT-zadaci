package zadaci_20_08_2016;

import java.util.ArrayList;
import java.util.Date;

public class Zadatak_4 {
	/*
	 * (The Account class) Design a class named Account that contains: ■ ■ ■ ■ ■
	 * ■ ■ ■ ■ ■ ■ ■ A private int data field named id for the account (default
	 * 0 ). A private double data field named balance for the account (default 0
	 * ). A private double data field named annualInterestRate that stores the
	 * cur- rent interest rate (default 0 ). Assume all accounts have the same
	 * interest rate. A private Date data field named dateCreated that stores
	 * the date when the account was created. A no-arg constructor that creates
	 * a default account. A constructor that creates an account with the
	 * specified id and initial balance. The accessor and mutator methods for id
	 * , balance , and annualInterestRate . The accessor method for dateCreated
	 * . A method named getMonthlyInterestRate() that returns the monthly
	 * interest rate. A method named getMonthlyInterest() that returns the
	 * monthly interest. A method named withdraw that withdraws a specified
	 * amount from the account. A method named deposit that deposits a specified
	 * amount to the account. Draw the UML diagram for the class and then
	 * implement the class. (Hint: The method getMonthlyInterest() is to return
	 * monthly interest, not the interest rate. Monthly interest is balance *
	 * monthlyInterestRate . monthlyInterestRate is annualInterestRate / 12 .
	 * Note that annualInterestRate is a percentage, e.g., like 4.5%. You need
	 * to divide it by 100.) Write a test program that creates an Account object
	 * with an account ID of 1122, a balance of $20,000, and an annual interest
	 * rate of 4.5%. Use the withdraw method to withdraw $2,500, use the deposit
	 * method to deposit $3,000, and print the balance, the monthly interest,
	 * and the date when this account was created.
	 */

	public static void main(String[] args) {
		// pravimo objekat Account klase i postavljamo vrijdnosti
		Account account = new Account(1122, 20000);
		account.setAnnualInterestRate(4.5);
		// pomocu metoda koje smo napravili u akaunt klasi postavljamo id racuna
		// stanje racuna te uplacujemo odnosno dizemo novac sa racuna
		System.out.println("Akaunt ID: " + account.getId());
		System.out.println("Stanje racuna: " + account.getBalance());

		System.out.println("Uzimanje $2,500 s racuna");
		account.withdraw(2500);

		System.out.println("Uplacivanje $3,000 na racun");
		account.deposit(3000);
		// ispisujemo novo stanje racuna nakon uplate i isplate i ispisujemo sve
		// podatke o racunu
		System.out.println("Trenutno stanje racuna.");
		System.out.println("Akaunt ID: " + account.getId());
		System.out.println("Stanje racuna: " + account.getBalance());
		System.out.println("Mjesecna interesna stopa: "
				+ account.getMonthlyInterestRate());
		System.out.println("Datum kada je racun napravljen: "
				+ account.getDateCreated());

	}

}

class Account {
	// data field-i za nasu klasu
	private String name;
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	private ArrayList<Transaction> transactions;// u listu spremamo transakcije
												// koje smo uradili stoga smo
												// napravili novu klasu koja ce
												// nam vracati kao string sve
												// detalje o transakciji

	// konstruktor pravimo objekte za datum i transakciju

	public Account() {
		dateCreated = new Date();
		transactions = new ArrayList<>();
	}

	// geteri i seteri za datu klasu i unos korisnika
	public Account(int id, double balance) {
		this();
		this.id = id;
		this.balance = balance;
	}

	public Account(String name, int id, double balance) {
		this(id, balance);
		this.name = name;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	// racunamo mjesecnu interesnu stopu za interesnu stopu koju je korisnik
	// postavio
	public double getMonthlyInterestRate() {
		return balance * (annualInterestRate / 12) / 100;
	}

	// isplata novca pomocu klase transactions i novo stanje racuna
	public void withdraw(double amount) {
		transactions.add(new Transaction('W', amount, balance, "withdraw"));
		balance -= amount;
	}

	// isplata novca pomocu klase transactions i novo stanje racuna
	public void deposit(double amount) {
		transactions.add(new Transaction('D', amount, balance, "deposit"));
		balance += amount;
	}

	// override toString kako bi ispisali detalje racuna
	@Override
	public String toString() {
		return "Account name: " + name + "\n" + "Interest rate: "
				+ annualInterestRate + "\n" + transactions;
	}

	public ArrayList<Transaction> getTransactions() {
		return new ArrayList<>(transactions);
	}

}

// napravili smo klasu transactions kako bi olaksali posao oko isplate i uplate
// sa racuna
class Transaction {

	private java.util.Date date;
	private char type;
	private double amount;
	private double balance;
	private String description;

	public Transaction() {

	}

	// konstruktor kojem prosljedjuemo sve potrebne argumente kako bi ispisali
	// to kao string i kasnije spremili u listu u Account klasi
	public Transaction(char type, double amount, double balance,
			String description) {
		this.date = new java.util.Date();
		this.type = type;
		this.amount = amount;
		this.balance = balance;
		this.description = description;
	}
//geteri i seteri klase
	public java.util.Date getDate() {
		return date;
	}

	public void getDateCreated() {
		this.date = date;
	}

	public char getType() {
		return type;
	}

	public double getAmount() {
		return amount;
	}

	public double getBalance() {
		return balance;
	}

	public String getDescription() {
		return description;
	}
//override toString metode koja nam vraca sve kao string ispis
	@Override
	public String toString() {
		return "Transaction [date=" + date + ", type=" + type + ", amount="
				+ amount + ", balance=" + balance + ", description="
				+ description + "]";
	}

}
