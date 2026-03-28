import java.util.Scanner;
import java.io.Serializable;

public class CheckingAccount implements HasMenu, Serializable{
	//Sotes the current balance for this checking account
	private double balance;
	//Basic constructor with a starting balance of 0.0
	public CheckingAccount(){
		this.balance = 0.0;
	}
	//Constructor that lets you set a starting balance.
	public CheckingAccount(double balance){
		this.balance = balance;
	}
	//Main method for the testing the CheckingAccount class
	public static void main(String[] args){
		CheckingAccount ca = new CheckingAccount();
		ca.start();//Start menu loop
	}
	//Prints my menu options and returns user choice
	public String menu(){
		System.out.println("Account menu");
		System.out.println("0) Quit");
		System.out.println("1) Check balance");
		System.out.println("2) Make a deposit");
		System.out.println("3) Make a withdrawl");
		System.out.print("Please enter 0-3: ");
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}
	//Main loop for the menu until user enters 0
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
				System.out.println("Invalid choice.");
		}
	    }
	}
	//Reutrns the balance value
	public double getBalance(){
		return balance;
	}
	//Handles deposits prints the new balance 
	public void makeDeposit(){
		System.out.println("Making a deposit...");
		System.out.print("How much would you like to deposit? ");
		double amt = getDouble();
		balance += amt;
		System.out.println("New balance: " + String.format("%.2f", getBalance()));
	}
	//Handles withdrawals and prints the new balance.
	public void makeWithdrawal(){
		System.out.println("Making a withdrawal...");
		System.out.print("How much would you like to withdraw? ");
		double amt = getDouble();//Read the double from the user
		balance -= amt;//Subtract entered amount
		System.out.println("New balance: " + String.format("%.2f", getBalance()));
	}
	//Safely read a double from the user without crashing the program
	private double getDouble(){
		Scanner sc = new Scanner(System.in);
		try {
			return Double.parseDouble(sc.nextLine());//Attempt to convert the users input into a double.
		} catch (Exception e) {
			//If the user types something invalid, return a 0.0
			return 0.0;
		}
	}

	//Formats the balance in money format.
	public String getBalanceString(){
		return String.format("$%.2f", balance);
	
	}
	//Lets the balance be changed manually if needed.
	public void setBalance(double balance){
		this.balance = balance;
	}
	//Prints the current balance 
	public void checkBalance(){
		System.out.println("Checking balance...");
		System.out.println("Current balance: " + getBalanceString());
	}
	public void deposit(double amount){
		balance += amount;
	}
}
