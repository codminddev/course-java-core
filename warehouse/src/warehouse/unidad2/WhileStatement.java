package warehouse.unidad2;

import java.util.Scanner;

/*
Esta clase es para comprobar como funciona la instruccón While
Esta es una clase de la segunda unidad
El while nos permite ejecutar varias veces un bloque de código, hasta
que una condición se deje de cumplir
*/
public class WhileStatement {

	
	public static void main(String[] args) {
		// La clase scanner permite capturar valores desde el teclado
		// Esta clase es parte del Core de Java
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Captura un número:");
		int number = scanner.nextInt();
		
		/*
		while( number != 0 ) {
			System.out.println("Número es diferente de 0");
			
			System.out.println("Captura un número:");
			number = scanner.nextInt();
		}
		*/
		
		System.out.println("Fin");
	}
}
