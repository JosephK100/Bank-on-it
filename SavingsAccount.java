//SavingsAccount.java
import java.io.Serializable;

public class SavingsAccount extends CheckingAccount implements Serializable{
	private double interestRate;
	//The interest rate applied to the savings accounts
	public SavingsAccount(){
		super();//Intialize balance from CheckingAccount
		interestRate = 0.01;
	}

	//Sets a new interest rate.
	public void setInterestRate(double rate){
		this.interestRate = rate;
	}

	//Returns the current interest rate.
	public double getInterestRate(){
		return interestRate;
	}

	//Applies interest to the current balance and prints the updated balance
	//Calculated as balance x interestRate
	public void applyInterest(){
		double interest = getBalance() * interestRate;
		deposit(interest);//Inherited from CheckingAccount
		System.out.println("New balance: " + String.format("%.2f", getBalance()));
	}
}

