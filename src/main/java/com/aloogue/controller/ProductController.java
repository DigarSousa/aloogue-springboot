package com.aloogue.controller;


import com.aloogue.model.product.Product;
import com.aloogue.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping(method = RequestMethod.POST)
    public Iterable<Product> saveProduct(@RequestBody Iterable<Product> product) {
        return productService.saveProduct(product);
    }

}
