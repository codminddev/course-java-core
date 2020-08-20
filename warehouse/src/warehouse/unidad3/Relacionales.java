package warehouse.unidad3;

public class Relacionales {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		int c = 10;
		
		System.out.println("a == b " + (a == b));
		System.out.println("a == c " + (a == c));
		
		System.out.println("a != b " + (a != b));
		System.out.println("a != c " + (a != c));
		
		System.out.println("a < b " + (a < b));
		System.out.println("a < c " + (a < c));
		
		System.out.println("a <= b " + (a <= b));
		System.out.println("a <= c " + (a <= c));
		
		
		System.out.println("a > b " + (a > b));
		System.out.println("a > c " + (a > c));
		
		System.out.println("a >= b " + (a >= b));
		System.out.println("a >= c " + (a >= c));
		
		if(a > 10) {
			System.out.println("a es mayor que 10");
		}else {
			System.out.println("a es menor o igual que 10");
		}
		
		while( a <= 100) {
			
		}
	}
}
