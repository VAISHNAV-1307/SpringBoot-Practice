package com.vaishnav.productservice.controller;

import com.vaishnav.productservice.model.Product;
import com.vaishnav.productservice.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("v1/products")
@AllArgsConstructor
public class ProductController {

    private final ProductService service;

    @GetMapping("/getProducts/{id}")
    public Product getProductByID(@PathVariable Long id){
        return service.getProductByID(id);
    }

}
