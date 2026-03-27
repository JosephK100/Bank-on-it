//SavingsAccount.java

public class SavingsAccount extends CheckingAccount{
	private double interestRate;
	
	public SavingsAccount(){
		super();
		interestRate = 0.1;
	}

	public void setInterestRate(double rate){
		this.interestRate = rate;
	}

	public double getInterestRate(){
		return interestRate;
	}

	public void calculateInterest(){
		double interest = getBalance() * interestRate;
	}

	public void applyInterest(){
		double interest = getBalance() * interestRate;
		deposit(interest);
}
