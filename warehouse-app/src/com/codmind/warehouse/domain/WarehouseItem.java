package com.codmind.warehouse.domain;

public class WarehouseItem {

	private Product product;
	private double quantity;
	private double minQuantity;
	
	public WarehouseItem(Product product, double quantity, double minQuantity) {
		super();
		this.product = product;
		this.quantity = quantity;
		this.minQuantity = minQuantity;
	}
	
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public double getMinQuantity() {
		return minQuantity;
	}
	public void setMinQuantity(double minQuantity) {
		this.minQuantity = minQuantity;
	}
	
	
}
