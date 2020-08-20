package warehouse.unidad4_1;

public class CreditCard {
	public String number;
	String dueDate;
	protected String secret;
	private String customerName;
	private double balance;
	
	public CreditCard(){
		
	}
	
	public CreditCard(String number) {
		super();
		this.number = number;
	}

	CreditCard( String number, String dueDate, String secret, String custmerName){
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
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	
	public void setSecret(String secret) {
		this.secret = secret;
	}
}
