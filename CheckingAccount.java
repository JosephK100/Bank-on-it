import java.util.Scanner;

public class CheckingAccount implements HasMenu{
	private double balance;

	public CheckingAccount(){
		this.balance = 0.0;
	}
	private CheckingAccount(){
		this.balance = 0.0
	}
	public CheckingAccount(double balance){
		this.balance = balance;
	}
	public static void main(String[] args){
		CheckingAccount ca = new CheckingAccount();
		ca.start();
	}
	public String menu(){
		System.out.println("Account menu");
		System.out.println("0) Quit");
		System.out.println("1) Check balance");
		System.out.println("2) Make a deposit");
		System.out.println("3) Make a withdrawl");
		System.out.print("Please enter 0-3");
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}
	public void start(){
		while (true){
			String choice = menu();
			if (choice.equals( "0")){
				return;
			} else if (choice.equals("1")){
				checkBalance();
			} else if (choice.equals("2")){
				makeDeposit();
			} else if (choice.equals("3")){
				makeWithdrawal();
			} else {
				System.out.println("Invlaid choice.")
		}
	}
	}
	public double getBalance(){
		return balance;
	}
	public void makeDeposit(){
		System.out.println("Making a deposit...");
		System.out.print("How much would you like to deposit?");
		double amt = getDouble();
		blance += amt;
		System.out.println("New balance: " + getBalance());
	}
	public void makeWithdrawal(){
		System.out.print;n("Making a withdrawal...");
		System.out.print("How much would you like to withdraw?");
		double amt = getDouble();
		balance -= amt;
		System.out.println("New balance: " + getBalance());
	}
	private double getDouble(){
		Scanner sc = new Scanner(System.in);

	public String getBalanceString(){
		return String.format("$%.2f", balance);
		try{
			return Double.parseDouble(sc.nextLine());
		} catch (Exception e){
			return 0.0;
		}
	}
	public void setBalance(double balance){
		this.balance = balance;
	}
	public void checkBalance(){
		System.out.println("Checking balance...");
		System.out.println("Current balance: " + getBalanceString());
	}
	private double getDouble(){
		//Lost on this part
