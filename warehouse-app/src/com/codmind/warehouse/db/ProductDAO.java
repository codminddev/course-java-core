package com.codmind.warehouse.db;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.codmind.warehouse.domain.Product;

public class ProductDAO {
	
	private Map<Long, Product> products = new HashMap<>();
	
	public ProductDAO() {
		for(int c = 1; c <= 10; c++) {
			Product product = new Product();
			product.setId(c);
			product.setName("Producto " + c);
			product.setPrice(c * 100);
			products.put(Long.valueOf(c), product);
		}
	}

	// Busqueda por un solo producto
	public Product findById(long productId) {
		Product product = this.products.get(productId);
		return product;
	}
	
	// Busca todos los productos
	public List<Product> findAll(){
		List<Product> products = new ArrayList<Product>(this.products.values());
		return products;
	}
	
	// Agrega un nuevo producto (creación o actualización)
	public void saveProduct(Product product) {
		this.products.put(product.getId(), product);
	}
	
	// Elimina un producto existente
	public void deleteProduct(long productId) {
		this.products.remove(productId);
	}
	
	
}
