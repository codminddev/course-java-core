package warehouse.unidad5.encapsulamiento;

public class EncapsulamientoMain {
	public static void main(String[] args) {
		Card card = new Card();
		card.setNumber("12345678901234567");
		//card.setBalance(10_000);
		card.setDueDate("10/20");
		card.setSecret("123");
		
		card.buy(10_000);
		System.out.println("Balance=" + card.getBalance());
		
		card.pay(500);
		System.out.println("Balance=" + card.getBalance());
		
		card.pay(-1000);
		System.out.println("Balance=" + card.getBalance());
	}
}
