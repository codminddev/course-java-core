package warehouse.unidad3;

public class Break {
	public static void main(String[] args) {
		//break
		
		for(int i = 1; i <= 100 ; i++) {
			if(i % 10 == 0) {
				System.out.println("Mutiplo de 10 > " + i);
				break;
			}
			System.out.println("i = " + i);
		}
		System.out.println("FIN");
	}
}
