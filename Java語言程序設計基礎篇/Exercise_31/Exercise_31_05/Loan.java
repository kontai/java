package Java語言程序設計基礎篇.Exercise_31.Exercise_31_05;

public class Loan implements java.io.Serializable {
	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;


	public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
		this.annualInterestRate = annualInterestRate;
		this.numberOfYears = numberOfYears;
		this.loanAmount = loanAmount;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public int getNumberOfYears() {
		return numberOfYears;
	}

	public double getLoanAmount() {
		return loanAmount;
	}
}