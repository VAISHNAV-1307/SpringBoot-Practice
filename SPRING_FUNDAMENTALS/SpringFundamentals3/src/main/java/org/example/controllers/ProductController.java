package org.example.controllers;

import org.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class ProductController {

    @Autowired
    @Qualifier("amazon")
    private ProductService productService;


}
