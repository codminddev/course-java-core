package warehouse.unidad7.exception;

import java.util.Scanner;

public class ThrowMain {
	public static void main(String[] args) {
		
		System.out.println("Captura dos números");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		try {
			double result = dividir(num1, num2);
			System.out.println("resultado = " + result);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fin");
		
	}
	
	public static double dividir(int num1, int num2) throws ZeroException  {
		
		if(num2 == 0) {
			throw new ZeroException("No se puede divir entre cero");
		}
		
		return num1 / num2;
	}
}
