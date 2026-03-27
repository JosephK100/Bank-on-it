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
				System.out.println("Login as customer pressed");
			}
			else if (choice == 0){
				System.out.println("Exiting system");
			}
			else {
				System.out.println("Invalid input");
			}
		}
	}

	private void adminLogin(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter admin username: ");
		String user = sc.nextLine();

		System.out.print("Enter admin PIN: ");
		String pin = sc.nextLine();

		if (user.equals(admin.getUserName()) && pin.equals(admin.getPin())){
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

		System.out.print("Enter customer ID: ");
		String id = sc.nextLine();

		Customer c = new Customer(name, id);
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
}
