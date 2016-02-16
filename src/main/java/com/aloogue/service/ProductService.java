package com.aloogue.service;

import com.aloogue.model.product.Product;
import com.aloogue.model.product.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Iterable<Product> saveProduct(Iterable<Product>products) {
        return productRepository.save(products);
    }
}
