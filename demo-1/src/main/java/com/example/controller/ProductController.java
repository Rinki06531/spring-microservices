package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.model.Product;
import com.example.service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductController {
	private ProductService productService;

	@Autowired
	public ProductController(ProductService productService) {
		super();
		this.productService = productService;
	}
	
	@GetMapping("/products")
	public ResponseEntity<List<Product>> getAllProducts()
	{
		return ResponseEntity.ok(productService.getAllProduct());
	}

	@PostMapping("/products")
	public ResponseEntity<Product> createProduct(@RequestBody Product product){

		return ResponseEntity.ok(productService.createProduct(product));
	}
	@GetMapping("/products/{id}")
	public ResponseEntity<Product> getProductById(@PathVariable int id)
	{
		return ResponseEntity.ok(productService.getProductById(id));
	}

	@DeleteMapping("/products/{id}")
	public ResponseEntity<String> removeProduct(@PathVariable int id)
	{
		productService.removeProduct(id);
		return ResponseEntity.ok("product removed sucessfully with the id "+id);
	}

}
