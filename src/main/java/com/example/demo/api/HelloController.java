package com.example.demo.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;

@RestController
public class HelloController {
	@Autowired
	private ProductService service;
	@GetMapping("/hello")
public String sayHello() {
	return "<font color=blue size=10>Hello All </font>";
}
	@PostMapping("/products")
	public Product addNewProduct(@RequestBody Product p) {
		return service.addNewProduct(p);
	}
	@GetMapping("/products")
	public List<Product> allProducts() {
		return service.allProducts();
	}
}
