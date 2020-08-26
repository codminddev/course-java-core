package warehouse.unidad5.polimorfismo;

public interface ICard {
	public void setNumber(String String);
	public String getNumber();
	
	public void setCustomerName(String customerName);
	public String getCustomerName();
	
	public void setBalance(double balance);
	public double getBalance();
	
	
	public void pay(double amount);
	public void buy(double amount);
}
