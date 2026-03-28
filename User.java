//User.java(abstract)
import java.io.Serializable;

//Shared user info for all subclasses.
public abstract class User implements HasMenu, Serializable{
	protected String userName;
	protected int pin;

	//Constructor, intializes userName and PIN
	public User(String userName, int pin){
		this.userName = userName;
		this.pin = pin;
	}
	
	//Validates login credentials by comparing userName and PIN
	public boolean login(String userName, int pin){
		return this.userName.equals(userName) && this.pin == pin;
	}

	//Returns the userName
	public String getUserName(){
		return userName;
	}

	//Returns the PIN
	public int getPin(){
		return pin;
	}
}
