package warehouse.unidad2;

import java.util.Scanner;

public class SwitchStatement {
	
	public static void main(String[] args) {
		
		/*
		 switch( caseVar ){
		 	case 0:
		 	case 1:
		 	case 2:
		 	case 3:
		 	default:
		 }
	 */
		
		System.out.println("Opciones");
		System.out.println("A-Pizza con peperoni");
		System.out.println("B-Pizza con champiñones");
		System.out.println("C-Pizza con salami");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Que ingredeiente quieres");
		//int number = scanner.nextInt();
		String letra = scanner.nextLine();
		
		String option = switch(letra) {
		case "A":
			yield "Peperoni";
		case "B":
			yield "Champiñones";
		case "C":
			yield "Salami";
		default:
			yield "Opción incorrecta";
		};
		System.out.println(option);
		
		/*
		switch(number) {
		case 0:
			System.out.println("El número es cero");
			
			if(number == 0) {
				System.out.println("El número es cero");
			}
			
			break;
		case 1:
			System.out.println("El número es uno");
			break;
		default:
			System.out.println("Número no determinado");	
		}
		*/
		
		System.out.println("FIN");
	}
}
