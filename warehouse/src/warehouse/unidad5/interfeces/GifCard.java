package warehouse.unidad5.interfeces;

import java.lang.Object;

public class GifCard extends BaseCard{
	
	private String startDate;
	private String endDate;
	private String store;
	
	@Override
	public void pay(double amount) {
		throw new RuntimeException("No es posible aceptar pagos");
	}
	
	@Override
	public void buy(double amount) {
		this.balance -= amount;
	}
	
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
	public void block() {
		
	}
}
