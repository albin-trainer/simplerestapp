package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Product;
@Service
public class ProductServiceImpl implements ProductService{
	List<Product> products=new ArrayList<>();
	@Override
	public Product addNewProduct(Product p) {
		products.add(p);
		return p;
	}

	@Override
	public List<Product> allProducts() {
		return products;
	}

}
