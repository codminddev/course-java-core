package warehouse.unidad5.polimorfismo;

public class BankCard extends BaseCard{
	
	private String dueDate;
	private String secret;
	private boolean block;
	
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
	
	@Override
	public void pay(double amount) {
		System.out.println("BankCard.pay");
		this.balance -= amount;
	}
	
	@Override
	public void buy(double amount) {
		System.out.println("BankCard.buy");
		this.balance += amount;
	}
}
