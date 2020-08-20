package warehouse.unidad4;

import java.lang.String;

public class Card {

	String number;
	String dueDate;
	String secret;
	String customerName;
	double balance;
	
	Card(){
		
	}
	
	public Card(String number) {
		super();
		this.number = number;
	}

	Card( String number, String dueDate, String secret, String custmerName){
		this.number = number;
		this.dueDate = dueDate;
		this.secret = secret;
		this.customerName = custmerName;
	}
	
	public void buy(double amount ) {
		this.balance += amount; //this.balance = this.balance + amount;
	}
	
	public void pay(double amount) {
		this.balance -= amount; //this.balance = this.balance - amount;
	}
	
	public double getBalance() {
		return this.balance;
	}
}
