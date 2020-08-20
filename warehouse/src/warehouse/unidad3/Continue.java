package warehouse.unidad3;

public class Continue {
	public static void main(String[] args) {
		
		//continue
		
		for(int i = 0 ; i < 100; i++) {
			if(i % 10 == 0) {
				continue;
			}
			System.out.println("Valir de i = " + i);
		}
	}
}
