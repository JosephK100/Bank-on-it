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
				System.out.println("Admin login pressed");
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
}
