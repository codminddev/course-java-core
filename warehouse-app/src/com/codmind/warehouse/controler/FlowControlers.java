package com.codmind.warehouse.controler;

import java.util.Scanner;

import com.codmind.warehouse.domain.Warehouse;
import com.codmind.warehouse.domain.WarehouseItem;
import com.codmind.warehouse.service.WarehouseService;

public class FlowControlers {
	
	private WarehouseService warehouseService = new WarehouseService();

	public void listInventory() {
		
		System.out.println("Listar inventario");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Indique el almacén que desea listar");
		int warehouseId = scan.nextInt();
		
		Warehouse warehouse = warehouseService.findById(warehouseId);
		
		System.out.println("Almacén : " + warehouse.getName());
		warehouse.getItems().forEach(item -> {
			System.out.println( 
					String.format("Nombre: %s, Cantidad: %s, M. Cantidad: %s", 
							item.getProduct().getName(),
							item.getQuantity(),
							item.getMinQuantity())
					);
		});
		
		
		
	}

	public void costIventory() {
		System.out.println("Costo del almacén");
		System.out.println("¿Que almacén desea consultar?");
		
		Scanner scan = new Scanner(System.in);
		long warehouseId = scan.nextLong();
		
		Warehouse warehouse = warehouseService.findById(warehouseId);
		
		double total = 0;
		
		for(WarehouseItem item : warehouse.getItems()) {
			total += item.getQuantity() * item.getProduct().getPrice();
		}
		
		System.out.println("Almacén: " + warehouse.getName());
		System.out.println("Costo del almacén: " + total);
		
	}


	public void addInventory() {
		System.out.println("Agregar al inventario");
		Scanner scan = new Scanner(System.in);
		
		System.out.println("¿A que almacén desea agregar productos?");
		long warehouseId = scan.nextLong();
		
		System.out.println("¿Qué producto desea agregar?");
		long productId = scan.nextLong();
		
		System.out.println("¿Cuanta cantidad desea agregar?");
		double quantity = scan.nextDouble();
		
		try {
			warehouseService.addInventory(warehouseId, productId, quantity);	
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	
	public void removeInventory() {
		System.out.println("Remover del inventario");
		Scanner scan = new Scanner(System.in);
		
		System.out.println("¿A que almacén desea remover productos?");
		long warehouseId = scan.nextLong();
		
		System.out.println("¿Qué producto desea remover?");
		long productId = scan.nextLong();
		
		System.out.println("¿Cuanta cantidad desea remover?");
		double quantity = scan.nextDouble();
		
		try {
			warehouseService.removeInventory(warehouseId, productId, quantity);	
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	public void transferInventory() {
		System.out.println("Transferir entre almacén");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Seleccione el almacén de salida");
		long outWarehouseId = scan.nextLong();
		
		System.out.println("Seleccione el almacén de entrada");
		long inWarehouseId = scan.nextLong();
		
		System.out.println("¿Qué producto desea transferir?");
		long productId = scan.nextLong();
		
		System.out.println("¿Cuanta cantidad desea transferir?");
		double quantity = scan.nextDouble();
		
		try {
			warehouseService.removeInventory(outWarehouseId, productId, quantity);
			warehouseService.addInventory(inWarehouseId, productId, quantity);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		
	}
}
