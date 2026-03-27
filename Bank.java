//Bank.java
//(Will be handling most if not all the logic)

import java.util.Scanner;

public class Bank implements HasMenu{
	//Instance variables derrived from the bank class in the UML
	private Admin admin;
	private CustomerList customers;

	//Constructor
	public Bank(){
		admin = new Admin();
		customers = new CustomerList();
	}

	//Bank menu
	public String menu(){
		return "\nBank Menu\n"
			+ "0) Exit system\n"
			+ "1) Login as admin\n"
			+ "2) Login as customer\n";
	}

	//Bank main loop
	public void start(){
		Scanner sc = new Scanner(System.in);
		int choice = -1;
		while (choice != 0){
			System.out.println(menu());
			System.out.print("Action: ");
			choice = sc.nextInt();
			if (choice == 1){
				adminLogin();
			}
			else if (choice == 2){
				customerLogin();
			}
			else if (choice == 0){
				System.out.println("Exiting system");
			}
			else {
				System.out.println("Invalid input");
			}
		}
	}

	//Admin methods
	private void adminLogin(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter admin username: ");
		String user = sc.nextLine();

		System.out.print("Enter admin PIN: ");
		String pin = sc.nextLine();

		if (user.equals(admin.getUserName()) && Integer.parseInt(pin) == admin.getPin()){
			System.out.println("Login successful.");
			startAdmin();
		} else {
			System.out.println("Admin login failed.");
		}
	}

	private void startAdmin(){
		Scanner sc = new Scanner(System.in);
		int choice = -1;

		while (choice != 0){
			System.out.println(admin.menu());
			System.out.print("Action: ");
			choice = sc.nextInt();
			sc.nextLine();

			if (choice == 1){
				fullCustomerReport();
			}
			else if (choice == 2){
				addUser();
			}
			else if (choice == 3){
				applyInterest();
			}
			else if (choice == 0){
				System.out.println("Exiting to main menu.");
			}
			else {
				System.out.println("Invalid Input.");
			}
		}
	}
	private void fullCustomerReport(){
		System.out.println("\n--Full Customer Report--");
		if (customers.isEmpty()){
			System.out.println("No customers found.");
			return;
		}
		
		for (Customer c : customers){
			System.out.println(c);
		}
	}
	private void addUser(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter customer name: ");
		String name = sc.nextLine();

		System.out.print("Enter customer PIN: ");
		int pin = sc.nextInt();
	        sc.nextLine();

		Customer c = new Customer(name, pin);
		customers.add(c);

		System.out.println("Customer added succesfully.");
	}

	private void applyInterest(){
		if (customers.isEmpty()){
			System.out.println("No customers to apply interest to.");
			return;
		}
		for (Customer c : customers){
			c.getSavings().applyInterest();
		}
		System.out.println("Interest applied to all savings accounts.");
	}

	//Customer login
	privtae void customerLogin(){
		Scanner sc = new Scanner(System.in);
		SYstem.out.print("Enter customer name: ");
		String name = sc.nextLine();

		System.out.print("Enter customer PIN: ");
		int pin = sc.nextInt();
		sc.nextLine();

		for (Customer c : customers){
			if (c.getUserName().equals(name) && c.getPin() == pin){
				System.out.println("Customer login successful.");
				startCustomer(c);
				return;
			}
		}
		System.out.println("Customer login failed.");
	}

	//Customer menu
	private void startCustomer(Customer c){
		Scanner sc = new Scanner(System.in);
		int choice = -1;

		while (choice != 0){
			System.out.println(c.menu());
			System.out.print("Action: ");
			choice = sc.nextInt();
			sc.nextLine();

			if (choice == 1){
				c.getChecking().makeDeposit();
			}
			else if (choice == 2){
				c.getSavings().makeDeposit();
			}
			else if (choice == 3){
				System.out.print("Enter new PIN: ");
				int newPin = sc.nextInt();
				sc.nextLine();
				c.changePn(newPin);
				System.out.println("Pin updated.");
			}
			else if (choice == 4){
				System.out.println(c.getReport());
			}
			else if (choice == 0){
				System.out.println("Exiting customer menu");
			}
			else {
				System.out.print;n("Invalid input.");
			}
		}
	
}
