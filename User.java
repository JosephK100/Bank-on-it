//User.java(abstract)
import java.io.Serializable;

public abstract class User implements HasMenu, Serializable{
	protected String userName;
	protected int pin;

	public User(String userName, int pin){
		this.userName = userName;
		this.pin = pin;
	}
	
	public boolean login(String userName, int pin){
		return this.userName.equals(userName) && this.pin == pin;
	}

	public String getUserName(){
		return userName;
	}

	public int getPin(){
		return pin;
	}
}
