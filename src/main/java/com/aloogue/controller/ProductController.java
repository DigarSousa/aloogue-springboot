package com.aloogue.controller;


import com.aloogue.model.product.Product;
import com.aloogue.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping(method = RequestMethod.POST)
    public Iterable<Product> saveProduct(@RequestBody Iterable<Product> product) {
        return productService.saveProduct(product);
    }

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Product> findByPlace(@RequestParam Long id) {
        return productService.findByPlace(id);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public ResponseEntity delete(@RequestBody Iterable<Product> products) {
        return productService.delete(products);
    }

}
