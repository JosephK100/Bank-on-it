//Admin (Extends user)

//Constructor that sets default user name and PIN.
public class Admin extends User{
	public Admin(){
		super("admin", 0000);
	}

	public String menu(){
		return "\nAdmin Menu\n"
			+ "0) Exit\n"
			+ "1) Full Customer Report\n"
			+ "2) Add User\n"
			+ "3) Apply Interest\n";
	}

	public void start(){
	}

	public String getReport(){
		return "Admin username" + this.userName;
	}
}
