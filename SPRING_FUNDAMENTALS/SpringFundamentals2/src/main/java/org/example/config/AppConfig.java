package org.example.config;

import org.example.controllers.ProductController;
import org.example.services.ProductService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public ProductController productController() {
        return new ProductController(productService());
    }

    @Bean
    public ProductService productService() {
        return new ProductService();
    }
}
