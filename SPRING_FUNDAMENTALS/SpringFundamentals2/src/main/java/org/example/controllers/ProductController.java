package org.example.controllers;

import org.example.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductController {

//    @Autowired
//    private ProductService productService;

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    public void addProduct() {
        productService.addProduct();
    }
}
