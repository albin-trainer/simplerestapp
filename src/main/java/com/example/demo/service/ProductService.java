package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Product;

public interface ProductService {
Product addNewProduct(Product p );
List<Product> allProducts();
}
