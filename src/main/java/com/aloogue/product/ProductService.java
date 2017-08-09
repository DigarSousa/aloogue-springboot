package com.aloogue.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public Iterable<Product> findByPlace(Long id) {
        return productRepository.findByPlace(id);
    }

    public ResponseEntity delete(Iterable<Product> products) {
        productRepository.delete(products);
        return new ResponseEntity(HttpStatus.OK);
    }
}
