//SavingsAccount.java

public class SavingsAccount extends CheckingAccount{
	private double interestRate;
	
	public SavingsAccount(){
		super();
		interestRate = 0.01;
	}

	public void setInterestRate(double rate){
		this.interestRate = rate;
	}

	public double getInterestRate(){
		return interestRate;
	}
//(Ended up not using calInterest())
//	public void calculateInterest(){
//		double interest = getBalance() * interestRate;
//	}

	public void applyInterest(){
		double interest = getBalance() * interestRate;
		deposit(interest);
		System.out.println("New balance: " + String.format("%.2f", getBalance()));
	}
}

