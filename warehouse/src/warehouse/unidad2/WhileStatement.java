package warehouse.unidad2;

import java.util.Scanner;

/*
Esta clase es para comprobar como funciona la instrucc�n While
Esta es una clase de la segunda unidad
El while nos permite ejecutar varias veces un bloque de c�digo, hasta
que una condici�n se deje de cumplir
*/
public class WhileStatement {

	
	public static void main(String[] args) {
		// La clase scanner permite capturar valores desde el teclado
		// Esta clase es parte del Core de Java
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Captura un n�mero:");
		int number = scanner.nextInt();
		
		/*
		while( number != 0 ) {
			System.out.println("N�mero es diferente de 0");
			
			System.out.println("Captura un n�mero:");
			number = scanner.nextInt();
		}
		*/
		
		System.out.println("Fin");
	}
}
