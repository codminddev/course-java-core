package warehouse.unidad5.interfeces;

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
	public void block() {
		this.block = true;
	}
}
