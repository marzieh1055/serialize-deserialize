package ir.freeland.serialize;

import java.io.Serializable;

public class User implements Serializable {
	
	
	private String name;
    private transient String password;
    private transient int cardNumber;
    
    
    
	public User(String name, String password, int cardNumber) {
		this.name = name;
		this.password = password;
		this.cardNumber = cardNumber;

	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + ", cardNumber=" + cardNumber + "]";
	}
	

}
