package warehouse.unidad5.interfeces;

public abstract class BaseCard{
	
	protected String number;
	protected String customerName;
	protected double balance;
	
	public abstract void block();
	
	public void pay(double amount) {
		this.balance -= amount;
	}
	
	public void buy(double amount) {
		this.balance += amount;
	}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
}
