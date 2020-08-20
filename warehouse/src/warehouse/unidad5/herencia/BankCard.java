package warehouse.unidad5.herencia;

public class BankCard extends BaseCard{
	
	private String dueDate;
	private String secret;
	
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
}
