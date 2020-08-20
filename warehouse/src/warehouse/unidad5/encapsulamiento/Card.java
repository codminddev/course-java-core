package warehouse.unidad5.encapsulamiento;


public class Card {
	private String number;
	private String dueDate;
	private String secret;
	private String customerName;
	private double balance;
	
	public void pay(double amount) {
		if(amount <= 0 ) {
			throw new RuntimeException("Monto invalido");
		}
		balance -= amount;
	}
	
	public void buy(double amount) {
		balance += amount;
	}
	
	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public String getSecret() {
		return secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
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

	public String getNumber() {
		return number;
	}
	
	public void setNumber(String number) {
		if(number.length() != 16 ) {
			System.out.println("Número invalido");
			return;
		}
		this.number = number;
	}
}
