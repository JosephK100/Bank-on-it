//Customer.java (extends user)

public class Customer extends User{
	private CheckingAccount checking;
	private SavingsAccount savings;

	public Customer(String userName, int pin){
		super(userName, pin);
		checking = new CheckingAccount();
		savings = new SavingsAccount();
	}

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

	public void changePIN(int newPin){
		this.pin = newPin;
	}

	public String getReport(){
		return "Customer: " + userName
			+ "\nChecking Balance: " + checking.getBalance()
			+ "\nSavings Balance: " + savings.getBalance();
	}

	public CheckingAccount getChecking(){
		return checking;
	}

	public SavingsAccount getSavings(){
		return savings;
	}
}

