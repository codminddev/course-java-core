package warehouse.unidad2;

import java.util.Scanner;

public class ForStatement {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Captura un número");
		int iteraciones = scanner.nextInt();
		
		// i = i + 1;
		for( int i = 1 ; true ; i++ ) {
			System.out.println("hola mundo " + i);
		}
		
		//System.out.println("FIN");
	}
}
