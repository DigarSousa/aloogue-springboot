package com.aloogue.service;

import com.aloogue.model.product.Product;
import com.aloogue.model.product.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Iterable<Product> saveProduct(Iterable<Product>products) {
        return productRepository.save(products);
    }

    public Iterable<Product> findByPlace(Long id){
        return productRepository.findByPlace(id);
    }

    public ResponseEntity delete(Iterable<Product> products) {
        productRepository.delete(products);
        return new ResponseEntity(HttpStatus.ACCEPTED);
    }
}
