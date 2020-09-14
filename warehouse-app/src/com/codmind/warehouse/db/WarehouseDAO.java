package com.codmind.warehouse.db;

import java.util.HashMap;
import java.util.Map;

import com.codmind.warehouse.domain.Warehouse;
import com.codmind.warehouse.domain.WarehouseItem;

public class WarehouseDAO {
	
	private Map<Long, Warehouse> warehouses = new HashMap<>();
	private ProductDAO productDao = new ProductDAO();
	
	public WarehouseDAO() {
		Warehouse warehouse1 = new Warehouse();
		warehouse1.setId(1L);
		warehouse1.setName("Alamacén 1");
		warehouse1.addItem(new WarehouseItem(
				productDao.findById(1L), 
				10, 
				5));
		warehouse1.addItem(new WarehouseItem(
				productDao.findById(2L), 
				20, 
				10));
		warehouse1.addItem(new WarehouseItem(
				productDao.findById(3L), 
				50, 
				100));
		this.warehouses.put(1L, warehouse1);
		
		Warehouse warehouse2 = new Warehouse();
		warehouse2.setId(2L);
		warehouse2.setName("Alamacén 2");
		warehouse2.addItem(new WarehouseItem(
				productDao.findById(5L), 
				10, 
				5));
		warehouse2.addItem(new WarehouseItem(
				productDao.findById(6L), 
				100, 
				200));
		warehouse2.addItem(new WarehouseItem(
				productDao.findById(7L), 
				300, 
				1000));
		this.warehouses.put(2L, warehouse2);
	}

	
	public Warehouse findById(long warehouseId) {
		Warehouse warehouse = warehouses.get(warehouseId);
		return warehouse;
	}
}
