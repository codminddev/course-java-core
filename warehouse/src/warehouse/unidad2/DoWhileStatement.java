package warehouse.unidad2;

import java.util.Scanner;

public class DoWhileStatement {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int number;
		
		do {
			System.out.println("Captura un n�mero:");
			number = scanner.nextInt();
			
			System.out.println("N�mer => " + number);
		}while( number != 0);
		
		System.out.println("Fin");
	}
}
