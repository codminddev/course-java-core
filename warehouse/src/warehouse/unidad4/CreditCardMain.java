package warehouse.unidad4;

import warehouse.unidad4_1.CreditCard;

public class CreditCardMain {
	
	
	public static void main(String[] args) {
		
		// Puedes utilizar modificadores de acceso en:
		// clases (public, package) > en subclases (private, package, protected, public)
		// propiedades (private, package, protected, public)
		// métodos (private, package, protected, public)
		// constructores (private, package, protected, public)
		
		CreditCard visa = new CreditCard();
		visa.setCustomerName("Oscar Blancarte");
		visa.setDueDate("10/20");
		visa.number = "1234 5678 9012 3456";
		visa.setSecret("123");
		visa.buy(1000);
		visa.pay(300);
		System.out.println("visa => " + visa.getBalance());
		
		
		//System.out.println("mastercard => " + mastercard.number);
	}
}
