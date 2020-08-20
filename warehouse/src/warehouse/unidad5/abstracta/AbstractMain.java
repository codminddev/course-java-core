package warehouse.unidad5.abstracta;

public class AbstractMain {
	public static void main(String[] args) {
		//BaseCard baseCard = new BaseCard();
		
		BankCard bankCard = new BankCard();
		bankCard.setBalance(1000);
		bankCard.setCustomerName("Oscar Blancarte");
		bankCard.setDueDate("10/20");
		bankCard.setNumber("1234567890123456");
		bankCard.setSecret("123");
		bankCard.buy(1000);
		System.out.println("balance =" + bankCard.getBalance());
		bankCard.pay(100);
		System.out.println("balance =" + bankCard.getBalance());
		bankCard.block();
		
		GifCard gifCard = new GifCard();
		gifCard.setBalance(500);
		gifCard.setCustomerName("Juan Perez");
		gifCard.setEndDate("31/12/2020");
		gifCard.setNumber("1234567890");
		gifCard.setStartDate("01/12/2020");
		gifCard.setStore("Tienda A");
		gifCard.buy(100);
		System.out.println("balance =" + gifCard.getBalance());
		gifCard.pay(100);
		System.out.println("balance =" + gifCard.getBalance());
		gifCard.block();
		
	}
}
