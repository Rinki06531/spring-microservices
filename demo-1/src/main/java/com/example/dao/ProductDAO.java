package com.example.dao;

import java.util.List;

import com.example.model.Product;
import org.springframework.web.bind.annotation.PathVariable;

public interface ProductDAO {
	public List<Product> getAllProduct();
	public Product createProduct(Product product);
	public Product getProductById(@PathVariable int id);
	public void removeProduct(@PathVariable int id);

}
