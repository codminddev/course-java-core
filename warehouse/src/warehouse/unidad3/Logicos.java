package warehouse.unidad3;

public class Logicos {
	public static void main(String[] args) {
		
		// &&
		// ||
		// !
		
		int a = 10;
		int b = 20;
		
		if(a > 9 && b == 21) {
			System.out.println("Se cumplio la validación");
		}else {
			System.out.println("No cumplio la validación");
		}
		
		System.out.println("Result => " + (a > 9 && b == 21));
		
		
		if(a == 11 || b == 21) {
			System.out.println("Se cumplio la validación");
		}else {
			System.out.println("No cumplio la validación");
		}
		
		//a == 11 -> false ! -> true
		if( a == 11 || !(b == 21) ) {
			System.out.println("Se cumplio la validación");
		}else {
			System.out.println("No cumplio la validación");
		}
		
		System.out.println("! " + !(true));
		System.out.println("! " + !(false));
		
	}
}
