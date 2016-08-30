package zadaci_29_08_2016;

public class Loan {
	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private java.util.Date loanDate;

	// konstruktor
	public Loan() throws IllegalArgumentException {
		this(3.5, 2, 3000);
	}

	// konstruktor za odredjene vrijednosti interest rate,number of years, and
	// loan amount

	public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
		// illegal argument exception
		IllegalArgumentException e = new IllegalArgumentException();
		if (annualInterestRate < 0 || numberOfYears < 0 || loanAmount < 0) {
			throw e;
		}
		this.annualInterestRate = annualInterestRate;
		this.numberOfYears = numberOfYears;
		this.loanAmount = loanAmount;
		loanDate = new java.util.Date();
	}

	// Interesna stopa
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	// seter za stopu
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	// geter za broj god
	public int getNumberOfYears() {
		return numberOfYears;
	}

	// seter za broj godina
	public void setNumberOfYears(int numberOfYears) {
		this.numberOfYears = numberOfYears;
	}

	// geter za iznos
	public double getLoanAmount() {
		return loanAmount;
	}

	// seter za iznos
	public void setLoanAmount(double loanAmount)
			throws IllegalArgumentException {

		this.loanAmount = loanAmount;
	}

	// izracun mjesecne rate
	public double getMonthlyPayment() {
		double monthlyInterestRate = annualInterestRate / 1200;
		double monthlyPayment = loanAmount
				* monthlyInterestRate
				/ (1 - (1 / Math.pow(1 + monthlyInterestRate,
						numberOfYears * 12)));
		return monthlyPayment;
	}

	// izracun ukupne ratei
	public double getTotalPayment() {

		double totalPayment = getMonthlyPayment() * numberOfYears * 12;
		return totalPayment;
	}

	public java.util.Date getLoanDate() {
		return loanDate;
	}
}
