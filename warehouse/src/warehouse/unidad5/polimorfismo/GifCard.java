package warehouse.unidad5.polimorfismo;

public class GifCard extends BaseCard implements ICard{
	
	private String startDate;
	private String endDate;
	private String store;
	
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getStore() {
		return store;
	}
	public void setStore(String store) {
		this.store = store;
	}
	
	@Override
	public void pay(double amount) {
		System.out.println("GifCard.pay");
		this.balance += amount;
	}
	
	@Override
	public void buy(double amount) {
		System.out.println("GifCard.buy");
		this.balance -= amount;
	}
}
