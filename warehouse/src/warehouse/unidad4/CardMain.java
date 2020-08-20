package warehouse.unidad4;

public class CardMain {

	public static void main(String[] args) {
		Card visa = new Card();
		visa.customerName = "Oscar Blancarte";
		visa.dueDate = "10/20";
		visa.number = "1234 5678 9012 3456";
		visa.secret = "123";
		visa.buy(1000);
		visa.pay(300);
		System.out.println("visa => " + visa.getBalance());
		
		Card amex = new Card();
		amex.customerName = "Juan Perez";
		amex.dueDate = "11/30";
		amex.number = "0987 5432 1098 7654";
		amex.secret = "7654";
		System.out.println("amex => " + amex.number);
		
		Card mastercard = new Card( 
				"0987 43534 4674 4377", 
				"11/31", 
				"123",
				"Emanuel Lopez");
		
		Card dummyCard = new Card("0987 43534 4674 4377");
		
		System.out.println("mastercard => " + mastercard.number);
	}
}
