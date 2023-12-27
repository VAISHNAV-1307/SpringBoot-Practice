package com.vaishnav.userservice.service;

import com.vaishnav.userservice.model.Product;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class UserService {

    private final RestTemplate restTemplate;

    public Product getProductById(Long id) {

        // by using rest template
        Product product = restTemplate.getForObject("http://product/v1/products/getProducts/{id}", Product.class, id);
        return product;

        // by using service registry

    }
}
