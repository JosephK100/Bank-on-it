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
		return "";
	}
	public void start(){
	
	}
	public double getBalance(){
		return balance;
	}
	public String getBalanceString(){
		return String.format("$%.2f", balance);
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
