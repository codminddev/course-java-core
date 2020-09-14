package com.codmind.warehouse.domain;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
	
	private long id;
	private String name;
	private List<WarehouseItem> items = new ArrayList<>();
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<WarehouseItem> getItems() {
		return items;
	}
	public void setItems(List<WarehouseItem> items) {
		this.items = items;
	}
	
	public void addItem(WarehouseItem item) {
		this.items.add(item);
	}
}
