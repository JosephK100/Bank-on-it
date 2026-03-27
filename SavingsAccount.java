//SavingsAccount.java

public class SavingsAccount extends CheckingAccount{
	private double interestRate;
	
	public SavingsAccount(){
		super();
		interestRate = 0.0;
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
}
