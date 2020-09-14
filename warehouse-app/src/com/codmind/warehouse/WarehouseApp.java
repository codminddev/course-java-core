package com.codmind.warehouse;

import java.util.Scanner;

import com.codmind.warehouse.controler.FlowControlers;
import com.codmind.warehouse.db.ProductDAO;
import com.codmind.warehouse.db.WarehouseDAO;

public class WarehouseApp {
	
	static ProductDAO dao = new ProductDAO();
	
	public static void main(String[] args) {
		
		dao.findById(1);
		
		FlowControlers controls = new FlowControlers();
		
		Scanner scan = new Scanner(System.in); 
		
		
		System.out.println("Sistema de almacén");
		System.out.println("Selecciones la operación a realizar");
		
		int option = 0;
		
		do {
			
			System.out.println("1 - Listar inventario");
			System.out.println("2 - Costo del almacén");
			System.out.println("3 - Agregar al inventario");
			System.out.println("4 - Remover del inventario");
			System.out.println("5 - Transferir entre almacén");
			System.out.println("0 - Salir");
			
			option = scan.nextInt();
			
			System.out.println("Valor de option = " + option);
			
			switch (option) {
				case 0: {
					System.out.println("Bye!!");
					System.exit(0);
					break;
				}
				case 1: {
					controls.listInventory();
					break;
				}
				case 2: {
					controls.costIventory();
					break;
				}
				case 3: {
					controls.addInventory();
					break;
				}
				case 4: {
					controls.removeInventory();
					break;
				}
				case 5: {
					controls.transferInventory();
					break;
				}
				default:{
					System.out.println("Opción incorrecta");
				}
				
			}
			
			
		}while(option != 0);
		
		System.out.println("Fin");
		
		
	}
	
	
}
