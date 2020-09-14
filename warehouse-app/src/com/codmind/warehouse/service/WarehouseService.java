package com.codmind.warehouse.service;

import com.codmind.warehouse.db.ProductDAO;
import com.codmind.warehouse.db.WarehouseDAO;
import com.codmind.warehouse.domain.Product;
import com.codmind.warehouse.domain.Warehouse;
import com.codmind.warehouse.domain.WarehouseItem;
import com.codmind.warehouse.exception.ValidateServiceException;

public class WarehouseService {
	
	private WarehouseDAO warehouseDao = new WarehouseDAO();
	private ProductDAO productDao = new ProductDAO();
	
	public Warehouse findById(long warehouseId) {
		return warehouseDao.findById(warehouseId);
	}
	
	public void addInventory(long warehouseId, long productId, double quantity) throws ValidateServiceException {
		
		Warehouse warehouse = warehouseDao.findById(warehouseId);
		if(warehouse == null) throw new ValidateServiceException("No existe el almacén");
		
		
		Product product = productDao.findById(productId);
		if(product == null) throw new ValidateServiceException("No existe el producto");

		for(WarehouseItem item : warehouse.getItems()) {
			if(item.getProduct().getId() == productId) {
				item.setQuantity(item.getQuantity() + quantity);
				System.out.println("Nueva cantidad = " + item.getQuantity());
				return;
			}
		}
		
		// producto no esta en el almacén
		
		WarehouseItem item = new WarehouseItem(product, quantity, 10);
		warehouse.addItem(item);
		System.out.println("Nueva cantidad = " + quantity);
	} 
	
	
	public void removeInventory(long warehouseId, long productId, double quantity) throws ValidateServiceException {
		Warehouse warehouse = warehouseDao.findById(warehouseId);
		if(warehouse == null) throw new ValidateServiceException("No existe el almacén");
		
		
		Product product = productDao.findById(productId);
		if(product == null) throw new ValidateServiceException("No existe el producto");
		
		for(WarehouseItem item : warehouse.getItems()) {
			if(item.getProduct().getId() == productId) {
				if(item.getQuantity() - quantity < 0) throw new ValidateServiceException("Cantidad insuficiente");
				item.setQuantity(item.getQuantity() - quantity);
				System.out.println("Nueva cantidad = " + item.getQuantity());
				return;
			}
		}
		
		throw new ValidateServiceException("No existe el producto en el almacén");
		
	}
}
