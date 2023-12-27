package com.vaishnav.userservice.controller;

import com.vaishnav.userservice.model.Product;
import com.vaishnav.userservice.service.UserService;
import lombok.AllArgsConstructor;
import org.apache.catalina.LifecycleState;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("v1/users")
@AllArgsConstructor
public class UserController {

    private final UserService service;
    @GetMapping("/getProducts/{id}")
    public Product getProductsById(@PathVariable Long id){
        return service.getProductById(id);
    }
}
