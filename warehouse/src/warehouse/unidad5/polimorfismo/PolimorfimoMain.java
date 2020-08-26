package warehouse.unidad5.polimorfismo;

public class PolimorfimoMain {
	public static void main(String[] args) {
		
		
		ICard bankCard = createBankCard();
		ICard gifCard = createGifCard();
		
		System.out.println("bankCard.balance > " + bankCard.getBalance());
		System.out.println("gifCard.balance > " + gifCard.getBalance());
		
		bankCard.buy(100);
		gifCard.buy(100);
		
		System.out.println("bankCard.balance > " + bankCard.getBalance());
		System.out.println("gifCard.balance > " + gifCard.getBalance());
		
	}
	
	public static ICard createBankCard() {
		BankCard bankCard = new BankCard();
		bankCard.setBalance(1000);
		bankCard.setCustomerName("Oscar Blancarte");
		bankCard.setDueDate("10/20");
		bankCard.setNumber("1234567890123456");
		bankCard.setSecret("123");
		return bankCard;
	}
	
	public static ICard createGifCard() {
		GifCard gifCard = new GifCard();
		gifCard.setBalance(1000);
		gifCard.setCustomerName("Oscar Blancarte");
		gifCard.setEndDate("31/12/2020");
		gifCard.setNumber("1234567890");
		gifCard.setStartDate("01/12/2020");
		gifCard.setStore("Tienda A");
		return gifCard;
	}
	
}
