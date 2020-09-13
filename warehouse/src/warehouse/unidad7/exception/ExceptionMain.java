package warehouse.unidad7.exception;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class ExceptionMain {
	public static void main(String[] args) {
		
		//Long num1 = Long.valueOf("hola mundo");
		
		//int num2 = 10 / 0;
		
		int[] array = new int[10];
		//System.out.println(array[100]);
		
		
		System.out.println("captura dos números");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		try{
			System.out.println("divicion = " + (num1 / num2));
			int num = array[num2];
		}catch(ArithmeticException e) {
			System.out.println("Estas dividiendo entre cero");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Posición del arreglo incorrecta");
		}catch(Exception e) {
			System.out.println("Error no esperado");
		}finally{
			System.out.println("Finally");
		}
		
		System.out.println("fin");
		
		
	}
}
