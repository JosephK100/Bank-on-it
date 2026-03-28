//Customer.java (extends user)
import java.io.Serializable;

//Every user gets one checking and saving account
public class Customer extends User implements Serializable{
	private CheckingAccount checking;
	private SavingsAccount savings;

	//Basic constructor, intializaes username, PIN, and the creation of new accounts.
	public Customer(String userName, int pin){
		super(userName, pin);
		checking = new CheckingAccount();
		savings = new SavingsAccount();
	}

	//Returns the customer menu options.
	public String menu(){
		return "\nCustomer Menu\n"
			+ "0) Exit Customer Menu\n"
			+ "1) Checking Account\n"
			+ "2) Savings Account\n"
			+ "3) Change PIN\n"
			+ "4) Get Report\n";
	}

	public void start(){
		//Just a palceholder for now
	}

	//Updates the customer's PIN.
	public void changePIN(int newPin){
		this.pin = newPin;
	}

	//Returns a report of the customer's checking and savings balance.
	public String getReport(){
		return "Customer: " + userName
			+ "\nChecking Balance: " + checking.getBalance()
			+ "\nSavings Balance: " + savings.getBalance();
	}

	//Reutns the checking account balance.
	public CheckingAccount getChecking(){
		return checking;
	}

	//Reutrns the savings account balance
	public SavingsAccount getSavings(){
		return savings;
	}

	//Returns a string representation of the customer.
	public String toString(){
		return "Customer: " + userName +
			"\nChecking Balance: " + checking.getBalance() +
			"\nSavings Balance : " + savings.getBalance() + "\n";
	}
}

