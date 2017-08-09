package com.aloogue.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping(method = RequestMethod.POST)
    public Product saveProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

    @RequestMapping(value = "place/{placeId}", method = RequestMethod.GET)
    public Iterable<Product> findByPlace(@PathVariable Long placeId) {
        return productService.findByPlace(placeId);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public ResponseEntity delete(@RequestBody Iterable<Product> products) {
        return productService.delete(products);
    }
}
