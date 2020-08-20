package warehouse.unidad2;

import java.util.Scanner;

public class IFStatement {

	public static void main( String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Captura un n�mero:");
		int number = scanner.nextInt();
		
		// > mayor que
		// < menor que
		// == igual
		// != diferente
		if( number > 1000 ) {
			System.out.println("El n�mero es mayor que 1000");
			if(number > 10_000) {
				System.out.println("El n�mero es mayor que 10,000");
			}else {
				System.out.println("El n�mero no es mayor que 10,000");
			}
		}
		else if(number == 1000) {
			System.out.println("El n�mero es igual que 1000");
		}
		else if(number < 0) {
			System.out.println("El n�mero es menor que 0");
		}
		else {
			System.out.println("El n�mero es menor que 1000");
		}
		
	}
}
