package com.vaishnav.productservice.service;

import com.vaishnav.productservice.model.Product;
import com.vaishnav.productservice.repository.ProductRepo;
import lombok.AllArgsConstructor;
import lombok.Value;
import org.springframework.stereotype.Service;

import java.io.PrintStream;
import java.util.List;

@AllArgsConstructor
@Service
public class ProductService {

    private final ProductRepo repo;

    public Product getProductByID(Long id) {
        Product product = repo.findById(id).get();
        return product;
    }
}
