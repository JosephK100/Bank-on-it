//Admin (Extends user)

//Constructor that sets default user name and PIN for the admin user.
public class Admin extends User{
	public Admin(){
		super("admin", 0000);
	}

	//Reutrn the admin menu options as a formatted string.
	public String menu(){
		return "\nAdmin Menu\n"
			+ "0) Exit\n"
			+ "1) Full Customer Report\n"
			+ "2) Add User\n"
			+ "3) Apply Interest\n";
	}

	//Admin start method
	//Logic handled inside Bank.startAdmin()
	public void start(){
	}

	//Returns admin report string
	public String getReport(){
		return "Admin username" + this.userName;
	}
}
